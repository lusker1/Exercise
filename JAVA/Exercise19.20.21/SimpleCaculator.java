/*
Exercise 21 — Simple Calculator
Description: Perform basic arithmetic operations on two numbers. The program reads two
numbers (as doubles) and computes their sum, difference, product, and quotient. It then
displays all four results. Input:- number1 : double- number2 : double Output: The sum,
difference, product, and quotient of the two numbers. Sample run:

Enter two numbers: 8 3
Sum = 11.0
Difference = 5.0
Product = 24.0
Quotient = 2.6666667

===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 21 - Simple Calculator
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-18
 Description: A simple calculator that performs 
              basic math (+, -, *, /) on two numbers. 
              Uses printf for clean output formatting.
===================================================
*/
import java.util.*;

public class SimpleCaculator {
    public static void main(String[] xxxx) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Simple Calcolator ---");
        System.out.println("Enter two Numbers: ");

        double numberOne = input.nextDouble();
        double numberTwo = input.nextDouble();

        double sum = (numberOne + numberTwo);
        double difference = (numberOne - numberTwo);
        double product = (numberOne * numberTwo);
        double quotient = (numberOne / numberTwo);

        System.out.println("==============================");
        System.out.println("sum Equal = " + sum);
        System.out.println("Differnce Equal = " + difference);
        System.out.println("Product Equal = " + product);
        System.out.printf("Quotient Equal = %.2f%n", quotient);
        System.out.println("==============================");

    }
}
