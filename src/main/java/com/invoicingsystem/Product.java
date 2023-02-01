/**
 * 
 */
package com.invoicingsystem;

/**
 * @author This class represents a product/item that to be in the Shop Class
 *
 */
public class Product {
 /*
  * @id - describes the id of the product (Unique).
  * @name - name of the product
  * @price - price of the product
  * @quantity - number of a given product
  * @qtyAmount - the total amount( price * quantity)
  * @
  */
    int id;
    String name;
    double price;
    int quantity;
    double qtyAmount;


    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.qtyAmount = price * quantity;
    }
}

