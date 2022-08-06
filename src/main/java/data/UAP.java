package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("UAP")
public class UAP {

    @XStreamImplicit(itemFieldName = "UAPItem")
    private List<UAPItem> uapItems;

    public String getItems() {
        String string = "UAP: ";
        for (UAPItem uapItem: uapItems){
            string += uapItem.getItem() + "\n\t\t";
        }

        return string;
    }
}
