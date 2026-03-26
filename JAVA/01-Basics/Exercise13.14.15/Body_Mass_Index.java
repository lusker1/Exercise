/*
Exercise 14 — Body Mass Index (BMI)
Description: Compute a person’s Body Mass Index given their weight and height. The
formula for BMI is BMI = weight (kg)
height (m)2
. The program asks for weight in kilograms and height
in meters and outputs the BMI value. Input:- weight : double (in kilograms)- height :
double (in meters) Output: The BMI value as a number (kg/m²). Sample run:

Enter weight (kg): 70
Enter height (m): 1.75
BMI = 22.857142857142858

/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 14 - Body Mass Index (BMI)
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-16
 Description: Calculates BMI using the formula: 
              weight / (height * height).
===================================================


*/
import java.util.* ; 

public class Body_Mass_Index {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in) ; 

    System.out.println("Enter weight (kg): ");
    double weight = input.nextDouble() ;

    System.out.println("Enter height (m)");
    double height = input.nextDouble() ;

    double bmi = (weight / (height * height) ) ; 

    System.out.printf("BMI: %.2f%n", bmi );

    input.close(); 
}    
}
   