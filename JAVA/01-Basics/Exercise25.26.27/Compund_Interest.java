/*
Exercise 27 — Compound Interest
Description: Calculate the future value of an investment earning compound interest. The
program reads an initial principal P, an annual interest rate (percentage), and the number
of years t. It then computes the final amount using the formula A = P ×(1+ r
1
)t (assuming
interest is compounded yearly for simplicity). Input:- principal : double- annualRate :
double (percentage, e.g., 5 for 5%)- years : int Output: The amount accumulated after the
given years (principal + interest). Sample run:

Enter principal: 1000
Enter annual interest rate (%): 5
Enter number of years: 10
Final amount = 1628.894626777442

/*
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Author      : BinSaleh (lusker1)
 Exercise    : Exercise 27 - Compound Interest
 Date        : 2026-03-19
 Description : Calculates the future value (A) using 
               the compound interest formula with 
               Math.pow and nested parentheses.
===================================================
*/
import java.util.* ; 

public class Compund_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in );

        System.out.println("Enter Principal: ");
        double principal = input.nextDouble() ; 
        System.out.println("Enter annual interest rate (%) : ");
        double interestRate = input.nextDouble() ; 
        System.out.println("Enter number of years: ");
        int years = input.nextInt() ; 

        double furmula = principal * Math.pow((1 + interestRate/100/1), years) ;

        System.out.println("Final amount = " + furmula);

        input.close(); 
    }
}
