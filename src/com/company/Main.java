package com.company;

public class Main {

    public static void main(String[] args) {
        Catalogue catalogue = new Catalogue();

        Item item1 = new Item("Sport", "Skateboard");
        catalogue.addItem(item1);
        Item item2 = new Item("Sport", "Mountainbike");
        catalogue.addItem(item2);
        Item item3 = new Item("Tøj", "Smoking");
        catalogue.addItem(item3);
        Item item4 = new Item("Tøj", "Pailletkjole");
        catalogue.addItem(item4);

        //Controller.execute();
    }
}
