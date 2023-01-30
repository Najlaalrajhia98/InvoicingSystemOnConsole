/**
 * 
 */
package com.invoicingsystem;

import java.util.Scanner;

/**
 * @author LAP-7
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        ProgramStatics ProgramStatics = new ProgramStatics ();
        Scanner userInput = new Scanner(System.in);

        while (true) {
            Menu.showMainMenu();
            System.out.print("Enter your choice: ");
            int choice = userInput.nextInt();
            ProgramStatics.increaseCount(choice - 1);

            switch (choice) {
            case 1:
                Menu.showShopSettings();
                System.out.print("Enter your choice: ");
                int shopSettingChoice = userInput.nextInt();
                ProgramStatics.increaseCount(shopSettingChoice - 1);

                switch (shopSettingChoice) {
                case 1:
                    // Load Data (Items and invoices)
                    break;
                case 2:
                    // Set Shop Name
                    System.out.println();
                    break;
                case 3:
                    // Set Invoice Header (Tel / Fax / Email / Website)
                    System.out.print("Enter invoice header: ");
                    // shop.header = userInput.nextLine();
                    break;
                case 4:
                    break;
                }
                break;
            case 2:

                Menu.showManageShopItems();
                System.out.print("Enter your choice: ");
                int manageShopItemsChoice = userInput.nextInt();
                ProgramStatics.increaseCount(manageShopItemsChoice - 1);

                switch (manageShopItemsChoice) {
                case 1:
                    // Add Items
                    break;
                case 2:
                    // Delete Items
                    break;
                case 3:
                    // Change Item Price
                    break;
                case 4:
                    // Report All Items
                    break;
                case 5:
                    break;
                }
                break;

            case 3:
                // Invoice Create New
                break;
            case 4:
                // Report: Statistics (No Of Items, No of Invoices, Total Sales)
                break;
            case 5:
                // Report: All Invoices (Invoice No, Invoice Date, Customer Name, No of items, Total, Balance)
                break;
            case 6:
                // Search (1) Invoice (Search by Invoice No and Report All Invoice details with items)
                break;
            case 7:
                ProgramStatics.showProgramStatistics();
                break;
            case 8:
                System.out.print("Are you sure you want to exit? (yes/no): ");
                String exitChoice = userInput.next();
                if (exitChoice.equals("yes")) {
                    System.out.println("Exiting the program...");
                    return;
                }
                break;
            }
        }
    }
}




