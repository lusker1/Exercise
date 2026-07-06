/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Fully Interactive Array Operations
 * Date        : 2026-07-06
 * Description : A Java program that takes dynamic arrays 
 * from the user and performs math operations using methods.
 * ===================================================
 */

import java.util.*;

public class JavaMethodsPractice {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // double[] 0 = { 9.8, 1.1, 55.0, 3.2, 12.5 }; // hardcoded

        // int[] evenOdd = {2 , 4 , 5 , 7 } ; // hardcoded

        System.out.println("How many numbers would you like to enter : ");
        while (!input.hasNextInt()) {
            System.out.println("please enter a integer number ");
            input.next();
        }
        int indexnumbers = input.nextInt();

        double[] arraysNumbers = new double[indexnumbers];

        for (int i = 0; i < arraysNumbers.length; i++) {
            System.out.println("enter number " + (i + 1) + " : ");
            while (!input.hasNextDouble()) {
                System.out.println("please enter a number");
                input.next();
            }
            arraysNumbers[i] = input.nextDouble();

        }

        System.out.println("sum = " + sumArrayItems(arraysNumbers));
        System.out.println("min number is = " + findMin(arraysNumbers));

        int[] finalCounts = countEvens(arraysNumbers) ; 
        System.out.println("Even numbers are = " + finalCounts[0]);
        System.out.println("Odd numbers are " + finalCounts[1]);
 
    }

    public static double sumArrayItems(double[] list) {
        double sum = 0;
        for (int i = 0; i < list.length; i++) {

            sum += list[i];
        }
        return sum;
    }

    public static double findMin(double[] list) {
        double min = list[0];

        for (int i = 1; i < list.length; i++) {

            if (min > list[i]) {
                min = list[i];
            }
        }
        return min;
    }

    public static int[] countEvens(double[] list) {

        int evennumbers = 0, oddNumbers = 0;

        for (int i = 0; i < list.length; i++) {

            if ((int)list[i] % 2 == 0) {
                evennumbers++;
            } else
                oddNumbers++;

        }
        int[] result = {evennumbers , oddNumbers} ; 
        return result; 


    }

}
