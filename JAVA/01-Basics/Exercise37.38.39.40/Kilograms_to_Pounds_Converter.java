
/*
Exercise 39 — Kilograms to Pounds Converter
Description: Convert a weight from kilograms to pounds. The program reads a value in
kilograms and converts it using the conversion factor (1 kg = 2.20462 lb). Input:- kilograms
: double Output: The weight in pounds. 
Sample run:

Enter weight in kilograms: 50
Equivalent weight in pounds = 110.231

/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Author      : BinSaleh (lusker1)
 Exercise    : Exercise 39 - Kilograms to Pounds Converter
 Date        : 2026-03-25
 Description : This program converts weight from 
               kilograms to pounds using the 
               conversion factor 2.20462.
===================================================
*/


import java.util.*;

public class Kilograms_to_Pounds_Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in kilograms: ");
        double kilograms = input.nextDouble();

        double pounds = kilograms * 2.20462;

        System.out.println("Equivalent weight in pounds = " + pounds);

        input.close();
    }
}
