/*

Exercise 33 — Dollar and Cents Splitter
Description: Given a monetary amount in dollars (with cents), separate it into whole dollars
and remaining cents. For example, 12.75 dollars should be split into 12 dollars and 75 cents.
Input:- amount : double (a monetary amount, e.g., 12.75) Output: The dollar part and the
cent part separately. Sample run:

Enter an amount in dollars: 12.75
That is 12 dollar(s) and 75 cent(s)


/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Author      : BinSaleh (lusker1)
 Exercise    : Exercise 33 - Dollar and Cents Splitter
 Date        : 2026-03-23
 Description : This program splits a total amount 
               into whole dollars and remaining cents 
               using modulo and integer casting.
===================================================


*/
import java.util.*;

public class Dollar_and_Cents_Splitter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount in dollars: ");
        double dollars = input.nextDouble() ;    

        int wholeDollars = (int) dollars ; 

        int cents = (int) Math.round((dollars % 1) * 100 ) ; 
        System.out.println("that is " + wholeDollars + " dollar(s) and " + cents + " cent(s) ");

        input.close(); 
        
    }
}
