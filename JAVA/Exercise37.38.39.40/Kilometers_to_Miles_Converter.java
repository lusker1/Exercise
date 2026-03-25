/*
Exercise 38 — Kilometers to Miles Converter
Description: Convert a distance from kilometers to miles. The program reads a distance
in kilometers and outputs the equivalent distance in miles. (1 kilometer is approximately
0.621371 miles.) Input:- kilometers : double Output: The distance in miles. 
Sample run

Enter distance in kilometers: 10
Equivalent distance in miles = 6.21371

/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Author      : BinSaleh (lusker1)
 Exercise    : Exercise 38 - Kilometers to Miles Converter
 Date        : 2026-03-25
 Description : This program converts distance from 
               kilometers to miles using the 
               conversion factor 0.621371.
===================================================

*/
import java.util.*;
public class Kilometers_to_Miles_Converter {
    public static void main (String [] args) {

    Scanner input = new Scanner (System.in) ; 

        System.out.println("Enter distance in kilometers: ");
        double kilometers = input.nextDouble() ; 

        double converter = kilometers * 0.621371 ;
        System.out.println("Equivalent distance in miles = " + converter);
    }
}
