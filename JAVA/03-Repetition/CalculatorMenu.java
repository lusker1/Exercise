/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Combining Do-While Loop with Switch-Case Calculator
 * Date        : 2026-06-27
 * Description : A calculator program using do-while loop and 
 * switch-case to perform arithmetic operations.
 * ===================================================
 */
import java.util.*;
 
public class CalculatorMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;
        double num1, num2;

        do {
            System.out.println("\nchoose a number (1: Sum, 2: Sub, 3: Mul, 0: Exit): ");
            option = input.nextInt();
            switch (option) {

                case 0:
                    System.out.println("good bye");
                    break;

                case 1:
                    System.out.println("Enter number one = ");
                    num1 = input.nextDouble();

                    System.out.println("Enter number two = ");
                    num2 = input.nextDouble();

                    System.out.println("Sum = " + (num1 + num2));

                    break;
                case 2:
                    System.out.println("Enter number one = ");
                    num1 = input.nextDouble();

                    System.out.println("Enter number two = ");
                    num2 = input.nextDouble();

                    System.out.println("sub = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Enter number one = ");
                    num1 = input.nextDouble();

                    System.out.println("Enter number two = ");
                    num2 = input.nextDouble();

                    System.out.println("Mul = " + (num1 * num2));
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 0);

    }
}
