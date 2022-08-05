package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("Compound")
public class Compound {

    @XStreamAlias("Variable")
    private Variable variable;

    @XStreamAlias("Repetitive")
    private Repetitive repetetive;

    @XStreamImplicit(itemFieldName = "Fixed")
    private List<Fixed> fixedList;

}
