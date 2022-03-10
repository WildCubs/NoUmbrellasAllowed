package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Catalogue {

    private List<Item> comChest = new ArrayList<Item>();

    public Item findItem(String category, String itemName) {
        for (int i = 0; i < (comChest.size()); i++) {                /// An ArrayList has .size() method, instead of .length
            String queryItem = (comChest.get(i).getDescription());
            if (queryItem.equals(itemName)) {
                return comChest.get(i);                             // and has a different accessor, says IntelliJ
                //break;
            }
        }
        return null;
    }

    public void addItem(String itemCategory, String itemName) {
        Item articleToAdd = findItem(itemCategory, itemName);
        this.comChest.add(articleToAdd);
    }

    public void borrowOrReturnItem(Item found) {
        found.setAvailable();
    }

    public void getAvailableItems() {
        Item[] availableChest = new Item[comChest.size()];

        for (int i = 0; i < comChest.size(); i++) {
            if (comChest.get(i).isAvailable()) {
                Item temp = comChest.get(i);
                int count = 0;
                availableChest[count] = temp;
                count++;
            }
            System.out.println(Arrays.toString(availableChest));
        }
    }
    public void getFullList() {
        for (Item i : comChest) {
            System.out.println(i);
        }
    }
}