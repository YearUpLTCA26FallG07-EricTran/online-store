package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;

public class Program {


    public static HashMap<String, Product> products;
    public static ArrayList<Product> cart;

    public static void main(String[] args) {
        products = loadProducts();

        displayItems(products);




    }

    public static HashMap<String, Product> loadProducts() {
        //this will eventually load from a file.


        HashMap<String, Product> result = new HashMap<>();
        result.put("ASDF", new Product("ASDF", "asdf asdf", 6.99, "misc"));
        result.put("ASDF", new Product("zxcv", "zxcvxcv", 8.99, "misc"));
        result.put("ASDF", new Product("gwen", "gwen gwen", 3.99, "misc"));

        return result;

    }

    public static void showScreenHome() {

        // As loop.

        // Display Products

        // Display Cart

        // Exit


    }


    public static void showScreenDisplayProduct() {

        // Display All, or Search

        // Add To Cart

        // Go Back

    }
    public static void showScreenDisplayCart() {


        // Display items in cart.

        // Display Total Sales Amount

        // Check Out (not functional yet)

        // Remove Product


    }


    public static void displayItems(HashMap<String, Product> products) {
        // display products in a nicely formatted table.
        System.out.println("output products here");
        System.out.println(products);

        //todo: fix this to be nice.


    }

}
