/*
Exercise 28 — Water Heating Energy
Description: Compute the energy required to heat a quantity of water by a certain tem
perature change. The program reads the mass of water in kilograms and the initial and
f
inal temperatures in Celsius, then calculates the energy Q in joules using the formula
Q = m×(Tfinal −Tinitial) × 4184. (The constant 4184 J/kg°C is the specific heat capac
ity of water.) Input:- mass : double (kilograms of water)- initialTemp : double (°C)f
inalTemp : double (°C) Output: The energy Q in joules required to heat the water. 
Sample run : 

Enter water mass (kg): 1
Enter initial temperature (C): 20
Enter final temperature (C): 100
Energy needed = 334720.0 J

/*
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise    : Exercise 28 - Water Heating Energy
 Author      : BinSaleh (lusker1)
 Date        : 2026-03-22
 Description : Computes the energy required to heat 
               water using the formula Q = m * ΔT * 4184.
===================================================
*/


import java.util.* ;
public class Water_Heating_Energy {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;

        System.out.println("Enter water mass (kg): ");
        double mass = input.nextDouble() ; 

        System.out.println("Enter initial temperature (C): ");
        double initial = input.nextDouble() ; 

        System.out.println("Enter final temperature (C): ");
        double finaltemperature = input.nextDouble() ; 


        double furmula = (mass * (finaltemperature - initial) * 4184) ; 
        System.out.println("Energy needed = " + furmula +" J ");

        input.close(); 

    }    
}
