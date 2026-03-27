/*
Question 1 (Simple Calculator): 
Write a program that displays a menu with the following options: 
1. Addition 
2. Subtraction 
3. Multiplication 
4. Division 
• Prompt the user to enter the number of the desired operation (1–4). 
• After the user chooses the operation, ask them to enter two numbers. 
➢ Use a switch statement to perform the selected operation. 
Display the result. 
If the user enters an invalid choice, print an error message. 
Example: ---------------------------------- MENU ---------------------------------- 
1) Addition 
2) Subtraction 
3) Multiplication 
4) Division 
Choose an operation (1-4): 2 
Enter the first number: 12 
Enter the second number: 5 
Result: 7

/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : 03 - Switch Statements
 * Question    : Question 1 - Simple Calculator
 * Date        : 2026-03-27
 * Description : Perform basic math operations using switch.
 * ===================================================
 

*/
package Programming_Practice_Ch3_Switch;

import java.util.*;

public class Simple_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("=========MENU=========\n1-Addition\n2-subtraction\n3-multiplication\n4-Division\n");
        System.out.println("Enter number (1-4)");
        int number = input.nextInt();

        switch (number) {
            case 1:
                    System.out.println("Addition");
                    System.out.println("Enter 2 numbers: ");
                double add1 = input.nextDouble();
                double add2 = input.nextDouble();

                double formula1 = (add1 + add2);
                    System.out.println("Addition will be: " + formula1);
                break ; 
            case 2:
                    System.out.println(" Subtraction ");
                    System.out.println("Enter 2 numbers: ");
                double add3 = input.nextDouble();
                double add4 = input.nextDouble();

                double formula2 = (add3 - add4);
                    System.out.println("Subtraction will be: " + formula2);
                break ;
            case 3:
                    System.out.println("Multiplication");
                    System.out.println("Enter 2 numbers: ");
                double add5 = input.nextDouble();
                double add6 = input.nextDouble();
                double formula3 = ( add5 * add6 ) ; 
                    System.out.println("Multiplication will be: " + formula3);
                break ; 
            case 4 : 
                    System.out.println("Division");
                      System.out.println("Enter 2 numbers: ");
                double add7 = input.nextDouble();
                double add8 = input.nextDouble();
                double formula4 = (add7 / add8 ) ; 
                    System.out.println("Division will be: " + formula4);
                break ; 
            default :
            System.out.println("Invalid number please choose one of: (1-4) ");

        }
        input.close();
    }
}
