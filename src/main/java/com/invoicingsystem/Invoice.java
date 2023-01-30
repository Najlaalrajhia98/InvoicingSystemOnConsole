/**
 * 
 */
package com.invoicingsystem;

import java.util.ArrayList;

/**
 * @author LAP-7
 *
 */
public class Invoice {
    
    String customerName;
    String phoneNumber;
    String date;
    int numOfItems;
    double totalAmount;
    double paidAmount;
    double balance;
    ArrayList<Product> items;

    public Invoice(String customerName, String phoneNumber, String date, int numOfItems,
            double totalAmount, double paidAmount, double balance, ArrayList<Product> items) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.numOfItems = numOfItems;
        this.totalAmount = totalAmount;
        this.paidAmount = paidAmount;
        this.balance = balance;
        this.items = items;
    }
}
