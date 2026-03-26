/*
Exercise 37 — Driving Cost Calculator
Description: Determine the cost of a road trip given the driving distance, vehicle fuel effi
ciency, and fuel price. The program reads the total distance (miles), the fuel efficiency in
miles per gallon (MPG), and the price of fuel per gallon. It then calculates the trip cost as

cost = distance / MPG × pricePerGallon.

Input:- distance : double (in miles)- mpg : double (fuel efficiency, miles per gallon)
pricePerGallon : double (in currency units, e.g., dollars) Output: The total fuel cost for the
trip. Sample run:

Enter distance (miles): 100
Enter fuel efficiency (mpg): 25
Enter price per gallon: 3
Trip cost = 12.0

/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Author      : BinSaleh (lusker1)
 Exercise    : Exercise 37 - Driving Cost Calculator
 Date        : 2026-03-25
 Description : This program calculates the total trip 
               fuel cost based on distance, fuel 
               efficiency, and price per gallon.
===================================================

*/
import java.util.*;
public class Driving_Cost_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ; 
        
        System.out.println("--- Driving Cost Calculator ---");
        System.out.printf("    Enter distance (Miles)\n: ");
        double distance = input.nextDouble() ; 

        System.out.printf("Enter fuel efficiency (mpg)\n: ");
        double mpg =  input.nextDouble() ; 

        System.out.printf("Enter price per gallon\n: ");
        double pricePerGallon = input.nextDouble() ;

        double cost = ((distance / mpg ) * pricePerGallon ) ; 

        System.out.println("Trip cost = " + cost );

        input.close(); 
    }    
}
