/**
 * 
 */
package com.invoicingsystem;

import java.util.ArrayList;

/**
 * @author LAP-7
 *
 */
public class Menu {

    static String[] mainMenu = {"Shop Settings", "Manage Shop Items", "Create New Invoice",
            "Report: Statistics", "Report: All Invoices", "Search Invoice", "Program Statistics", "Exit"};

    static String[] shopSettings = {"Load Data (Items and invoices)", "Set Shop Name",
            "Set Invoice Header (Tel / Fax / Email / Website)", "Go Back"};

    static String[] manageShopItems = {"Add Items", "Delete Items", "Change Item Price",
            "Report All Items", "Go Back"};

    public static void showMainMenu() {
        System.out.println("Application Main Menu:");
        for (int i = 0; i < mainMenu.length; i++) {
            System.out.println((i + 1) + ". " + mainMenu[i]);
        }
        System.out.print("Choose an option (1 to " + mainMenu.length + "): ");
    }
    public static void showShopSettings() {
        System.out.println("Shop Settings Menu:");
        for (int i = 0; i < shopSettings.length; i++) {
            System.out.println((i + 1) + ". " + shopSettings[i]);
        }
        System.out.print("Choose an option (1 to " + shopSettings.length + "): ");
    }
    public static void showManageShopItems() {
        System.out.println("Manage Shop Items Menu:");
        for (int i = 0; i < manageShopItems.length; i++) {
            System.out.println((i + 1) + ". " + manageShopItems[i]);
        }
        System.out.print("Choose an option (1 to " + manageShopItems.length + "): ");
    }
    
}
