/*
Exercise 3 
Write a Java program that determines whether a number n given by the user is a even 
(multiple of 2) or odd (not multiple of 2). 
Hint: Use the modulus (%) operator to determine whether a number is multiple to another. 

Output examples: 
Enter a number: 24 
24 is even. 
Enter a number: 17 
17 is odd. 

/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : 01 - Selection (Lab 3)
 * Question    : Exercise 3 - Even or Odd
 * Date        : 2026-03-28
 * Description : Determine if a number is even or odd using modulus.
 * ===================================================
 
*/
package lab_3;

import java.util.*;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt() ;

        if (number % 2 == 0 ) {
            System.out.println(number + " is Even ");
        } else if (number % 2 !=0 ) {
            System.out.println(number + " is odd. ");

        }
        input.close(); 
    }
}
