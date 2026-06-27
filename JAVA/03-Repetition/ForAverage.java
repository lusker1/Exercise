/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Student Grades Average (For-Loop)
 * Date        : 2026-06-27
 * Description : A program that uses a for loop to collect 
 * grades for 6 students and calculates their average.
 * ===================================================
 */

import java.util.* ; 

public class ForAverage {
    public static void main(String[] args) {
         
        Scanner input = new Scanner (System.in) ; 

        int sum = 0 , grade = 0 ; 
        final int TOTAL_STUDENT = 6 ; 
        for(int counter = 1 ; counter<= TOTAL_STUDENT; counter++ ) {
            System.out.println("enter Grade : ");
            grade =input.nextInt() ;
            
            sum +=grade; 

        }
        System.out.println("The Average grades is " + ((double) sum / TOTAL_STUDENT) );
    }    
}
