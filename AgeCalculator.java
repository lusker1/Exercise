/*
Exercise 1 — Age Calculator

Description: Calculate a person’s age based on their birth year and the current year. The
program asks for the current year and the person’s birth year, then computes the age by
simple subtraction. Input:- currentYear : int- birthYear : int Output: The person’s age in
years (currentYear − birthYear). Sample run:

Enter the current year: 2025
Enter your birth year: 1990
Your age is 35 years.
===================================================
Exercise 1 — Age Calculator
Date : 3/11/2026
Author : BinSaleh 
Description: A program to calculate a person's age based on their birth year and the current year
===================================================

*/

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Current Year : ");
        int currentYear = input.nextInt();
        System.out.println("Enter Your Birth : ");
        int birthYear = input.nextInt();
        System.out.println("your age is : " + (currentYear - birthYear));

        input.close();
    }
}