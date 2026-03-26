
/*
Exercise 12 — Simple Interest
Description: Calculate simple interest on a principal amount. Given principal P, annual
interest rate (as a percentage), and time t in years, compute the interest I = P × r × t
(where r is the annual rate in decimal form) and the total amount P +I. Input:- principal
: double- annualRate : double (percentage, e.g., enter 5 for 5%)- years : int Output: The
interest accrued and the total amount after the given years. Sample run:

Enter principal: 1000
Enter annual interest rate (%): 5
Enter time in years: 2
Interest earned = 100.0
Total amount = 1100.0
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : 12 - Simple Interest Calculator
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-14
 Description: Calculates simple interest (I = P * r * t) and 
              the total amount based on user input.
===================================================

*/
import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("--- Simple Interest Calculator ---");
        System.out.println("Enter principal (P): ");
        double P = input.nextDouble();
        System.out.println("Enter annual interest  rate (r)  in %: ");
        double r = input.nextDouble();
        System.out.println("Enter time in years (t): ");
        double t = input.nextDouble();

        double I = (P * r / 100 * t);
        double totalAmount = P + I;
        System.out.println("------------------------------");
        System.out.println("Interest earned = " + I);
        System.out.println("Total amount    = " + totalAmount);
        System.out.println("------------------------------");

        input.close();

    }
}
