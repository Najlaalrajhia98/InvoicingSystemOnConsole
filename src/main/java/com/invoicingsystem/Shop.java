/**
 * 
 */
package com.invoicingsystem;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * @author This class reprsents a Shop contains items and invoices
 *
 */
public class Shop {

    private String shopName;
    private String headerTel;
    private String headerFax;
    private String headerEmail;
    private String headerWebsite;
    private ArrayList<Invoice> invoices;
    public ArrayList<Product> items;

    // Constructor
    public Shop() {

    }

    // Getters and Setters
    public String getShopName() {
        return shopName;
    }

    public String setShopName(String shopName) {
        this.shopName = shopName;
        return shopName;
    }

    public String getHeaderTel() {
        return headerTel;
    }

    public void setHeaderTel(String headerTel) {
        this.headerTel = headerTel;
    }

    public String getHeaderFax() {
        return headerFax;
    }

    public void setHeaderFax(String headerFax) {
        this.headerFax = headerFax;
    }

    public String getHeaderEmail() {
        return headerEmail;
    }

    public void setHeaderEmail(String headerEmail) {
        this.headerEmail = headerEmail;
    }

    public String getHeaderWebsite() {
        return headerWebsite;
    }

    public void setHeaderWebsite(String headerWebsite) {
        this.headerWebsite = headerWebsite;
    }

    /*
     * @saveItemToFile This method is used to save items to items.json file
     */
    public void saveItemsToFile(String fileName) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(fileName)) {
            String json = gson.toJson(items);
            writer.write(json);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     *  This method is used to add items usign product class 
     *  to the invoice class
     */
    public void addItem() {

        Scanner userInput = new Scanner(System.in);

        int itemID = 0;
        String itemName;
        double itemPrice = 0;
        int itemQuantity = 0;

        while (true) {

            System.out.println("Enter item ID: ");
            try {
                itemID =Integer.parseInt(userInput.nextLine()) ;
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Invalid input. Item ID must be an integer.");

            }
        }
        // it will keep asking the user if input is invalid
        while (true) {
            System.out.println("Enter item name: ");
            itemName = userInput.nextLine();
            if (!itemName.isEmpty()) {
                break;
            }
            System.out.println("Item name cannot be empty.");
        }
        while (true) {
            System.out.println("Enter item price: ");
            try {
                itemPrice = Double.parseDouble(userInput.nextLine());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Item price must be a number.");
            }
        }
        while (true) {
            System.out.println("Enter item quantity: ");
            try {
                itemQuantity = Integer.parseInt(userInput.nextLine());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Item quantity must be an integer.");
            }
        }
        // Creats new item and add it to the list of items 
        Product item = new Product(itemID, itemName, itemPrice, itemQuantity);
        items.add(item);

        // saves the list of items in the items.json file
        try {
            saveItemsToFile("items.json");
        } catch (Exception e) {
            System.out.println("Error saving items to file: " + e.getMessage());
        }
    }
    /*
     *@loadItemsFromFile This method is used to load the items from the items.json file 
     */
    public void loadItemsFromFile() {
        Gson gson = new Gson();
        try (Reader reader = new BufferedReader(new FileReader("items.json"))) {
            items = gson.fromJson(reader, new TypeToken<ArrayList<Product>>() {
            }.getType());
        }catch (Exception e) {
            System.out.println("Error loading items from file: " + e.getMessage());
        }
    }
    /*
     * @printItems This method is used to print out the items using for-each loop
     */
    public void printItems() {

        for (Product item : items) {
            System.out.println("Item ID: " + item.id);
            System.out.println("Item Name: " + item.name);
            System.out.println("Item Price: " + item.price);
            System.out.println("Item Quantity: " + item.quantity);
            System.out.println("-----------------------------");
        }
    }
    /*
     * @deleteItem This method is used to delete an item from the list of 
     */
    public void deleteItem(int itemID) {
        Gson gson = new Gson();
        try (Reader reader = new BufferedReader(new FileReader("items.json"))) {
            items = gson.fromJson(reader, new TypeToken<ArrayList<Product>>() {
            }.getType());

            for (Product item : items) {
                if (item.id==(itemID)) {
                    items.remove(item);
                    saveItemsToFile("items.json");

                }
            }
        } catch (Exception e) {
            System.out.println("Error deleting item: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /*
     * @creatInvoice This Method is used to create New Invoice 
     * - asks the user to provide details 
     * @itemID - its the ID that the user will choose to add to the invoice 
     */
    public void creatInvoice(int itemID) {
        try {

            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter the name of the customer");
            String name= userInput.nextLine();
            System.out.println("Enter the Phone No");
            String phoneNo= userInput.nextLine();
            System.out.println("Enter the paid Amount");
            double paidAmount= Double.parseDouble(userInput.nextLine());
            Invoice invoice = null;
            for (Product item : items) {
                if (item.id==(itemID)) {
                    ArrayList<Product> itemsSelcetd= new ArrayList<>();
                    itemsSelcetd.add(item);
                    invoice = new Invoice(name,phoneNo, paidAmount, itemsSelcetd);
                    invoices.add(invoice);

                }
            }
            // writes the invoices to the invoice.json file 
            Gson gson = new Gson();
            try (FileWriter writer = new FileWriter("invoice.json")) {
                String json = gson.toJson(invoices);
                writer.write(json);
                writer.write("\n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Invalid Input");
        }
    }
    /*
     * @loadInvoice() This method is used to load All Invoices 
     */
    public void loadInvoice() {
        Gson gson = new Gson();
        try (Reader reader = new BufferedReader(new FileReader("invoice.json"))) {
            invoices = gson.fromJson(reader, new TypeToken<ArrayList<Invoice>>() {
            }.getType());
        }catch (Exception e) {
            System.out.println("Error loading items from file: " + e.getMessage());
        }


    }
    /*
     * @printLoadedInvoices() to print the loaded invoices on the console 
     */
    public void printLoadedInvoices() {
        for (Invoice invoice : invoices) {
            System.out.println("Invoice Customer Name: " + invoice.customerName);
            System.out.println("Phone Number: " + invoice.phoneNumber);
            System.out.println("Invoice Number Of Items : " + invoice.numOfItems);
            System.out.println("Paid Amount: " + invoice.paidAmount);
            System.out.println("Invoic: " + invoice.items);
            System.out.println("-----------------------------");
        }
    }

}