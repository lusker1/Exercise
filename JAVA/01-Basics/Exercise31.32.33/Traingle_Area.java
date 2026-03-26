/*
Exercise 31 — Triangle Area (Heron’s Formula)
Description: Compute the area of a triangle given the lengths of all three sides, using Heron’s
formula. Heron’s formula states:
Area = /---------------------
      /s(s −a)(s −b)(s −c),



where a, b, c are the side lengths and s = a+b+c/2
is the semi-perimeter. Input:- a : double
b : double- c : double Output: The area of the triangle. 
Sample run:
Enter side lengths a, b, c: 5 5 6
Triangle area = 12.0

/*
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Author      : BinSaleh (lusker1)
 Exercise    : Exercise 31 - Triangle Area
 Date        : 2026-03-23
 Description : Computes the area of a triangle using 
               Heron’s formula with Math.sqrt and 
               semi-perimeter calculations.
===================================================
*/


import java.util.*;

public class Traingle_Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side lengths: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double s = ((a + b + c) / 2);

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Triangle area = " + area);
        
        input.close(); 
        
    }
}
