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

import java.io.File;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

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
    }
}
