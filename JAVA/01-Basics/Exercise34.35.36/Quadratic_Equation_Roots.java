/*
Exercise 34 — Quadratic Equation Roots
Description: Solve a quadratic equation of the form ax2+bx+c = 0 by finding its roots. The
program reads coefficients a, b, and c and calculates the roots using the quadratic formula:
x = −b±√b2 −4ac / 2a
.
Input:- a : double- b : double- c : double Output: The two roots of the quadratic equation
(which may be equal for a perfect square, or real/identical if the discriminant b2 −4ac ≥ 0).
Sample run:

Enter a, b, c: 1-5 6
Roots: 2.0 and 3.0

/*
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Author      : BinSaleh (lusker1)
 Exercise    : Exercise 34 - Quadratic Equation Roots
 Date        : 2026-03-24
 Description : This program solves quadratic equations 
               using the quadratic formula and 
               the discriminant (D) to find x1 and x2.
===================================================

*/
import java.util.*;;

public class Quadratic_Equation_Roots {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double D = Math.pow(b, 2) - 4 * a * c;

        double x1 = ((-b + Math.sqrt(D)) / (2 * a));

        double x2 = ((-b - Math.sqrt(D)) / (2 * a));

        System.out.println("D Equal = " + D);

        System.out.println("x1 Equal = " + x1);

        System.out.println("x2 Equal = " + x2);

        input.close();
    }
}
