/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssalesreport;

/**
 *
 * @author Arehone Makugo
 */


// Import the Scanner class so we can read what the user types on the keyboard.
import java.util.Scanner;

public class MattressSalesReport {

    // This is the   main method is the starting point of the program.
    public static void main(String[] args) {
        
        //  Create a Scanner object to listen for keyboard input.
        Scanner scanner = new Scanner(System.in);

        // Create a 1D array to hold the names of the 3 mattresses.
        String[] productNames = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        // Create a 2D array with 3 rows (products) and 3 columns (months).
        int[][] salesData = new int[3][3];

        // This is a  loop  that asks the user for the sales numbers.
        // 'i' goes through the products (0, 1, 2).
        for (int i = 0; i < productNames.length; i++) {
            
            // 'j' goes through the months (0, 1, 2).
            for (int j = 0; j < 3; j++) {
                
                // It  ask the user a question. We use (j+1) so it says "Month 1" instead of "Month 0".
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + productNames[i] + ": ");
                
                // It reads the number they typed and save it into the correct spot in our 2D array.
                salesData[i][j] = scanner.nextInt();
            }
            // Print a blank line after asking the 3 questions for one product.
            System.out.println(); 
        }

        // We are done asking questions, so close the scanner.
        scanner.close();

        //  here we are  creating our object to do the work
        
        // Create a 'Product' object. We give it the names and the filled-in sales table.
        Product productReport = new Product(productNames, salesData);
        
        // Create a 'PrintProduct' object so we can use its printing methods.
        PrintProduct printer = new PrintProduct();

        //  Printing thhe final report 
        
        // 1. Print the header
        printer.printHeader();
        
        // 2. Get the total from the Product class, and pass it to the Print class to show it.
        printer.printTotalProductSales(productReport.GetTotalProductsSold());
        
        // 3. Get the average from the Product class, and pass it to the Print class.
        printer.printAverageProductSales(productReport.GetAverageProductSold());
        
        // 4. Get the most popular product from the Product class, and pass it to the Print class.
        printer.printMostPopularProduct(productReport.GetMostPopularProduct());
    }
}