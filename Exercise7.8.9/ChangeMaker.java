/*
Exercise 7 — Change Maker (Currency Denominations)
Description: Determine the smallest number of Saudi currency notes needed for a given
amount in SAR. The program takes an integer amount (in SAR) and breaks it down into 100,
50, 10, 5, and 1 SAR notes. Input:- amount : int Output: The count of each denomination
(100s, 50s, 10s, 5s, and 1s) that adds up to the amount. Sample run:

Enter an amount in SAR: 286
100 SAR notes: 2
50 SAR notes: 1
10 SAR notes: 3
5 SAR notes: 1
1 SAR notes: 1
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
Exercise 7 — Change Maker
Author : BinSaleh (lusker1)
Description: A simple program to calculate the number of Saudi notes needed for any given amount.
===================================================
*/

import java.util.*;

public class ChangeMaker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount in SAR :");
        int amount = input.nextInt();

        int sar100 = (amount / 100);
        System.out.println("100 SAR notes: " + sar100);
        int sar50 = ((amount % 100 / 50));
        System.out.println("50 SAR notes: " + sar50);
        int sar10 = ((amount % 100 % 50 / 10));
        System.out.println("10 SAR notes: " + sar10);
        int sar5 = ((amount % 100 % 50 % 10 / 5));
        System.out.println("5 SAR notes: " + sar5);
        int sar1 = ((amount % 100 % 50 % 10 % 5 / 1));
        System.out.println("1 SAR notes: " + sar1);

        input.close();
    }
}