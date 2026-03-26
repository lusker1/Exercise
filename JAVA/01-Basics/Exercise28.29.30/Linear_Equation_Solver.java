/*
Exercise 29 — Linear Equation Solver (2×2)
Description: Solve a system of two linear equations with two unknowns. The equations are:
ax +by =e
cx +dy =f,
with input coefficients a,b,c,d,e,f. The program calculates the solution (x,y) using Cramer’s
rule:
x = ed−bf / ad −bc , y= af−ec / ad −bc .
Input:- a : double- b : double- c : double- d : double- e : double- f : double Output:
The solution values x and y. 
Sample run:

Enter a, b, c, d, e, f: 2 3 1 1 13 5
Solution: x = 2.0, y = 3.0

/*
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Author      : BinSaleh (lusker1)
 Exercise    : Exercise 29 - Linear Equation Solver
 Date        : 2026-03-22
 Description : Solves a 2x2 system of linear equations 
               using Cramer’s rule (determinants) with 
               high precision double values.
===================================================


*/

import java.util.*;

public class Linear_Equation_Solver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ; 

        System.out.println("a, b, c, d, e, f: ");
        double a = input.nextDouble() ; 
        double b = input.nextDouble() ;
        double c = input.nextDouble() ;
        double d = input.nextDouble() ; 
        double e = input.nextDouble() ;
        double f = input.nextDouble() ; 


        double x = ((e*d - b*f) / (a*d - b*c)) ; 
        double y = (( a*f - e*c ) / (a*d - b*c)) ; 

        System.out.println("x = " + x + " y = " + y);

        input.close(); 
    }    
}
