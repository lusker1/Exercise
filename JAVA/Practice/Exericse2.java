/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : Exam Practice
 * Question    : Exercise 2 - Mileage Charges
 * Date        : 2026-04-03
 * Description : Calculate travel charges based on distance.
 * ===================================================
 */
package ExerciseTAJ;

import java.util.*;

public class Exericse2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Initial Mileage in km : ");
        double initial = input.nextDouble();

        System.out.println("Enter the New Mileagge in km : ");
        double distance = input.nextDouble();

        double formula1 = distance - initial;
        double formula2 = formula1 * 0.5;

        if (formula1 > 150 && formula1 <= 900) {
            System.out.println("The travelled  distance is " + formula1 + " km");

            System.out.println("The applied charged amount is " + formula2 + " Riyals");
        } else if (formula1 <= 150) {
            System.out.println("The Travelled distance is " + formula1 + " km");
            System.out.println("No charges are applied.");
        } else if (formula1 > 900) {
            System.out.println("The travelled distance is " + formula1 + " km");
            System.out.println("The applied charged amount is " + "500.00" + " Riyals");
        }
        input.close();

    }
}
