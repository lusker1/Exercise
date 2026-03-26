/*
Exercise 10 — Average of Five Numbers
Description: Calculate the average of five numbers. The program reads five numeric values
and computes their arithmetic mean. Input:- num1 : double- num2 : double- num3 :
double- num4 : double- num5 : double Output: The average of the five input values.
Sample run:

Enter five numbers: 1 2 3 4 6
Average = 3.2
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise    : 10 - Average of Five Numbers
 Author      : BinSaleh (lusker1)
 Date        : 3/14/2026
 Description : A Java program that takes five numbers from the user,calculates their total sum, and finds the average.
===================================================
*/
import java.util.*;

public class Average_of_FiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("---Average Calculator---\nEnter your first number:\n");
        double num1 = input.nextDouble();
        System.out.println("Enter Second Number :");
        double num2 = input.nextDouble();
        System.out.println("Enter your third number");
        double num3 = input.nextDouble();
        System.out.println("Enter your fourth number");
        double num4 = input.nextDouble();
        System.out.println("Enter fifth number");
        double num5 = input.nextDouble();

        double sum = ((num1 + num2 + num3 + num4 + num5));
        double average = sum / 5.0;

        System.out.println("-------------------------");
        System.out.println("Total Sum: " + sum);
        System.out.println("the average is: " + average);
        System.out.println("-------------------------");


        input.close();

    }

}
