/*
Question 2 (Area Calculation for Geometric Shapes): 
Write a program that displays a menu with these shapes: 
1. Circle area 
2. Rectangle area 
3. Triangle area 
1 
• After the user selects a shape, prompt them for the necessary 
measurements: 
➢ Circle: radius 
➢ Rectangle: length and width 
➢ Triangle: base and height 
Use a switch statement to calculate the area based on the chosen shape. 
If the user enters an invalid choice, print an error message. 
Example: 
<><><><><><><><><><><>< MENU ><><><><><><><><><><><> 
|   
|   
|   
1) Circle area                                                                                                   
2) Rectangle area                                                                                           
3) Triangle area                                                                                              
| 
| 
| 
<><><><><><><><><><><><><><><><><><><><><><><><><><> 





Choose a shape (1-3): 1 
Enter the circle radius: 5 
The area of the circle = 78.5




/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : 03 - Switch Statements
 * Question    : Question 2 - Area Calculation
 * Date        : 2026-03-27
 * Description : Calculate area for different shapes using switch.
 * ===================================================
 */

package Programming_Practice_Ch3_Switch;

import java.util.*;

public class Area_Calculation_for_Geometric_Shapes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("=========MENU=========\n1-Circle area \n2-Rectangle area\n3-Traingle area\n");
        System.out.println("Enter number (1-3)");
        int number = input.nextInt();

        switch (number) {

            case 1:
                System.out.println("Circle area");
                System.out.println("Enter radius: ");
            double radius = input.nextDouble();
            double formula1 = (Math.pow(radius, 2) * Math.PI);
                System.out.println("Area = " + formula1);

                break;

            case 2:
                System.out.println("Rectangle area");
                System.out.println("Enter length and width");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
            double formula2 = (num1 * num2);
                System.out.println("Area = " + formula2);

                break;

            case 3:
                System.out.println("Traingle area");
                System.out.println("Enter base and height");
            double num3 = input.nextDouble();
            double num4 = input.nextDouble();
            double formula3 = (0.5 * num3 * num4);
                System.out.println("Area = " + formula3);

                break;

            default:
                System.out.println("invalid number please choose one of (1-3)");
        }
        input.close();
    }
}