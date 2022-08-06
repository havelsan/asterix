package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("DataItemFormat")
public class DataItemFormat {

    @XStreamAlias("desc")
    @XStreamAsAttribute
    private String desc;

    @XStreamAlias("Compound")
    private Compound compound;

    @XStreamAlias("Variable")
    private Variable variable;

    @XStreamImplicit(itemFieldName = "Fixed")
    private List<Fixed> fixedList;
}
