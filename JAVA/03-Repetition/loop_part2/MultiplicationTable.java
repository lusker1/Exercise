// Exercise 1: 
// Print the multiplication table of a number (user enters n): 
 
// Run Example: 
// Enter a number: 7 
// Multiplication Table of 7:  
// 7 x 1 = 7 
// 7 x 2 = 14 
// 7 x 3 = 21 
// 7 x 4 = 28 
// 7 x 5 = 35 
// 7 x 6 = 42 
// 7 x 7 = 49 
// 7 x 8 = 56 
// 7 x 9 = 63 
// 7 x 10 = 70

/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Dynamic Multiplication Table
 * Date        : 2026-07-18
 * Description : A basic Java program that generates a clean 
 * multiplication table for any user-inputted integer.
 * ===================================================
 */


import java.util.*; 

public class MultiplicationTable {
    static Scanner input = new Scanner (System.in) ; 
    public static void main(String[] args) {
        
        System.out.println("Enter a number : " );
        while (!input.hasNextDouble()) {
            System.out.println("Error : please enter a number For Example (3 , 4 , 5.6)");
            input.next(); 
        }
        double number = input.nextDouble(); 
        double formula = 1 ; 
        for (int i = 1 ; i <= 10 ; i++ ) {

            formula = number * i ; 

            System.out.println(number + " x " + i + " = " + formula);

        }

        input.close();
    }
}
