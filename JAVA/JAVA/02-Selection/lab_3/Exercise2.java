/*
Exercise 2 
Write a Java program that determines if a number n given by the user is multiple of 11 and 
smaller than 100. Handle all (4) possible cases.  

Output examples: 
Enter a number: 77 
77 is a multiple of 11 and 
smaller than 100. 
Enter a number: 121 
121 is a multiple of 11 but not 
smaller than 100. 
Enter a number: 45 
45 is not a multiple of 11 but 
is smaller than 100. 
Enter a number: 150 
150 is not a multiple of 11 and 
not smaller than 100.

/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Exercise 2 - Multiples of 11
 * Date        : 2026-03-28
 * Description : Handle 4 cases for multiples of 11 and size.
 * ===================================================
 
*/
package lab_3;

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double a = input.nextDouble();

     if (a < 100 && a % 11 == 0 ) {
        System.out.println(a + " is a multiple of 11 and smaller than 100. ");
     }
     else if (a >= 100 && a % 11 == 0 ) {
        System.out.println(a + " is a multiple of 11  but not smaller than 100. ");
     }
     else if (a < 100 && a % 11 != 0 ) {
        System.out.println(a + " is not a multiple of 11 but is smaller than 100. ");
     }else 
        System.out.println(a + " is not a multiple of 11 and not smaller than 100. ");
        input.close(); 
    }
}
