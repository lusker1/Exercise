/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : Exam Practice
 * Question    : Exercise 10 - BMI Categories
 * Date        : 2026-04-04
 * Description : Calculate Body Mass Index (BMI) and 
 * determine weight category using if-else logic.
 * ===================================================
 */
package ExerciseTAJ;

import java.util.*;

public class Exercise10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight (kg) : ");
        double weight = input.nextDouble();

        System.out.println("Enter height (m) : ");
        double height = input.nextDouble();

        double BMI = weight /  Math.pow(height, 2);

        if (BMI < 18.5) {
            System.out.printf("BMI = %.2f%n" , BMI);
            System.out.println("You are Underweight");
        } else if (BMI < 25) {
            System.out.printf("BMI = %.2f%n" , BMI);
            System.out.println("You are normal weight");
        } else if (BMI < 30) {
            System.out.printf("BMI = %.2f%n" , BMI);
            System.out.println("You are Overweight");
        } else if (BMI > 30) {
            System.out.printf("BMI = %.2f%n" , BMI);
            System.out.println("You are Obese");
        }
        input.close(); 
    }
}