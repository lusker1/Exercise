/*
Question 3 (BMI Calculation): 
Write a program that asks the user for their weight (in kilograms) and 
height (in meters). Calculate their Body Mass Index (BMI) using the 
formula: 

BMI = Weight (kg) / Height (m)

Based on the BMI value, print their weight category: 
• Less than 18.5: Underweight 
• Between 18.5 and 24.9: Normal weight 
• 25 or more: Overweight 

Example: 
➔ Input: 
➔ Weight: 85 
➔ Height: 1.75 
➔ Output: Your BMI is 27.8. You are overweight.
/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Author      : BinSaleh (lusker1)
 Section     : 02 - Selection and Logic
 Question    : Question 3 - BMI Calculation & Category
 Date        : 2026-03-26
 Description : Calculates BMI using weight and height, 
               then categorizes the result using 
               if-else if logic.
===================================================

*/
package Programming_Practice_Ch3_Switch;

import java.util.*;

public class BMI_Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight (kg): ");
        double weight = input.nextDouble();

        System.out.println("Enter Height (m): ");
        double Height = input.nextDouble();

        double BMI = (weight / Math.pow(Height, 2));

        
        String category ; 
        if (BMI < 18.5) {
            category = "underweight";
        } else if (BMI <= 24.9) {
            category = "Normal weight";
        } else {
            category = "Overweight";
        }
        System.out.printf("The BMI are Equal = %.1f . You are %s.%n", BMI, category);
    }
}
