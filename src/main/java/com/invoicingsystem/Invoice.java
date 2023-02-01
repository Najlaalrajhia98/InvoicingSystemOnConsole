/**
 * 
 */
package com.invoicingsystem;

import java.lang.reflect.Type;
import java.util.ArrayList;



/**
 * @author LAP-7
 *
 */
public class Invoice {

    String customerName;
    String phoneNumber;
    int numOfItems;
    double paidAmount;
    ArrayList<Product> items;

    
    public Invoice(String customerName, String phoneNumber,double paidAmount, ArrayList<Product> items) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.paidAmount = paidAmount;
        this.items = items;
        this.numOfItems = items.size();

    }
    
    

}

