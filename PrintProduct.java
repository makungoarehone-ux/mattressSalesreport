/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssalesreport;

/**
 *
 * @author Arehone Makugo
 */

// This class has one job: to print things to the screen. 
// It doesn't do any math; it just makes our code cleaner.
public class PrintProduct {
    
    // Prints the title of the report
    public void printHeader() {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("******************************");
    }

    // Prints the total. We pass the total number into this method.
    public void printTotalProductSales(int total) {
        System.out.println("TOTAL PRODUCT SALES: " + total);
    }

    // Prints the average. We pass the average number in.
    public void printAverageProductSales(double average) {
        // Math.round() turns a decimal like 17.0 into a whole number like 17, just like the screenshot.
        System.out.println("AVERAGE PRODUCT SALES: " + Math.round(average));
    }

    // Prints the most popular product's name and score.
    public void printMostPopularProduct(String popularProduct) {
        System.out.println("MOST POPULAR PRODUCT: " + popularProduct);
    }
}