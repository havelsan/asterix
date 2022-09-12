package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("Variable")
public class Variable {

    @XStreamImplicit(itemFieldName = "Fixed")
    private List<Fixed> fixedList;

    public String getItem() {
        String string = "Variable: ";
        for (Fixed fixed: fixedList){
            string += fixed.getItem() + " ";
        }
        return string;
    }

    public Variable(List<Fixed> fixedList) {
        this.fixedList = fixedList;
    }

    public List<Fixed> getFixedList() {
        return fixedList;
    }
}
