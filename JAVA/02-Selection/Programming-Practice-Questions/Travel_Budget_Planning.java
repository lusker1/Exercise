/*
Question 4 (Travel Budget Planning): 
Write a program that helps the user plan their travel budget. 
• Ask the user for the ticket price, the cost of one night’s stay, and the 
number of days they plan to stay. 
• Calculate the total cost of the trip. 
Example 4 : 
➔Input: 
➔Ticket Price: 500 
➔Cost per Night: 200 
➔Number of Days: 3 
➔Output: The total cost of the trip is: 1100.

/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : 02 - Selection and Logic
 * Question    : Question 4 - Travel Budget
 * Date        : 2026-03-26
 * Description : Calculate total trip cost.
 * ===================================================
 * 
 */


package Programming_Practice_Ch3_Switch;

import java.util.*;

public class Travel_Budget_Planning {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ticket price:");
        double ticket = input.nextDouble();

        System.out.println("Cost Per Night: ");
        double costPerNight = input.nextDouble();

        System.out.println("Enter number of Days : ");
        int days = input.nextInt();

        double totalTrip = ((costPerNight * days) + ticket );
        System.out.println("The total cost of the trip is: " + totalTrip);

        input.close(); 
    }
}
