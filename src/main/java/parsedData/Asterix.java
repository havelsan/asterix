package parsedData;


import data.Category;
import data.DataItem;
import data.UAPItem;
import shared.BitOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Asterix {
    private short length;
    private List<Integer> fspec;
    private List<Integer> data;
    private Category category;
    private List<DataItem> dataItems;
    private BitOperator bitOperator;

    public Asterix(short length, List<Integer> fspec, List<Integer> data, Category category) {
        this.length = length;
        this.fspec = fspec;
        this.data = data;
        this.category = category;
        this.bitOperator  = new BitOperator();
        this.setDataItems();
    }

    public List<Integer> getFspec() {
        return fspec;
    }

    public void setFspec(List<Integer> fspec) {
        this.fspec = fspec;
    }

    public short getLength() {
        return length;
    }

    public void setLength(short length) {
        this.length = length;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

    public Category getCategory() { return category; }

    public void setCategory(Category category) { this.category = category; }

    public List<DataItem> getDataItems() { return dataItems; }

    public void setDataItems() {
        List<DataItem> dataItemList = category.getDataItems();
        List<DataItem> dataItems = new ArrayList<>();
        for (int i = 0; i < fspec.size(); i++){
            int fspecInt = fspec.get(i);
            for (int j = 7; j >= 0; j--){
                int bit = bitOperator.getBit(j, fspecInt);
                if (bit == 1){
                    String element = this.category.getUap().getUapItem(7 - j + (i*8)).getElement();
                    for (DataItem dataItem: dataItemList){
                        if(Objects.equals(dataItem.getId(), element)){
                            dataItems.add(dataItem);
                        }
                    }
                }
            }
        }
        this.dataItems = dataItems;
    }


}
