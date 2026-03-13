/*

Exercise 8 — Sum of Digits (Three-Digit Number)
Description: Read a three-digit integer and compute the sum of its digits. For example, if
the input is 374, the sum is 3 + 7 + 4 = 14. Input:- number : int (a three-digit number,
e.g., 100–999) Output: The sum of the three individual digits. Sample run

Enter a three-digit number: 374
Sum of digits = 14

===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
Exercise 8 — Sum of Digits
Author : BinSaleh (lusker1)
date : 3/13/2026
Description:A program that reads a three-digit integer and calculates the sum of its digits.
===================================================

*/

import java.util.*;

public class SumofDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a Three-digit number: ");
        int threeDigit = input.nextInt();

        int ones = (threeDigit % 10);
        int tens = (threeDigit / 10 % 10);
        int hundreds = (threeDigit / 100 % 10);
        int sum = (ones + tens + hundreds);
        System.out.println("Sum of digits: " + sum);

        input.close();

    }
}