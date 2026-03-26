/*
Exercise 23 — Right Triangle Hypotenuse
Description: Given the lengths of the two legs of a right triangle, compute the length of the
hypotenuse using the Pythagorean theorem. The formula is c = √a2 +b2, where a and b
are the leg lengths and c is the hypotenuse. Input:- a : double- b : double Output: The
hypotenuse length c. Sample run:

Enter side a: 3
Enter side b: 4
Hypotenuse = 5.0

Notes: We use Math.sqrt to calculate the square root. In the example, the classic 3-4-5
triangle returns an integer value 5.0. In general, the result could be an irrational number for
non-Pythagorean triples. The inputs and output are doubles.

===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 23 - Right Triangle Hypotenuse
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-18
 Description: Calculates the hypotenuse of a right 
              triangle using the Pythagorean theorem 
              c = √(a² + b²) with Math.sqrt and Math.pow.
===================================================


*/

import java.util.*;

public class Right_Triangle_Hypotenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side a: ");
        double a_Side = input.nextDouble();
        System.out.println("Enter side b: ");
        double b_Side = input.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(a_Side , 2 ) + Math.pow(b_Side , 2 ));

        System.out.println("Hypotenuse = " + hypotenuse);


        input.close(); 
    }
}
