/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : Exam Practice
 * Question    : Exercise 6 - Shipping Cost Logic
 * Date        : 2026-04-04
 * Description : Compute shipping fees using weight-based 
 * formulas and apply premium discounts via nested selection.
 * ===================================================
 */
package ExerciseTAJ;

import java.util.*;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter package weight (lbs): ");
        double weight = input.nextDouble();

        System.out.println("Are you a premium member? (true / false )");
        boolean memeber = input.nextBoolean();

        double baseCost = 0;

        if (weight <= 5) {
            baseCost = 5 + weight * 1.50;

        } else if (weight <= 20) {
            baseCost = 10 + (weight - 5.0) * 1.25;
        } else {
            baseCost = 30 + (weight - 20.0) * 1.10;
        }
        if (memeber) {
            double discount = baseCost * 0.40;
            double finalprice = baseCost - discount;

            System.out.printf("base  Shipping Cost : $ %.2f%n ", baseCost);
            System.out.printf("Premium Member Discount: -$ %.2f%n", discount);
            System.out.printf("The final shipping cost is $ %.2f%n", finalprice);

        } else {
            System.out.printf("The final shipping cost is $ %.2f%n ", baseCost);
        }
        input.close();
    }

}