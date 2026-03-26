/*
Question 2 (Temperature Advice):
Write a program that asks the user for the current temperature and
suggests an action based on the temperature:
• Less than 20°C: It's cold, wear warm clothes.
• Between 20°C and 30°C: The weather is nice, enjoy your day!
• More than 30°C: It's hot, drink plenty of water.
Example 2 :
➔ Input: 18.2
➔ Output: It's cold, wear warm clothes.

/*
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Author      : BinSaleh (lusker1)
 Section     : 02 - Selection and Logic
 Question    : Question 2 - Temperature Advice
 Date        : 2026-03-26
 Description : Provides weather-based advice using 
               if-else if logic based on temperature.
===================================================

 */
package Programming_Practice_Ch3_Switch;

import java.util.*;

public class Temperature_Advice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        double num = input.nextDouble();

        if (num < 20) {
            System.out.println("It's cold , wear warm clothes.");
        } else if (num < 30) {
            System.out.println("The weather is nice, Enjoy your day ! ");

        } else if (num >= 30) {
            System.out.println("Its hot, drink plenty of water");
        }

        input.close(); 
    }
}
