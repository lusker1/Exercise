/*
 * ===================================================
 * سبحان الله وبحمده سبحان الله العظيم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Distance Between Two Points
 * Date        : 2026-07-27
 * Description : Calculates the distance between two coordinate points using the standard distance formula.
 * ===================================================
 */

import java.util.*;

public class DistanceCalculator {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter point 1 (x1 , y1) :");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        
        System.out.print("Enter point 2 (x2 , y2) :");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();


        double[] print1 = { x1, y1 };
        double[] print2 = { x2, y2 };


        double distance = calculateDitance(print1, print2);
        System.out.println("Distance " + distance);

    }

    public static double calculateDitance(double[] print1, double[] print2) {

        return Math.sqrt(Math.pow(print2[0] - print1[0], 2) + Math.pow(print2[1] - print1[1], 2));
    }
}