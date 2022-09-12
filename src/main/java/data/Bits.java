package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("Bits")
public class Bits {

    @XStreamAsAttribute
    @XStreamAlias("from")
    private int from;

    @XStreamAlias("to")
    @XStreamAsAttribute
    private int to;

    @XStreamAlias("bit")
    @XStreamAsAttribute
    private int bit;

    @XStreamAlias("fx")
    @XStreamAsAttribute
    private int fx;

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

    private int value;

    public String getItem() {
        StringBuilder string = new StringBuilder("from: " + from + " to: " + to + " bit: " + bit + " fx: " + fx + " encode:" + encode +
                " BitsShortName:" + BitsShortName + " BitsName:" + BitsName + " BitsConst:" + BitsConst +
                " BitsPresence: " + BitsPresence + " ");
        try{
            for (BitsValue bitsValue: bitsValues){
                string.append(bitsValue.getItem());
            }
        }catch (Exception e){
            string.append(" bitsValue: null");
        }
        try{
            for (BitsUnit bitsUnit: bitsUnits){
                string.append(bitsUnit.getItem());
            }
        }catch (Exception e){
            string.append(" bitsUnit: null");
        }

        return string.toString();
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public int getBit() {
        return bit;
    }

    public int getFx() {
        return fx;
    }

    public String getEncode() {
        return encode;
    }

    public String getBitsShortName() {
        return BitsShortName;
    }

    public String getBitsName() {
        return BitsName;
    }

    public String getBitsConst() {
        return BitsConst;
    }

    public String getBitsPresence() {
        return BitsPresence;
    }

    public List<BitsValue> getBitsValues() {
        return bitsValues;
    }

    public List<BitsUnit> getBitsUnits() {
        return bitsUnits;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Bits(int from, int to, Integer bit, int fx) {
        this.from = from;
        this.to = to;
        this.bit = bit;
        this.fx = fx;
    }

}
