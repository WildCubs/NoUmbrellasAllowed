package com.company;

import java.util.Scanner;

public class UI {
    private boolean isRunning = true;
    private Scanner keybdINput = new Scanner(System.in);
    private Catalogue catalogue = new Catalogue();              // is there a better way?

    public int userPrompt() {                                   // main menu choice, reuseable for int input
        int input = keybdINput.nextInt();
        return input;
    }
            // this is a setter, it shouldn't return anything
            // BUT borrowOrReturn() needs to point to a something (parameter)

    public void articleStatusMenu() {
        System.out.println("Enter the item's name or catalogue number");
        System.out.println();

        try {
            int input = userPrompt();
            Item found = catalogue.comChest.get(input);
            catalogue.borrowOrReturnItem(found);


        } catch(Exception nameGiven) {

            String itemName = keybdINput.nextLine();
            Item found = catalogue.findItem(itemName);
            catalogue.borrowOrReturnItem(found);

            }
    } //else sout: Invalid }

    public void addPrompt() {
        System.out.println("Please enter item type:");
        keybdINput.nextLine();              // good old hack... doesn't seem to help much, here
        String category = keybdINput.nextLine();
        System.out.println("Enter name of item to donate to the Community Chest:");
        String description = keybdINput.nextLine();
        Item addition = new Item(category, description);
        catalogue.addItem(addition);
    }

    public void mainMenu() {
        while (isRunning) {
            System.out.println("Hvad kunne du tænke dig?");
            System.out.println("1. Se hele kataloget");
            System.out.println("2. Se hvad der er ledigt");
            System.out.println("3. Opret ting til udlån");
            System.out.println("4. Lån ting");
            System.out.println("5. Aflever ting");

            int input = userPrompt();

            switch (input) {
                case 1:
                    catalogue.getFullList();
                    break;
                case 2:
                    catalogue.getAvailableItems();
                    break;
                case 3:
                    addPrompt();
                    break;
                case 4:
                case 5:
                    articleStatusMenu();
                    break;
                default :
                    System.out.println("Du foretog et ugyldigt valg.");
            }
        }
    }
}
