/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : Exam Practice
 * Question    : Exercise 8 - Car Insurance Logic
 * Date        : 2026-04-04
 * Description : Calculate insurance pricing with tiered 
 * discounts using switch-case and range handling via default.
 * ===================================================
 */
package ExerciseTAJ;

import java.util.*;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*** Welcome to the car insurance Calculator ***");
        System.out.println("is Your Driving license Valid ? (true / false)");
        boolean license = input.nextBoolean();
        if (license) {
            System.out.println("How many years have you had without accidents? ");
            int accidents = input.nextInt();

            final double BASE = 2000;

            switch (accidents) {
                case 0:
                    System.out.println("No discount Applied. ");
                    System.out.printf("Your final insurance price is : %.1f SAR %n " , BASE );
                    break;

                case 1:
                    System.out.println("You are eligible for a 15% discount. ");
                    double discount15 = BASE - (BASE * 0.15);
                    System.out.printf("your final insurance price is: %.1f SAR %n" , discount15 );
                    break;

                case 2:
                    System.out.println("You are eligible for a 30% discount.");
                    double discount30 = BASE - (BASE * 0.30);
                    System.out.printf("your final insurance price is: %.1f SAR %n" , discount30);

                    break;

                default:
                    if (accidents >= 3) {
                        System.out.println("You are eligible for a 40% discount");

                        double discount40 = BASE - (BASE * 0.40);

                        System.out.printf("your final insurance price is: %.1f SAR %n" , discount40 );
                    }

            }
        } else
            System.out.println("you must renew your license before calculating insurance");

            input.close(); 
    }
}
