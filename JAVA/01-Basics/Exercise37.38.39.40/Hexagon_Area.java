/*
Exercise 40 — Hexagon Area
Description: Calculate the area of a regular hexagon given the length of one side. The
formula for the area of a regular hexagon is
Area = 3√3 / 2 s^2

where s is the side length. Input:- side : double Output: The area of the hexagon. 
Sample run:

Enter side length of hexagon: 5
Hexagon area = 64.9519052838329

/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Author      : BinSaleh (lusker1)
 Exercise    : Exercise 40 - Hexagon Area
 Date        : 2026-03-25
 Description : This program calculates the area of a 
               regular hexagon using its side length 
               and the geometric formula.
===================================================

*/
import java.util.*;

public class Hexagon_Area {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in) ; 

        System.out.println("Enter side length of hexagon: ");
        double s = input.nextDouble() ; 

        double Area = ((Math.sqrt(3)*3/2) * Math.pow(s, 2)) ;  

        System.out.println("Hexagon Area = " + Area);
    }
}
