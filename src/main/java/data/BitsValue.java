package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter;

@XStreamAlias("BitsValue")
@XStreamConverter(value = ToAttributedValueConverter.class, strings = {"content"})
public class BitsValue {

    @XStreamAsAttribute
    @XStreamAlias("val")
    private String val;

    private String content;

    public String getItem() {
        return " BitsValue: " + val + " content: " + content;
    }
}
