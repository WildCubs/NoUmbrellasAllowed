package com.company;

import java.util.Scanner;

public class UI {
    boolean isRunning = true;

    public int userPrompt() {
        Scanner keybdINput = new Scanner(System.in);
        int input = keybdINput.nextInt();
        return input;
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
                    comChest.getFullList();
                case 2:
                    comChest.getAvailableItems();
                case 3:
                    comChest.addItem();
                case 4:
                case 5:
                    comChest.borrowOrReturnItem();
                default :
                    System.out.println("Du foretog et ugyldigt valg.");
            }
        }
    }
}
