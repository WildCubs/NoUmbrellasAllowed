package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Catalogue {

    public List<Item> comChest = new ArrayList<Item>();             // DAMN IT, I surrender

    public Item findItem(String itemName) {
        for (int i = 0; i < (comChest.size()); i++) {               // An ArrayList has .size() method, instead of .length
            String queryItem = (comChest.get(i).getDescription());
            if (queryItem.equals(itemName)) {
                return comChest.get(i);                             // and has a different accessor, says IntelliJ
            }
        }
        return null;
    }
                                    // This one annoyed me
    public void addItem(Item thing) {
        this.comChest.add(thing);
    }
                                    // I need to point at the item with the changing property
    public void borrowOrReturnItem(Item found) { found.toggleAvailable(); }

    public void getAvailableItems() {
        Item[] availableChest = new Item[comChest.size()];

        for (int i = 0; i < comChest.size(); i++) {
            if (comChest.get(i).isAvailable()) {
                Item temp = comChest.get(i);
                int count = 0;
                availableChest[count] = temp;       // move to next space in the new array
                count++;
            }
            System.out.println(Arrays.toString(availableChest));
        }
    }
    public void getFullList() {
        for (Item i : comChest) {       // might as well do for-each
            System.out.println(i);
        }
    }
}