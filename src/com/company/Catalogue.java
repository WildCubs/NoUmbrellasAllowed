package com.company;

import java.util.ArrayList;
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

    public void addItem(Item thing) {
        this.comChest.add(thing);
    }

    // I need to point at the item with the changing property
    public void borrowOrReturnItem(Item found) {
        found.toggleAvailable();
    }

    public void getAvailableItems() {
        Item[] availableChest = new Item[comChest.size()];

        for (int i = 0; i < comChest.size(); i++) {
            if (comChest.get(i).isAvailable()) {    // if it's available, put in the array
                Item temp = comChest.get(i);
                int count = 0;
                availableChest[count] = temp;       // move to next space in the new array
                count++;
            }
            for (i = 0; i < availableChest.length; i++) {
                System.out.println(availableChest[i].getCategory() + "  " + availableChest[i].getDescription());
            }
            //System.out.println(Arrays.toString(availableChest));      // more nonsense
        }
    }

    public void getFullList() {                    // Okay, nevermind, then...
        for (int i = 0; i < comChest.size(); i++) {
            System.out.println(comChest.get(i).getCategory() + "  " + comChest.get(i).getDescription());
            }

        /* Iterator itr = comChest.iterator();     // No? no go?
        while (itr.hasNext()) {
            Item i = itr.next();
            System.out.println(i.getCategory() + "  " + i.getDescription());  // not like that
        }

                for (Item i : comChest) {           // Hmm... maybe listIterator can help?
            ListIterator<Item> litr8r = null;
            litr8r = comChest.listIterator();
            while (litr8r.hasNext()) {
                System.out.println(litr8r.next());  // next WTF? Still String output I want
            }
        }
*/
    }


}