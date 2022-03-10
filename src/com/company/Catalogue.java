package com.company;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {

    private List<Item> comChest = new ArrayList<Item>();

    public Item findItem(String category, String itemName) {
        for (int i = 0; i < (comChest.size()); i++) {                /// An ArrayList has .size() method, instead of .length
            String queryItem = (Item.getDescription());
            if (queryItem.equals(itemName)) {
                return comChest.get(i);                             // and has a different accessor, says IntelliJ
                break;
            }
        }return null;
    }

    public void addItem(String itemCategory, String itemName) {
        Item articleToAdd = findItem(itemCategory, itemName);
        this.comChest.add(articleToAdd);
    }
    public void borrowItem(Item extractedItem) {
        extractedItem.setAvailable();
    }
    public void getAvailableItems() {

    }
    public void getFullList() {

    }
}
