/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mattresssalesreport;

// These imports bring in the testing tools (JUnit).
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Arehone Makugo
 */

public class ProductTest {

    // UNIT TEST 1
    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        //  1. SETUP (Arrange) 
        // Create fake data based on the assignment screenshot.
        String[] names = {"Cozy", "Restonic", "Sealy"};
        int[][] data = {
            {25, 18, 20}, // Cozy total = 63
            {15, 10, 12}, // Restonic total = 37
            {18, 15, 20}  // Sealy total = 53
        };
        
        // Create a new Product object and give it the fake data.
        Product product = new Product(names, data);
        
        // We know manually that 63 + 37 + 53 = 153. This is our expected answer.
        int expectedTotal = 153; 

        //  2. ACTION (Act) 
        // Tell the product object to run its calculation method.
        int actualTotal = product.GetTotalProductsSold();

        //  3. ASSERTION (Assert) 
        // Check if what the code calculated matches what we expect.
        // If they match, the test passes (green). If not, it fails (red).
        assertEquals(expectedTotal, actualTotal, "The total calculated should be 153");
    }

    // UNIT TEST 2
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        //  1. SETUP (Arrange) 
        String[] names = {"Cozy", "Restonic", "Sealy"};
        int[][] data = {
            {25, 18, 20}, 
            {15, 10, 12}, 
            {18, 15, 20}  
        };
        Product product = new Product(names, data);
        
        // We know manually: 153 total / 9 entries = 17.0
        double expectedAverage = 17.0; 

        //  2. ACTION (Act) 
        double actualAverage = product.GetAverageProductSold();

        //  3. ASSERTION (Assert) 
        // The '0.01' is a margin of error for decimal numbers (called a delta).
        assertEquals(expectedAverage, actualAverage, 0.01, "The average calculated should be 17.0");
    }
}
