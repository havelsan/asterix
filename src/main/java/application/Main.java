package application;


import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import data.Category;

import java.io.File;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        XStream xStream = new XStream(new StaxDriver());

        xStream.processAnnotations(Category.class);

        Object object = xStream.fromXML(new File("C:\\Users\\Ahmet Bera\\Desktop\\havelsan\\asterix\\resources\\asterix_cat062_1_18.xml"));

        System.out.println(object);
    }
}
