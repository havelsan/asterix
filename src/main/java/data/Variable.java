package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("Variable")
public class Variable {

    @XStreamImplicit(itemFieldName = "Fixed")
    private List<Fixed> fixedList;
}
