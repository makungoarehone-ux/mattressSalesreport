/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssalesreport;

/**
 *
 * @author Arehone Makugo
 */
    

// The 'implements IProduct' means this class promises to follow the rules of the IProduct interface.
public class Product implements IProduct {
    
    // We use a 1D array to store the names of our three mattresses.
    private String[] productNames;
    
    // We use a 2D array to store the sales numbers. 
    // Think of it like a table: Rows = Products, Columns = Months.
    private int[][] salesData;

    // This is the Constructor. It runs when we create a new 'Product' object.
    // It takes the names and the sales table and saves them into the class.
    public Product(String[] productNames, int[][] salesData) {
        this.productNames = productNames;
        this.salesData = salesData;
    }

    // This method adds up every single number in the 2D array.
    @Override
    public int GetTotalProductsSold() {
        int total = 0; // Start at 0
        
        // Outer loop: goes through each product (row)
        for (int i = 0; i < salesData.length; i++) {
            
            // Inner loop: goes through each month (column) for that product
            for (int j = 0; j < salesData[i].length; j++) {
                
                // Add the current number to our running total
                total += salesData[i][j];
            }
        }
        return total; // Give the final answer back
    }

    // This method calculates the average.
    @Override
    public double GetAverageProductSold() {
        // First, get the total sum by calling the method we just wrote above.
        int total = GetTotalProductsSold();
        int numberOfEntries = 0; // We need to count how many numbers are in the table.
        
        // Loop through the rows to count the columns (months)
        for (int i = 0; i < salesData.length; i++) {
            numberOfEntries += salesData[i].length;
        }
        
        // Safety check: if the table is empty, return 0 to avoid crashing (divide by zero error).
        if (numberOfEntries == 0) return 0;
        
        // Calculate average: (Total / Count). 
        // We use (double) to force Java to give us a decimal answer, not a whole number.
        return (double) total / numberOfEntries; 
    }

    // This method finds the most popular product.
    @Override
    public String GetMostPopularProduct() {
        int highestSale = -1; // Keep track of the highest number found so far.
        int maxProductIndex = -1; // Keep track of which product (row) had the highest number.

        // Loop through each product one by one
        for (int i = 0; i < salesData.length; i++) {
            int productTotal = 0; // Reset the total for this specific product
            
            // Add up the sales for this single product across all 3 months
            for (int j = 0; j < salesData[i].length; j++) {
                productTotal += salesData[i][j];
            }
            
            // If this product's total is higher than the highest we've seen, update our records.
            if (productTotal > highestSale) {
                highestSale = productTotal;
                maxProductIndex = i; // Remember the row number (e.g., 0 for Cozy Nights)
            }
        }
        
        // Go to our 1D names array using the row number we saved, and add the total in brackets.
        return productNames[maxProductIndex] + "(" + highestSale + ")";
    }
}