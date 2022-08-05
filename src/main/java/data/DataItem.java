package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

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
}
