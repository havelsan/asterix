package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("Compound")
public class Compound {

    @XStreamAlias("Variable")
    private Variable variable;

    @XStreamImplicit(itemFieldName = "Repetitive")
    private List<Repetitive> repetitiveList;

    @XStreamImplicit(itemFieldName = "Fixed")
    private List<Fixed> fixedList;

    public String getItem() {
        String string = "Compund: ";
        try{
            string += variable.getItem();
        }catch (Exception e){
            string += "variable: null";
        }

        try{
            for (Repetitive repetitive: repetitiveList){
                string += repetitive.getItem() + "\n";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            for (Fixed fixed: fixedList){
                string += fixed.getItem();
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        return string;
    }
}
