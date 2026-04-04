/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : Exam Practice
 * Question    : Exercise 9 - Unit Conversion
 * Date        : 2026-04-04
 * Description : Convert data size from Bytes to KB 
 * using the constant 1024 and formatted output.
 * ===================================================
 */

package ExerciseTAJ;

import java.util.*;

public class Exercise9 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in) ; 

        

        System.out.println("Enter size in bytes : ");
        double bytes = input.nextDouble() ;
        double KB = bytes / 1024 ; 

        System.out.printf("KB = %.2f \n" , KB);

        if (KB < 100 ) {
            System.out.println("small file");
        } else 
            System.out.println("large file");
    }
}
