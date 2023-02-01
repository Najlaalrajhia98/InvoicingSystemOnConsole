/**
 * 
 */
package com.invoicingsystem;

import java.util.ArrayList;

/**
 * @author this class shows the Main Menu as well as the Sub Menues with their items 
 *
 */
public class Menu {
    
    /*
     * @static fields belong to the class and not to instances of the class. 
     * This means that there will only be one copy of these fields, 
     * shared by all instances of the class.
         
     */
    static ArrayList<String> mainMenu = new ArrayList<String>();
    static ArrayList<String> shopSettings = new ArrayList<String>();
    static ArrayList<String> manageShopItems = new ArrayList<String>();

    /*
     * initialize the values of the ArrayLists mainMenu, shopSettings, 
     * and manageShopItems at the class level. Since the block is marked as static.
     * 
     */
    static {
        mainMenu.add("Shop Settings");
        mainMenu.add("Manage Shop Items");
        mainMenu.add("Create New Invoice");
        mainMenu.add("Report: Statistics");
        mainMenu.add("Report: All Invoices");
        mainMenu.add("Search Invoice");
        mainMenu.add("Program Statistics");
        mainMenu.add("Exit");

        shopSettings.add("Load Data (Items and invoices)");
        shopSettings.add("Set Shop Name");
        shopSettings.add("Set Invoice Header (Tel / Fax / Email / Website)");
        shopSettings.add("Go Back to Main Menu");

        manageShopItems.add("Add Items");
        manageShopItems.add("Delete Items");
        manageShopItems.add("Change Item Price");
        manageShopItems.add("Report All Items");
        manageShopItems.add("Go Back to Main Menu");
    }
    /*
     * @showMainMenu() iterate through the items in the MainMenu list and prints them on the console
     */
    public static void showMainMenu() {
        System.out.println("Application Main Menu:");
        for (int i = 0; i < mainMenu.size(); i++) {
            System.out.println((i + 1) + ". " + mainMenu.get(i));
        }
        System.out.print("Choose an option (1 to " + mainMenu.size() + "): ");
    }
    /*
     * @showShopSettings() iterate through the items in the ShopSettings list and prints them on the console
     */
    public static void showShopSettings() {
        System.out.println("Shop Settings Menu:");
        for (int i = 0; i < shopSettings.size(); i++) {
            System.out.println((i + 1) + ". " + shopSettings.get(i));
        }
        System.out.print("Choose an option (1 to " + shopSettings.size() + "): ");
    }
    /*
     * @showManageShopItems() iterate through the items in the ManageShopItems list and prints them on the console
     */
    public static void showManageShopItems() {
        System.out.println("Manage Shop Items Menu:");
        for (int i = 0; i < manageShopItems.size(); i++) {
            System.out.println((i + 1) + ". " + manageShopItems.get(i));
        }
        System.out.print("Choose an option (1 to " + manageShopItems.size() + "): ");
    }
}
