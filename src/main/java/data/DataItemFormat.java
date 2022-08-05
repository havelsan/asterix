package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DataItemFormat")
public class DataItemFormat {

    @XStreamAlias("desc")
    @XStreamAsAttribute
    private String desc;

    @XStreamAlias("Compound")
    private Compound compound;

    @XStreamAlias("Variable")
    private Variable variable;

}
