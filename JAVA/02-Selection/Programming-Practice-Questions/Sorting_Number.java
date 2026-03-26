/*
Question 5 (Sorting Numbers): 
Write a program that asks the user to enter five numbers and sorts them 
in ascending order. 
Example: 
➔Input: 8, 3, 5, 7, 9 
➔Output: The numbers in ascending order are: 3, 5, 7, 8, 9.

/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : 02 - Selection and Logic
 * Question    : Question 5 - Sorting Numbers
 * Date        : 2026-03-26
 * Description : Compare and swap five numbers to sort them.
 * ===================================================
 

*/
package Programming_Practice_Ch3_Switch;

import java.util.*;

public class Sorting_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five numbers ");

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();

        int temp;

        if (number1 > number2) { // 5 > 4 
            temp = number1; // int temp it's empty but in this statement wee typed temp now is Equal number1 
            number1 = number2; // number1 = 4 
            number2 = temp; //number2 now is Equal = 5  
        }
        if (number2 > number3) { // 5 > 3 
            temp = number2; // int temp will be empty but now temp is Equal number2  
            number2 = number3; // number2 = 3 
            number3 = temp; // number3 = 5 
        }
        if (number3 > number4) { // 5 > 2 
            temp = number3;  // temp Equal number3 = 5  
            number3 = number4; // number3 = 2 
            number4 = temp; // number4 = 5 
        }
        if (number4 > number5) { //5 > 1 
            temp = number4; // temp Equal number4 = 5
            number4 = number5; // number4 = 1  
            number5 = temp; // number5 = 5 
        }
         if (number1 > number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number2 > number3) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        if (number3 > number4) {
            temp = number3;
            number3 = number4;
            number4 = temp;
        }
        if (number4 > number5) {
            temp = number4;
            number4 = number5;
            number5 = temp;
        }
         if (number1 > number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number2 > number3) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        if (number3 > number4) {
            temp = number3;
            number3 = number4;
            number4 = temp;
        }
        if (number4 > number5) {
            temp = number4;
            number4 = number5;
            number5 = temp;
        }
         if (number1 > number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number2 > number3) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        if (number3 > number4) {
            temp = number3;
            number3 = number4;
            number4 = temp;
        }
        if (number4 > number5) {
            temp = number4;
            number4 = number5;
            number5 = temp;
        }

        System.out.println("The numbers in ascending order are: " + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5);
        input.close(); 
    }
}
