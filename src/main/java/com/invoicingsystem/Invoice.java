/**
 * 
 */
package com.invoicingsystem;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

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

