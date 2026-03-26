/*
Exercise 9 — Reverse a Three-Digit Number
Description: Read a three-digit integer and print its reversal. For example, input 256 should
output 652. Input:- number : int (a three-digit number) Output: The number reversed
(with leading zeros dropped, e.g., 120 becomes 021 which prints as 21). Sample run:

Enter a three-digit number: 256
Reversed number = 652

===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
Exercise 9 — Reverse a Three-Digit Number
Author : BinSaleh (lusker1)
date : 3/13/2026
Description : Reverses a three-digit number (256 to 652) 
===================================================

*/

import java.util.*;

public class ReverseAThreeDigitNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three-digit number: ");
        int threeDigit = input.nextInt();

        int lastDigit = (threeDigit % 10 * 100);
        int middleDigit = (threeDigit / 10 % 10 * 10);
        int firstDigit = (threeDigit / 100 % 10);
        int reversedNumber = (lastDigit + middleDigit + firstDigit);
        System.out.printf("Reversed number: " + reversedNumber);

        input.close();
    }
}