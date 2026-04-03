/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : Exam Practice
 * Question    : Exercise 3 - Season Detector
 * Date        : 2026-04-03
 * Description : Identify the season using two methods: 
 * If-Else with logical OR, and Switch with case grouping.
 * ===================================================
 */
package ExerciseTAJ;
import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double DISCOUNT_RATE = 0.50; 

        System.out.println("*** Welcome to the Riyadh Metro App ***");
        System.out.println("Are you a student? (true/false):");
        boolean student = input.nextBoolean();

        if (student) {
            System.out.println("Available Ticket Options:");
            System.out.println("1. 2-hour pass: 4 SAR\n2. 3-day pass: 20 SAR\n3. 7-day pass: 40 SAR\n4. 30-day pass: 140 SAR");
            System.out.print("Please enter the number corresponding to the ticket you want to buy: ");
            int number = input.nextInt();

            double price = 0;
            String type = "";

            switch (number) {
                case 1: price = 4 * DISCOUNT_RATE; type = "2-hour pass"; break;
                case 2: price = 20 * DISCOUNT_RATE; type = "3-day pass"; break;
                case 3: price = 40 * DISCOUNT_RATE; type = "7-day pass"; break;
                case 4: price = 140 * DISCOUNT_RATE; type = "30-day pass"; break;
                default:
                    System.out.println("Error: Invalid ticket option.");
                    return;
            }
            System.out.println("The discounted price for the " + type + " is " + price + " SAR");
        } else {
            System.out.println("Sorry, this app is only for students.");
        }
        input.close();
    }
}







// another answer 





/*package ExerciseTAJ;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Are you student ? (true/false)");
        boolean student = input.nextBoolean();

        System.out.printf(
                "Availble Ticket Options\n 1. 2-hour pass 4 SAR \n 2. 3-day pass : 20 SAR \n 3. 7-day pass : 40 SAR \n 4. 30-day pass : 140 SAR");
        System.out.println("Please Enter the number corresponding to the ticket you want to buy : ");
        int number = input.nextInt();

        if (student == true) {
            switch (number) {
                case 1:
                    System.out.println("The discounted price for the 2-hour pass is 2.00 SAR ");
                    break;

                case 2:
                    System.out.println("The discounted price for the 3-day pass 10.00 SAR ");
                    break;

                case 3:
                    System.out.println("The discounted price for the 7-day pass : 20.00 SAR");
                    break;

                case 4:
                    System.out.println("The discounted price for the 30-day pass : 70.00 SAR ");
                    break;

                default:
                    System.out.println("Erorr : Invalid nubmer please choose one of (1-4)");
            }
        } else if (student == false ) {
            System.out.println("sorry this app only for student");
        }
        input.close(); 
    }
}
 */