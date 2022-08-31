package application;


import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.converters.basic.IntConverter;
import com.thoughtworks.xstream.converters.basic.StringConverter;
import com.thoughtworks.xstream.converters.collections.CollectionConverter;
import com.thoughtworks.xstream.converters.reflection.ReflectionConverter;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;
import data.Category;
import data.DataItem;
import parsedData.Asterix;
import shared.BitOperator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        BitOperator bitOperator = new BitOperator();

        XStream xStream = new XStream(new StaxDriver()){
            @Override
            protected void setupConverters() {
            }
        };
        xStream.registerConverter(new ReflectionConverter(xStream.getMapper(), xStream.getReflectionProvider()), XStream.PRIORITY_VERY_LOW);
        xStream.registerConverter(new IntConverter(), XStream.PRIORITY_NORMAL);
        xStream.registerConverter(new StringConverter(), XStream.PRIORITY_NORMAL);
        xStream.registerConverter(new CollectionConverter(xStream.getMapper()), XStream.PRIORITY_NORMAL);;

        xStream.addPermission(AnyTypePermission.ANY);
        xStream.processAnnotations(Category.class);

        String atHome = "resources\\asterix_cat062_1_18.xml";
        String atWork = "resources\\asterix_cat062_1_18.xml";
        Category object = null;
        try{
            object = (Category) xStream.fromXML(new File(atHome));
        }catch (Exception e){
            object = (Category) xStream.fromXML(new File(atWork));
        }
        System.out.println(object.getItems());

        DataInputStream dis;
        try {
            FileInputStream fis = new FileInputStream("samples\\described\\58.astfin");
            dis = new DataInputStream(fis);
            List<Integer> integers = new ArrayList<Integer>();
            List<String> stringList = new ArrayList<>();
            String s = "";
            try{
                while(true){
                    int b = dis.readUnsignedByte();
                    integers.add(b);
                    for (int j = 7; j >= 0; j--){
                        int i = bitOperator.getBit(j, b);
                        s += i;
                    }
                    stringList.add(s);
                    s = "";
                }

            }catch (Exception e){
                for(int i = 0; i < integers.size(); i++){
                    System.out.print(integers.get(i));
                    System.out.print(" ");
                    System.out.print(stringList.get(i));
                    System.out.print("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //reading the file and turn it into asterix object
        dis = null;
        Asterix asterix = null;
        try{
            FileInputStream fis = new FileInputStream("samples\\described\\58.astfin");
            dis = new DataInputStream(fis);
            try{
                short length = (short) dis.readUnsignedShort();
                dis.skipBytes(6);
                if(dis.readUnsignedByte() != 62){
                    throw new RuntimeException("The file is not encoded in Asterix 62 format.");
                }
                dis.skipBytes(2);

                List<Integer> fspec = new ArrayList<>();
                List<Integer> data = new ArrayList<>();

                boolean lsb = true;
                while (lsb){
                    int b = dis.readUnsignedByte();
                    lsb = bitOperator.getBit(0, b) == 1;
                    fspec.add(b);
                }


                int count = 0;
                while (count < 4){
                    int b = dis.readUnsignedByte();
                    if (b == 165){
                        count++;
                    }else{
                        count = 0;
                    }
                    data.add(b);
                }
                for(int i = 0; i < 4; i++){
                    data.remove(data.size() - 1);
                }


                asterix = new Asterix(length, fspec, data, object);
            }catch (Exception e){
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
