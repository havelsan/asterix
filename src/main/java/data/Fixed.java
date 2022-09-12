package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("Fixed")
public class Fixed {

    @XStreamAlias("length")
    @XStreamAsAttribute
    private String length;

    @XStreamImplicit(itemFieldName = "Bits")
    private List<Bits> bits;

    public String getItem() {
        String string = "Fixed: length:" + length + " ";
        for (Bits bits1: bits){
            string += bits1.getItem();
        }
        return "[" + string + "]";
    }

    public List<Bits> getBits() {
        return bits;
    }

    public String getLength() {
        return length;
    }

    public Fixed(String length, List<Bits> bits) {
        this.length = length;
        this.bits = bits;
    }
}
