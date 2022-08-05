package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("BitsValue")
public class BitsValue {

    @XStreamAsAttribute
    @XStreamAlias("val")
    private String val;
}
