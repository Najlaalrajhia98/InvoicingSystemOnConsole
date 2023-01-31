/**
 * 
 */
package com.invoicingsystem;

import java.io.IOException;
import java.util.IllegalFormatCodePointException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author LAP-7
 *
 */
public class Main {

    /**
     * @param This main.java is used as starting app 
     * - Displays the menu/submenus with items.
     * - AllowS the user to navigate between options by using SwitchCases.
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        
        Shop shop = new Shop();
        // To load the data to the arraylist to be avalible once the program starts
        shop.loadItemsFromFile();
        shop.loadInvoice();

        @SuppressWarnings("resource")
        Scanner userInput = new Scanner(System.in);

        while (true) {
            Menu.showMainMenu();
            try {

                System.out.print("Enter your choice: ");
                int choice = userInput.nextInt();

                switch (choice) {
                /*
                 *  A switch case to handle the navigation between options in the Shop Settings Menu
                 */
                case 1:
                    Menu.showShopSettings();
                    System.out.print("Enter your choice: ");
                    int shopSettingChoice = userInput.nextInt();

                    switch (shopSettingChoice) {
                    case 1:
                        // load Items and Incoices 

                        break;
                    case 2:
                        // Set Shop Name
                        shop.setShopName("LULU");
                        break;
                    case 3:
                        // Set Invoice Header (Tel / Fax / Email / Website)
                        shop.setHeaderTel("999");
                        shop.setHeaderEmail("lulu.outlook.com");
                        shop.setHeaderFax("0000999");
                        shop.setHeaderWebsite("www.lulu.com");
                        break;
                    case 4:

                        System.out.println("Going back to the previous menu...");

                        break;
                    }

                    break;
                    /*
                     *  A switch case to handlw the navigation between options in the Manage Shop Items Menu
                     */
                case 2:
                    Menu.showManageShopItems();
                    System.out.print("Enter your choice: ");
                    int manageShopItemsChoice = userInput.nextInt();

                    switch (manageShopItemsChoice) {

                    case 1:
                        // Add Items and save them to a file
                        shop.addItem();
                        System.out.println("Added the Item Successfully");
                        break;
                    case 2:
                        // Show the Avalible Items and Promote the user to enter
                        // which Item Id to be deleted
                        shop.printItems();
                        System.out.println("Enter the ItemID:");
                        int userChoice =userInput.nextInt();
                        shop.deleteItem(userChoice);
                        System.out.println("Deleted");
                        break;
                    case 3:
                        // Change Item Price
                        break;
                    case 4:
                        // Report All the Items
                        shop.loadItemsFromFile();
                        shop.printItems();
                        break;
                    case 5:
                        // Go BACK
                        System.out.println("Going back to the previous menu...");
                        Menu.showMainMenu();
                        break;
                    }
                    break;

                case 3:
                    // Create New Invoice and save it to invoices.json file 
                    System.out.println("Enter the Id of the item you want to add from the given itemsIds: ");
                    shop.printItems();
                    
                    Integer itemID = userInput.nextInt();
                    shop.creatInvoice(itemID);
                    System.out.println("Invoice created Successfully");
                    break;
                case 4:
                    // Report: Statistics (No Of Items, No of Invoices, Total Sales)
                    break;
                case 5:
                    // Report: All Invoices 
                    shop.loadInvoice();
                    shop.printLoadedInvoices();
                    break;
                case 6:
                    // Search (1) Invoice (Search by Invoice No and Report All Invoice details with items)
                    break;
                case 7:      
                    //program statsitcs
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
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number.");
                userInput.nextLine(); // clear the input buffer

            }

        }
    }
}
