package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter;

@XStreamAlias("BitsUnit")
@XStreamConverter(value = ToAttributedValueConverter.class, strings = {"unit"})
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

    private String unit;


    public String getItem() {
        return " BitsUnit: scale: " + scale + " min: " + min + " max: " + max + " unit: " + unit;
    }
}
