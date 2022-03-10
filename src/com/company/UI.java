package com.company;

import java.util.Scanner;

public class UI {
    private boolean isRunning = true;
    private Scanner keybdINput = new Scanner(System.in);
    private Catalogue catalogue = new Catalogue();

    public int userPrompt() {
        int input = keybdINput.nextInt();
        return input;
    }

    public void articleStatusMenu() {
        System.out.println("Enter the item's name or catalogue number");

        try {
            int input = userPrompt();
            catalogue.borrowOrReturnItem(catalogue.comChest.get(input));
        } catch(Exception nameGiven) {
            String itemName = keybdINput.nextLine();
            Item found = catalogue.findItem(itemName);
            catalogue.borrowOrReturnItem(found);
            }
    } //else sout: Invalid }

    public void addPrompt() {
        System.out.println("Please enter item type:");
        String category = keybdINput.nextLine();
        System.out.println("Enter identifier of item you are adding to the Community Chest?");
        String name = keybdINput.nextLine();
        catalogue.addItem(category, name);
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
                case 2:
                    catalogue.getAvailableItems();
                case 3:
                    addPrompt();
                case 4:
                case 5:
                    articleStatusMenu();
                default :
                    System.out.println("Du foretog et ugyldigt valg.");
            }
        }
    }
}
