import java.util.*;

public class ArithmeticMenu {

/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Arithmetic Menu Calculator
 * Date        : 2026-06-23
 * Description : Menu-driven system for addition, subtraction, 
 * and squaring using optimized switch-case control flow.
 * ===================================================
 */
    public static void main (String [] args) {
    Scanner input = new Scanner (System.in) ; 

    System.out.printf("please choose one of (1-3)\n1.Add two numbers \n2. get THe Subtract of two numbers \n3.Get the square of a number\n");
    int choice = input.nextInt() ; 

    switch(choice) {

        case 1 : 
            System.out.println("Enter number one");
            int num1 = input.nextInt(); 
            
            System.out.println("Enter number two");
            int num2 = input.nextInt(); 

            double formula1 = num1 + num2 ; 

            System.out.println("Result : " + formula1 );

        break ; 

        case 2 : 
                  System.out.println("Enter number one");
            double num3 = input.nextDouble(); 
            
            System.out.println("Enter number two");
            double num4 = input.nextDouble(); 

            double formula2 = num3 - num4 ; 

            System.out.println("Result : " + formula2 );
        break ; 

        case 3 : 
            System.out.println("Enter the number");
            double num5 = input.nextDouble() ; 

            double formula3 = Math.pow(num5, 2) ; 

            System.out.println("Result: " + formula3);

            break ; 

        default : 
            System.out.println("Error: please choose one of (1-3)");
            
            input.close(); 
            return; 
    }
    }
}
