/*
Exercise 4 
Write a Java program that simulates primitive bank operations. The program will perform the 
following tasks:  
• Declare the amount variable and initialize it with the value 5000.  
• Print a menu of possible operations: 1) Amount, 2) Deposit, and 3) Withdraw.  
• Ask the depositor to choose an operation:  
o If the operation is 1, print the amount 
o If the operation is 2, ask the user to enter the amount to deposit and add it to the 
old amount and print the result.  
o If the operation is 3, ask the user to enter the amount to withdraw and add 
subtract it from the old amount (only if it is possible) and print the result.

Example 1:  
Choose an operation:  
1) Amount  
2) Deposit  
3) Withdraw  
Please choose 1, 2 or 3: 1  
The amount is 5000.000000.

Example 2:  
Choose an operation:  
1) Amount  
2) Deposit  
3) Withdraw  
Please choose 1, 2 or 3: 2  
Enter the amount to deposit: 300  
The new amount is 5300.000000.  


Example 3:  
Choose an operation:  
1) Amount  
2) Deposit  
3) Withdraw  
Please choose 1, 2 or 3: 3  
Enter the amount to withdraw: 3202  
The new amount is 1798.000000.

/*


 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : 01 - Selection (Lab 4)
 * Question    : Exercise 4 - Bank Operations
 * Date        : 2026-03-31
 * Description : Simple bank system using switch.
 * ===================================================
 

*/
package lab_4;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("choose an operation: \n 1) Amount \n 2) Deposit \n 3) Withdraw");
        System.out.println("plase choose 1, 2 or 3: ");
        int inputUser = input.nextInt();

        double Value = 5000;
        switch (inputUser) {

            case 1:
                System.out.println("the amount is: " + Value);
                break;
            case 2:
                System.out.println("Enter the amount to deposit: ");
                double deposit = input.nextDouble();

                double furmula1 = Value + deposit;

                System.out.println("The new Amount is " + furmula1);
                break;
            case 3:
                System.out.println("Enter the amount to withdraw: ");
                double withdraw = input.nextDouble();

                double furmula2 = Value - withdraw;
                if (Value < withdraw)
                    System.out.println("Error you can't withdraw  bcz Value less then withdraw");
                else
                    System.out.println("The new amount is: " + furmula2);
                break;
            default:
                System.out.println("Invalid please choose one of (1 , 2 or 3 ) ");

        }
        input.close();

    }
}