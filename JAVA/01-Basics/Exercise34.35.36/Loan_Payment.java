/*
Exercise 36 — Loan Payment
Description: Calculate the monthly payment for a fixed-term loan. The program asks for
the loan amount, the annual interest rate (percent), and the loan duration in years. It then
computes the monthly payment using the standard formula for an installment loan:
M = rP / 1 −(1+r)−N

where P is the principal (loan amount), r is the monthly interest rate (annual rate divided
by 12 and 100), and N is the total number of monthly payments (years ×12). Input:
loanAmount : double- annualRate : double (percentage, e.g., 5 for 5% annual)- years : int
Output: The monthly payment amount. Sample run:

Enter loan amount: 10000
Enter annual interest rate (%): 5
Enter number of years: 5
Monthly payment = 188.7123364401099

/*
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Author      : BinSaleh (lusker1)
 Exercise    : Exercise 36 - Loan Payment
 Date        : 2026-03-24
 Description : This program calculates monthly loan 
               payments by converting annual rates 
               and years into a precise formula.
===================================================


*/
import java.util.*;

public class Loan_Payment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter loan amount: ");
        double P = input.nextDouble();

        System.out.println("Enter annual interest rate (%): ");
        double r = input.nextDouble();

        System.out.println("Enter number of years : ");
        double N = input.nextDouble();

        double rate = r / 1200;
        double n = N * 12;
        double formula = ((rate * P) / (1 - Math.pow(1 + rate, -n)));

        System.out.println("Monthly payment = " + formula);
    }
}
