/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Product of Even Numbers in Range
 * Date        : 2026-06-24
 * Description : A program that takes two numbers from the user 
 * and multiplies all the even numbers between them.
 * ===================================================
 */

import java.util.*;

public class EvenRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 0;
        System.out.println("Enter a: ");
        a = input.nextInt();

        System.out.println("Enter b: ");
        b = input.nextInt();
        int counter = a;

        long prudoct = 1;
        while (counter <= b) {

            if (counter % 2 == 0) {
                prudoct  *= counter ; 
            } 
            counter ++ ;

        }

        System.out.println("The product of odd numbers bettwen [" + a + " , " + b + "] " + prudoct );
    }

}