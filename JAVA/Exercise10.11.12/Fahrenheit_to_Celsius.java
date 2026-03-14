
/*
Exercise 11 — Fahrenheit to Celsius
Description: Convert a temperature from Fahrenheit to Celsius. The program asks for
a temperature in degrees Fahrenheit and converts it using the formula 
C = 5 / 9 × (F − 32).
Input:- tempF : int (temperature in Fahrenheit) Output: Equivalent temperature in Celsius.
Sample run:
Enter temperature in Fahrenheit: 212
212 F = 100.0 C

===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : 11 - Fahrenheit to Celsius
 Author     : BinSaleh (lusker1)
 Date       : 3/14/2026
 Description: A program that converts temperature from 
              Fahrenheit to Celsius using the formula C = 5/9 * (F-32).
===================================================
*/
import java.util.*;

public class Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Tempreature in Fahrenheit: ");
        double fahrenhiet = input.nextDouble();
        double C = (5.0 / 9 * (fahrenhiet - 32));
        System.out.println("------------------------");
        System.out.println(fahrenhiet + " F " + C + " C ");
        System.out.println("------------------------");
        
        input.close(); 
    }
}
