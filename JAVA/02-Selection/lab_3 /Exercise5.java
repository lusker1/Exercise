/*
Exercise 5 
Simple shopping discount system.  
Write a program that : 
1. Ask the user to enter their total purchase amount  
2. Applies a discount based on the amount : 
i. 1000$ or more gets a 20% discount  
ii. 500 $ to $999 gets a 10% discount  
3. Calculate and display the discount applied and the final amount to pay  
Output examples: 

Enter total shopping amount: 1200 
-----BILL SUMMARY---- 
Total Amount:$1200.0 
Discount Applied:$240.0 
Amount to Pay:$960.0 
Enter total shopping amount: 750
 -----BILL SUMMARY---- 
Total Amount:$750.0 
Discount Applied:$75.0 
Amount to Pay:$675.0 

/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : 01 - Selection (Lab 3)
 * Question    : Exercise 5 - Discount System
 * Date        : 2026-03-28
 * Description : Calculate shopping discount and total.
 * ===================================================
 

*/
package lab_3;

import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ; 
        System.out.println("Enter total shopping amount: ");
        double amount = input.nextDouble(); 

        if (500 <= amount && amount <= 1000) {
            System.out.println("----BILL SUMMARY----");
            double discount1 =(amount * 0.10) ; 
            System.out.println("Total Amount: " + amount);
            System.out.println("Discount Applied: " + discount1);
            double formula1 = amount - discount1 ;
            System.out.println("Amount to Pay: " + formula1);  
        } else if (amount <= 500 ) {
            System.out.println("please enter 500 or more then 500");
        }else if (amount > 1000 ) {
            System.out.println("----BILL SUMMARY----");
            double dicount2 = (amount * 0.20) ; 
            System.out.println("Total amount: " + amount);
            System.out.println("Discount Applied: " + dicount2);
            double formula2 = amount - dicount2 ; 
            System.out.println("Amount to Pay : " + formula2);
        }
        input.close();
    }
}
