// Exercise 2: 
// Ask the user to enter 5 numbers, then find and print the largest and smallest numbers. 
 
// Run Example: 
// Enter 5 numbers: 
// 10 25 7 30 9 
// Largest number: 30 
// Smallest number: 7

/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Find Min/Max Using Java Streams
 * Date        : 2026-07-18
 * Description : An advanced and optimized solution to find the 
 * largest and smallest numbers using Java Stream API.
 * ===================================================
 */


import java.util.* ; 

public class fiveNumbers {

    static Scanner input = new Scanner (System.in) ;
    public static void main(String[] args) {
        
        double[] fiveNumbers = new double[5] ; 

        for(int i = 0 ; i < fiveNumbers.length ; i++) {

            System.out.println("Enter a number " + (i + 1));
            fiveNumbers[i] = input.nextDouble() ; 

        }
        System.out.println("Largest Number : " + Arrays.stream(fiveNumbers).max().getAsDouble());
        System.out.println("Smallest Number : " + Arrays.stream(fiveNumbers).min().getAsDouble());
     }
}