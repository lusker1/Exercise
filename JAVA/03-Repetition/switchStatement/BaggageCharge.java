/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Saudi Airlines Baggage Calculator
 * Date        : 2026-07-01
 * Description : A program using switch-case to calculate excess 
 * baggage charges based on passenger flight class.
 * ===================================================
 */

import java.util.*;

public class BaggageCharge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter passenger's class");
        char ch = Character.toUpperCase(input.next().charAt(0));
        int wight, total = 1;
        switch (ch) {

            case 'F':
                System.out.println("Enter bag wight (Maximum 30 Kg)");
                wight = input.nextInt();

                if (wight > 30) {
                    System.out.println("You will pay 10SR each 1kg");

                    total = ((wight - 30) * 10);
                    System.out.println("total cost = " + total);
                }
                break;

            case 'B':
                System.out.println("Enter a bag wight (Maximum 20 kg)");
                wight = input.nextInt();

                if (wight > 25) {
                    System.out.println("You will pay 10SR each 1kg");

                    total = ((wight - 25) * 10);
                    System.out.println("total cost = " + total);

                }
                break;
            case 'E':

                System.out.println("Enter bag weight (Maximum 20 Kg)");
                wight = input.nextInt();

                if (wight > 20) {
                    total = ((wight - 20) * 10);
                    System.out.println("total cost = " + total + " SR");
                } else {
                    System.out.println("No excess baggage charge. Have a nice trip :)");
                }
                break;
            default:
                System.out.println("Invalid please enter one of (F , B , E)");
        }
        input.close();
    }
}