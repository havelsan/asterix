package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("UAPItem")
public class UAPItem {

    @XStreamAsAttribute
    @XStreamAlias("bit")
    private String bit;

    @XStreamAlias("frn")
    @XStreamAsAttribute
    private String frn;

    @XStreamAsAttribute
    @XStreamAlias("len")
    private String len;
}
