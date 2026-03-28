/* 
Exercise 4 
ATM withdrawal validator, you are an ATM, and the user wants to withdraw money from 
their account. Write a Java program to check if : 
1. The amount to withdraw is a multiple of 100. 
2. The account has enough balance. 
3. If the withdrawal got approved, deduct the amount from the balance and show the 
remaining balance  
4. Else, show an error message  
Note: Initial balance is 5000 
Output examples: 

Example 1: 
Enter the amount you want to withdraw: 1500 
Please collect your cash  
Remaining balance is: $3500 
Example 2: 
Enter the amount you want to withdraw: 75 
Error: The amount should be a multiple of 100  
Example 3: 
Enter the amount you want to withdraw: 5200 
Error: insufficient balance 

/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : 01 - Selection (Lab 3)
 * Question    : Exercise 4 - ATM Check
 * Date        : 2026-03-28
 * Description : Check money and balance for ATM.
 * ===================================================
 */


package lab_3;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 5000;

        System.out.println("Enter the amount want to withdraw: ");
        double withdraw = input.nextDouble();

        if (withdraw < balance && withdraw % 100 == 0) {
            System.out.println("please collect your cash");
            double formula1 = (balance - withdraw);
            System.out.println("Remaining balance is: " + formula1);

        } else if (withdraw > balance) {
            System.out.println("Error: insufficient balance ");
        } else if (withdraw % 100 != 0) {
            System.out.println("Error the amount should be a multiple of 100");
        }

    }
}
