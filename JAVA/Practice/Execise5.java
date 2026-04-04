/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : Exam Practice
 * Question    : Exercise 5 - BMI Calculator
 * Date        : 2026-04-04
 * Description : Calculate BMI and weight difference 
 * to reach normal range using formatted output.
 * ===================================================
 */
package ExerciseTAJ;

import java.util.*;

public class Execise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter your height in m : ");
        double height = input.nextDouble();

        System.out.println("Please enter your weight in kg : ");
        double weight = input.nextDouble();

        double bmi = (weight / Math.pow(height, 2));
        double low_normal = 18.5 * Math.pow(height, 2);
        double high_normal = 25 * Math.pow(height, 2);
        if (bmi < 15) {
            System.out.printf("Your BMI is: %.2f %n", bmi);

            System.out.printf("You are , Extremely underweight , you need to gain %.2f kgs %n ", (low_normal - weight));
        } else if (15 <= bmi && bmi <= 18.5) {
            System.out.printf("Your BMI is: %.2f %n", bmi);
            System.out.printf("You are , underweight , you need to gain %.2f kgs %n", (low_normal - weight));

        } else if (18.5 <= bmi && bmi <= 25) {

            System.out.printf("Your BMI is: %.2f %n", bmi);
            System.out.printf("you are in , normal weight , %.2f kgs %n ", bmi);
        } else if (25 < bmi && bmi < 30) {
            System.out.printf("Your BMI is: %.2f %n", bmi);
            System.out.printf("you are , overweight , you need to loose %.2f kgs %n ", (weight -high_normal));
        } else if (30 < bmi && bmi <= 35) {
            System.out.printf("Your BMI is: %.2f %n", bmi);
            System.out.printf("you are , obese , you need to loose %.2f kgs %n ", (weight - high_normal));
        } else if (bmi > 35) {
            System.out.printf("Your BMI is: %.2f %n ", bmi);
            System.out.printf("You are Extremely obese , you need to loose %.2f kgs %n ", ( weight - high_normal));

        }
        input.close();
    }
}
