package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("DataItem")
public class DataItem {

    @XStreamAsAttribute
    @XStreamAlias("id")
    private String id;

    @XStreamAsAttribute
    @XStreamAlias("rule")
    private String rule;

    @XStreamAlias("DataItemName")
    private String dataItemName;

    @XStreamAlias("DataItemDefinition")
    private String dataItemDefinition;

    @XStreamAlias("DataItemFormat")
    private DataItemFormat dataItemFormat;

    @XStreamAlias("DataItemNote")
    private String dataItemNote;

    public String getItems() {
        String string = "DataItem: ";
        string += "id: " + id + " rule: " + rule + "\ndataItemName: " + dataItemName + "\ndataItemDefinition: " +
                dataItemDefinition + "\ndataItemNote: " + dataItemNote + "\n" + dataItemFormat.getItem();
        return string;
    }

    public String getId() {
        return id;
    }
}
