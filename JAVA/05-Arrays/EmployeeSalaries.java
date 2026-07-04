/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Dynamic Salaries Array
 * Date        : 2026-07-04
 * Description : A simple program that inputs salaries into 
 * an array and calculates their sum and average.
 * ===================================================
 */
import java.util.*;

public class EmployeeSalaries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;

        System.out.println("Enter Size of array");
        size = input.nextInt();

        double[] salaries = new double[size];
        // double[] sales = {12.5 , 45.9 , 90. , 60.3} ; you can use {} in arrays
        double sum = 0;

        for (int i = 0; i < salaries.length; i++) {

            System.out.println("Enter salary for Employee No " + (i + 1));
            salaries[i] = input.nextDouble();
            sum += salaries[i];

        }

        System.out.println("the sum of slaries is " + sum);
        System.out.println("the average of slaries is " + sum / salaries.length);
    }
}