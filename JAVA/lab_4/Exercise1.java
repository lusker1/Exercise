/*
Exercise 1	
Write a Java program that computes the absolute value of the product of 2 numbers given by the 
user. Use if/else or the ternary conditional operator (? :) to make decision.

/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : 01 - Selection (Lab 4)
 * Question    : Exercise 1 - Absolute Product
 * Date        : 2026-03-29
 * Description : Using ternary to get positive product.
 * ===================================================
 
*/
package lab_4;

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int product = num1 * num2;
        int finalResult = product > 0 ? product : -product;
        System.out.println("The absolute Value is : " + finalResult);
    }

}