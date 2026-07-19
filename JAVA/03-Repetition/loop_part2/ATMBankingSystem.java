/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : ATM Banking System Menu
 * Date        : 2026-07-19
 * Description : A robust Console-based ATM application featuring input 
 * validation, secure deposition, and multiple-of-100 withdrawal logic.
 * ===================================================
 */

import java.util.*;

public class ATMBankingSystem {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double BALANCE = 5000;
        for (;;) {
            System.out.println(
                    "====== BANK MENU ====== \r\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit\nEnter your choice");
            while (!input.hasNextInt()) {
                System.out.println("Error please enter a number ");
                input.next();
            }
            int choice = input.nextInt();
            switch (choice) {

                case 1:

                    System.out.println("Enter ammount to Deposit :");
                    while (!input.hasNextDouble()) {
                        System.out.println("Error please enter a number ");
                        input.next();
                    }
                    double deposit = input.nextDouble();
                    if (deposit > 0) {
                        System.out.println("Successfully deposited : " + deposit);
                        BALANCE = deposit + BALANCE;
                        System.out.println("New balance : " + BALANCE);
                    } else {
                        System.out.println("Erorr : please enter a positve number ");
                    }
                    break;
                case 2:

                    System.out.println("Enter amount to withdraw : ");
                    while (!input.hasNextDouble()) {
                        System.out.println("Error please enter a number ");
                        input.next();
                    }
                    double withdraw = input.nextDouble();

                    if (withdraw > 0 && withdraw % 100 == 0) {

                        if (withdraw <= BALANCE) {
                            System.out.println("Please collect your cash");
                            BALANCE = BALANCE - withdraw;
                            System.out.println("Remaining balance : $" + BALANCE);
                        } else {
                            System.out.println("Error: Insufficient funds!");
                        }

                    } else {
                        System.out.println("Erorr : please enter 100 multiplication");
                    }

                    break;

                case 3:
                    System.out.println("your total Balance is :$" + BALANCE);
                    break;

                case 4:
                    System.out.println("Thank you for banking with us! ");
                    System.out.println("Final balance is : $" + BALANCE);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Erorr : please enter one of (1 , 2 , 3 , 4) ");

            }

        }

    }
}