/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : Exam Practice
 * Question    : Exercise 7 - Salary Calculator
 * Date        : 2026-04-04
 * Description : Calculate monthly salaries for 4 types 
 * of employees using switch-case and overtime logic.
 * ===================================================
 */
package ExerciseTAJ;

import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf(
                "Types of Employee \n \t W-Weekly Employee \n \t C-Commission Employee \n \t B-Base plus Commission \n \t H-Hourly Employee \n ");
        System.out.println("please choose one of (W, C, B, or H) :");
        char inputUser = input.next().charAt(0);
        double formula1 = 0;
        switch (inputUser) {
            case 'W':
                System.out.println("Enter Weekly Salary: ");
                double salaryW = input.nextDouble();

                formula1 = (salaryW * 4);

                break;

            case 'C':
                System.out.println("Enter your monthly Sales : ");
                double salaryC = input.nextDouble();

                formula1 = (salaryC * 0.15);
                break;

            case 'B':
                System.out.printf("Enter Your Monthly Salary: ");
                double SalaryB = input.nextDouble();

                System.out.printf("Enter your monthly sales:");
                double SalaryBV2 = input.nextDouble();
                formula1 = (SalaryB + (SalaryBV2 * 0.15));

                break;

            case 'H':
                System.out.println("Enter Your hourly payment and number of worked hours in this month : ");
                double hourlyPayment = input.nextDouble();
                double Overtime = input.nextDouble();

                if (Overtime > 160) {
                    double overTimeHours = Overtime - 160;
                    formula1 = (160 * hourlyPayment) + (overTimeHours * hourlyPayment * 1.5);
                } else {
                    formula1 = hourlyPayment * Overtime;
                    System.out.printf("Your Monthly Salary is :%.2f%n", formula1);
                }
                break;
            default:
                System.out.println(inputUser + " Error : Invalid char please choose one of (W, C, B, or H)");
        }
        System.out.printf("Your monthly Salary is : %.2f%n", formula1);

        input.close();
    }

}
