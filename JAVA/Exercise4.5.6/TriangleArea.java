/*
Exercise 4 — Triangle Area
Description: Compute the area of a triangle using the 
formula area = 1/2 × base × height.
The program asks for the triangle’s base and height, then calculates the area.
input:- base: double- height : double Output: The area of the triangle. Sample run:

Enter base of the triangle: 10
Enter height of the triangle: 5
Triangle area = 25.0
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
Exercise: Exercise 4 — Triangle Area
Date: 3/12/2026
Author: BinSaleh (lusker1)
Description: Compute the area of a triangle using the formula: Area = 0.5 * base * height.
===================================================
*/
import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ; 
        System.out.println("Enter base of the triangle :" );
        double base = input.nextDouble() ; 
        System.out.println("Enter height of the triangle : ");
        double height = input.nextDouble() ; 

        double formula = (base*height*0.5) ; 

        System.out.println("Triangle area Equal =" + formula);

        input.close(); 
    }
}
