/*
Write a program that asks the user to enter the price of a product and the
quantity they want to buy. Calculate the total cost and add a 15% tax.
Example 1 :

➔Input:
➔ Price: 50
➔ Quantity: 3
➔ Output: The total cost with tax is: 172.5.

/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Author      : BinSaleh (lusker1)
 Section     : 02 - Selection and Logic
 Question    : Question 1 - Simple Invoice Calculation
 Date        : 2026-03-26
 Description : Calculates total cost with 15% tax 
               for a product based on price and quantity.
===================================================

*/
package Programming_Practice_Ch3_Switch;

import java.util.*;

public class Simple_Invoice_Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" --- Simple Invoice Calculation ---");
        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter Quantity: ");
        int quantity = input.nextInt();

        double formula1 = (price * quantity) * 15 / 100;
        double formula2 = (price * quantity) + formula1;
        System.out.println("The total cost with tax is: " + formula2);

        input.close(); 
    }
}
