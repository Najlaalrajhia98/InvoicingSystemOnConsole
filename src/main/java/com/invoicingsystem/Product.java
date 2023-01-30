/**
 * 
 */
package com.invoicingsystem;

/**
 * @author LAP-7
 *
 */
public class Product {
    int id;
    String name;
    double unitPrice;
    int quantity;
    double qtyAmount;

    public Product(int id, String name, double unitPrice, int quantity) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.qtyAmount = unitPrice * quantity;
    }
}
