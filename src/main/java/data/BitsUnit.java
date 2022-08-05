package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("BitsUnit")
public class BitsUnit {

    @XStreamAsAttribute
    @XStreamAlias("scale")
    private String scale;

    @XStreamAlias("min")
    @XStreamAsAttribute
    private String min;

    @XStreamAlias("max")
    @XStreamAsAttribute
    private String max;


}
