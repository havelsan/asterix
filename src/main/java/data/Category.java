package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("Category")
public class Category {

    @XStreamAsAttribute
    @XStreamAlias("id")
    private String id;

    @XStreamAsAttribute
    @XStreamAlias("name")
    private String name;

    @XStreamAsAttribute
    @XStreamAlias("ver")
    private String ver;

    @XStreamImplicit(itemFieldName = "DataItem")
    private List<DataItem> dataItems;

    @XStreamAlias("UAP")
    private UAP uap;

    public int getItemListLen(){
        return dataItems.size();
    }

    public String getItems(){
        String string = "Category: ";
        string += "id: " + id + " name: " + name + " ver: " + ver + "\n\n";
//        for (DataItem dataItem: dataItems){
//            string += dataItem.getItems() + "\n\n";
//        }
        string += uap.getItems();

        return string;
    }

    public UAP getUap(){
        return this.uap;
    }

    public List<DataItem> getDataItems() {
        return dataItems;
    }
}
