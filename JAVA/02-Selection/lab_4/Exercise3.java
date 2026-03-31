/*
Exercise 3 
Write a Java program to simulate a simple calculator. It should ask the user to enter a first number, 
the operation, and the second number. Addition ("+"), Subtraction ("-"), Division ("/"), 
Multiplication ("*"), and Modulus ("%") are the basic operations that should be implemented. Use 
the switch statement for the selection and the type char to represent the desired operation sign.  
When the operation sign is not recognized, your program should print an error message.  
Hints: (1) Declare a variable of type char for the operator, (2) Read the operation sign using 
input.next().charAt(0) where input is a variable of type Scanner, and (3) use operation signs (as 
char) in the switch’s cases (case ‘+’ :).  
Example 1: 
Enter first number: 10 
Enter operation (+, -, *, /, %): + 
Enter second number: 20 
Result: 30 

Example 2: 
Enter first number: 10 
Enter operation (+, -, *, /, %): ^ 
Enter second number: 2 
Error: Unknown operation!

/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : 01 - Selection (Lab 4)
 * Question    : Exercise 4 - Simple Calculator
 * Date        : 2026-03-31
 * Description : Basic calculator using switch and char.
 * ===================================================
 
*/

package lab_4;

import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        Double num1 = input.nextDouble();
        System.out.println("Enter operation (+ , - , * , / , % ): ");
        char operation = input.next().charAt(0);
        System.out.println("Enter second number : ");
        double num2 = input.nextDouble();

        switch (operation) {

            case '+':
                System.out.println("--- Addition Calculator ---");
                double formula1 = (num1 + num2);
                System.out.println("Result: " + formula1);
        break ;
            case '-':
                System.out.println("--- Subtraction Calculator ---");
                double formula2 = (num1 - num2);
                System.out.println("Result: " + formula2);
        break ;
            case '/':
                System.out.println("--- Division Calculator ---");
                double formula4 = (num1 / num2);
                System.out.println("Result: " + formula4);
        break ;
            case '*':
                System.out.println("--- Multiplication Calculator ---");
                double formula3 = (num1 * num2);
                System.out.println("Result: " + formula3);
        break ; 
            case '%':
                System.out.println("--- Modulus Calculator ---");
                double furmula5 = (num1 % num2);
                System.out.println("result: " + furmula5);
        break ; 
            default :
                System.out.println("Invalid operation please choose one of (+ , - , * , / , % ) ");
        }
        input.close(); 
    }
}
