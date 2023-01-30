/**
 * 
 */
package com.invoicingsystem;

import java.util.ArrayList;

/**
 * @author LAP-7
 *
 */
public class Shop {
   
        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

        String name;
        String header;
        ArrayList<Product> products;
        ArrayList<Invoice> invoices;

        public Shop(String name, String header, ArrayList<Product> products, ArrayList<Invoice> invoices) {
            this.name = name;
            this.header = header;
            this.products = products;
            this.invoices = invoices;
        
    }
}
