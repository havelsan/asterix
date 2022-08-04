package application;


import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class Main {
    public static void main(String[] args) {
        XStream xStream = new XStream(new StaxDriver()){


        };
    }
}
