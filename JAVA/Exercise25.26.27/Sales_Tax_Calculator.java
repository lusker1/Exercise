/*
Exercise 26 — Sales Tax Calculator
Description: Calculate the total cost of a purchase including sales tax. The program reads
the price of an item, the quantity being purchased, and the sales tax rate (as a percentage).
It then computes the total amount due (price × quantity + tax). Input:- price : double
(price of a single item)- quantity : int (number of items)- taxRate : double (percentage,
e.g., enter 15 for 15%) Output: The total cost including tax. Sample run:

Enter item price: 100
Enter quantity: 2
Enter sales tax rate (%): 15
Total cost = 230.0

/*
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Author      : BinSaleh (lusker1)
 Exercise    : Exercise 26 - Sales Tax Calculator
 Date        : 2026-03-19
 Description : Calculates the total cost of purchase 
               by adding sales tax (percentage) to 
               the total price (price * quantity).
===================================================
*/

import java.util.*;

public class Sales_Tax_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter item price: ");
        double itemPrice = input.nextDouble();
        System.out.println("Enter Quantity: ");
        double quantitiy = input.nextDouble();
        System.out.println("Enter sales tax rate (%) : ");
        double taxRate = input.nextDouble();

        double rate = (itemPrice * quantitiy * taxRate / 100);

        double totalCost = ((itemPrice * quantitiy) + rate);
        System.out.println("Total cost = " + totalCost);

        input.close();
    }
}
