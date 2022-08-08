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

    public String getItem(){
        StringBuilder string = new StringBuilder("DataItemFormat: " + desc);
        String compoundGetItem;
        String variableGetItem;
        try{
            compoundGetItem = compound.getItem();
        }catch (Exception e){
            compoundGetItem = null;
        }
        try{
            variableGetItem = variable.getItem();
        }catch (Exception e){
            variableGetItem = null;
        }
        string.append("\nCompound: ").append(compoundGetItem).append("\nvariable: ").append(variableGetItem).append("\n");
        try{
            for (Fixed fixed: fixedList){
                string.append(fixed.getItem());
            }
        }catch (Exception e){
            string.append("fixed: null");
        }



        return string.toString();
    }
}
