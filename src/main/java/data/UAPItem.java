package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter;

@XStreamAlias("UAPItem")
@XStreamConverter(value = ToAttributedValueConverter.class, strings = {"element"})
public class UAPItem {

    @XStreamAsAttribute
    @XStreamAlias("bit")
    private int bit;

    @XStreamAlias("frn")
    @XStreamAsAttribute
    private String frn;

    @XStreamAsAttribute
    @XStreamAlias("len")
    private String len;

    private String element;

    public String getItem() {
        return "UAPItem: bit: " + bit + " frn: " + frn + " len: " + len + " element: " + element;
    }

    public int getBit() {
        return bit;
    }

    public String getFrn() {
        return frn;
    }

    public String getLen() {
        return len;
    }

    public String getElement() {
        return element;
    }


}
