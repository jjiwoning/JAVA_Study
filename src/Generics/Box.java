package Generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private T item;

    private List<T> itemList = new ArrayList<>();

    public List<T> getItemList() {
        return itemList;
    }

    public void setItemList(List<T> itemList) {
        this.itemList = itemList;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
