package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("UAP")
public class UAP {

    @XStreamImplicit(itemFieldName = "UAPItem")
    private List<UAPItem> uapItems;
}
