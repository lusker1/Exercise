/*
Question 3 (BMI Calculation): 
Write a program that displays a menu with the following conversion 
options: 
Celsius to Fahrenheit 
Fahrenheit to Celsius 
Kilometers to Miles 
Miles to Kilometers 
The user selects the type of conversion, then enters the value (e.g., 
temperature, distance) to convert. 
Use a switch statement to perform the selected conversion. 
Display the result. 
If the user enters an invalid choice, print an error message.

Example:
 ------------------------ MENU ------------------------------------ 
1) Celsius to Fahrenheit 
2) Fahrenheit to Celsius 
3) Kilometers to Miles 
4) Miles to Kilometers
 ---------------------------------------------------------------------- 
Choose a conversion (1-4): 1 
Enter the temperature in Celsius: 30 
Result: 86 Fahrenheit

/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : 03 - Switch Statements
 * Question    : Question 3 - Unit Conversion
 * Date        : 2026-03-27
 * Description : Convert temperatures and distances using switch.
 * ===================================================
 
*/

package Programming_Practice_Ch3_Switch;
import java.util.* ; 

public class Unit_Conversion {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in) ; 

        System.out.printf("=========MENU=========\n1-Celsius to Fahrenheit\n2-Fahrenheit to Celsius\n3-Kilometers to Miles\n4-Miles to Kilometers\n");
        System.out.println("Enter number (1-4)");
        int number = input.nextInt() ; 

        switch(number) {
            case 1 : 
            System.out.println("Celsius to Fahrenheit");
            System.out.println("Enter Celsius number: ");
        double C = input.nextDouble() ;
        
        double formula1 = ((C * 9/5 ) + 32 ) ; 
            
            System.out.println("Celsius to Fahrenheit Equal = " + formula1);

            break ; 

            case 2 : 
            System.out.println("Fahrenheit to Celsius");
            System.out.println("Enter Fahrenheit number: ");
            double F = input.nextDouble() ; 

        double formula2 = ((F - 32) * (5.0/9.0)) ; 
            
            System.out.println("Fahrenheit to Celsius Equal  = " + formula2);

            break; 

            case 3 :
                System.out.println("Kilometers to Miles");
                System.out.println("Enter Kilometers number: ");
            double kilometers = input.nextDouble() ; 

            double formula3 = (kilometers * 0.621371) ; 

            System.out.println("Kilometers to Miles Equal = " + formula3);

            break ; 

            case 4 :

                System.out.println("Miles to Kilometers: ");
                System.out.println("Enter Miles Number: ");
            double Miles = input.nextDouble() ; 

            double formula4 = (Miles/0.621371) ;

            System.out.println("Miles to Kilometers Equal = " + formula4);

            default :
                System.out.println("Invalid number please choose one of (1-4) ");
            
        }
        input.close();
    }   

}
