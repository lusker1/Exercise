/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Java Logic and Methods Practices
 * Date        : 2026-07-07
 * Description : A simple program containing multiple methods 
 * to solve various math and logical problems.
 * ===================================================
 */

import java.util.*;

public class LogicMethodsPractice {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        factorial();
        calculateSum();
        oddnumbers();
        checkEachChar();
         System.out.println(isPalindrome());
         userPassword();

         
    }

    public static void factorial() {
        System.out.println("=== Welcome to N! program ===");
        System.out.println("Input : ");
        int n = input.nextInt();
        int product = 1;

        for (int i = 1; i <= n; i++) {

            product *= i;
        }
        System.out.println("Output = " + product);

    }

    public static void calculateSum() {
        input.nextLine();
        
        System.out.println("=== welcome to sum program (Enter 0 to Exit) ====");
        int sum = 0;

        for (;;) {

            System.out.println("Enter a number : ");
            while (!input.hasNextDouble()) {
                System.out.println("Erorr : please enter a number ");

                input.next();

            }
            double num = input.nextDouble();
            if (num == 0) {

                break;

            }
            sum += num;

        }

        System.out.println("sum = " + sum);
        System.out.println();
    }

    public static void oddnumbers() {
        input.nextLine();
        System.out.println("=== Welcome to range odd number ===");
        System.out.println("Enter number a : ");
        int a = input.nextInt();

        System.out.println("Enter number b : ");
        int b = input.nextInt();
        int counter = a;
        long product = 1;
        boolean hasOdd = false;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (counter = a; counter <= b;) {

            if (counter % 2 != 0) {
                product *= counter;
                hasOdd = true;
            }
            counter++;
        }
        if (hasOdd) {
            System.out.println("Product of odd numbers = " + product);
        } else {
            System.out.println("No odd numbers found in this range ");
        }

    }

    public static void checkEachChar() {
        System.out.println("==== welcome to the last program to compute how many letters and digits and Symbols ===");
        input.nextLine();

        System.out.println("Input : ");
        String userInput = "";

        userInput = input.nextLine();
        int letters = 0, digits = 0, symbols = 0, counter = 0;

        for (counter = 0; counter < userInput.length();) {

            char ch = userInput.charAt(counter);

            if (Character.isLetter(ch)) {
                letters++;

            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                symbols++;

            }
            counter++;
        }
        System.out.println("Letters=" + letters + ", Digits=" + digits + ", Symbols=" + symbols);

    }

    public static String isPalindrome() {
        System.out.println("=== Welcome to Palindrome Check ===");

        System.out.println("Input : ");
        String test = input.nextLine();

        String reversed = new StringBuilder(test).reverse().toString();

        if (test.equalsIgnoreCase(reversed)) {
            return "Palindrome";
        }
        return "Not palindrome";
    }

    public static void userPassword() {
        final String USERNAME = "admin";
        final String PASSWORD = "1234";

        for (;;) {
            System.out.println("Enter username : ");
            String user = input.nextLine();
            System.out.println("Enter password : ");
            String pass = input.nextLine();
            if (user.equals(USERNAME) && pass.equals(PASSWORD)) {

                System.out.println("Welcome, " + USERNAME);
                break;
            } else {
                System.out.println("Invalid please try again  .");
               // continue;
            }
        }
    }
}