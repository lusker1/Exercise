// Exercise 3: 
// Write a Java program that prints numbers from 1 to n  and their factorials in a table. 
 
// Run Example: 
// Enter a number: 5 
// Number  Factorial 
// 1       1 
// 2       2 
// 3       6 
// 4       24 
// 5       120

/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Factorial Sequence Table
 * Date        : 2026-07-18
 * Description : A Java program that dynamically calculates and displays 
 * numbers from 1 to n alongside their factorials in a clean table.
 * ===================================================
 */

import java.util.*;

public class FactorialTable {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a number : ");
        while (!input.hasNextInt()) {
            System.out.println("Error : please enter a number");
            input.next();
        }
        int number = input.nextInt();
        System.out.println("Number\tFactorial");

        long counter = 1;

        for (int i = 1; i <= number; i++) {

            counter = counter * i;
            System.out.println(i + "\t " + counter);
        }
    }
}