/*
Exercise 15 — Celsius to Fahrenheit
Description: Convert a temperature from Celsius to Fahrenheit. This is the inverse of the
previous temperature exercise. Use the formula F = 9/5
C + 32. Input:- tempC : double
(temperature in Celsius) Output: Equivalent temperature in Fahrenheit. Sample run:

Enter temperature in Celsius: 100
100.0 C = 212.0 F

/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 15 - Celsius to Fahrenheit
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-16
 Description: Converts Celsius to Fahrenheit using 
              the formula: (C * 9.0/5) + 32.
===================================================


*/
import java.util.*;
public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter temperature in Celsius: ");
        double tempC = input.nextDouble() ;

        double furmula =  ((tempC * 9.0/5) + 32)  ;
        
        System.out.printf("%.1f C = %.1f F%n", tempC , furmula);

        input.close(); 
    }
}
