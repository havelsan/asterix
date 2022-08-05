package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("Bits")
public class Bits {

    @XStreamAsAttribute
    @XStreamAlias("from")
    private String from;

    @XStreamAlias("to")
    @XStreamAsAttribute
    private String to;

    @XStreamAlias("bit")
    @XStreamAsAttribute
    private String bit;

    @XStreamAlias("fx")
    @XStreamAsAttribute
    private String fx;

    @XStreamAlias("encode")
    @XStreamAsAttribute
    private String encode;

    @XStreamAlias("BitsShortName")
    private String BitsShortName;

    @XStreamAlias("BitsName")
    private String BitsName;

    @XStreamAlias("BitsConst")
    private String BitsConst;

    @XStreamAlias("BitsPresence")
    private String BitsPresence;

    @XStreamImplicit(itemFieldName = "BitsValue")
    private List<BitsValue> bitsValues;

    @XStreamImplicit(itemFieldName = "BitsUnit")
    private List<BitsUnit> bitsUnits;

}
