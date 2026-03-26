/*

Exercise 22 — Swap Two Numbers
Description: Swap the values of two variables. The program reads two numbers and then
swaps their values, i.e., the first value becomes the second and vice versa. Input:- x : int
y : int Output: The values of x and y after swapping. Sample run:

Enter first number: 5
Enter second number: 7
After swapping: first = 7, second = 5

Notes: The swap is accomplished by using a temporary variable to hold one of the values
during the exchange. This exercise demonstrates assignment operations. Both input values
are preserved and swapped without data loss. (No arithmetic trickery is used here to swap
to keep it clear.)

/*
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 22 - Swap Two Numbers
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-18
 Description: Swaps two integer values using a 
              temporary variable (temp) to ensure 
              no data loss during the exchange.
===================================================
*/


import java.util.*;

public class Swap_Two_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter Second Number: ");
        int secondNumber = input.nextInt();

        int temp = firstNumber ; 

        firstNumber = secondNumber ;

        secondNumber = temp; 
         

        System.out.println("After Swapping: first = " + firstNumber + ", second = " + secondNumber);

        input.close();  

    }
}
