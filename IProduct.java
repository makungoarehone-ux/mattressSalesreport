/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mattresssalesreport;

/**
 *
 * @author Arehone Makugo
 */

// This is an Interface. It acts like a contract or a rulebook.
// Any class that implements this interface MUST write code for these three methods.
public interface IProduct {
    
    // Method to get the total number of all products sold
    int GetTotalProductsSold();
    
    // Method to get the average number of products sold
    double GetAverageProductSold();
    
    // Method to find out which product sold the most
    String GetMostPopularProduct();
}