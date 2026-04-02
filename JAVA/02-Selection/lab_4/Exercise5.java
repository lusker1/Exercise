/*
Exercise 5 
Write a Java program that allows a driver to determine the cost of an automobile insurance. 
Your program has to: 
• Ask the driver to input his/her age and the number of accidents that the driver has had. 
• Compute and print the total cost based on: 
o Basic charge is $550 
o Surcharge of $100 if the driver under 25 
o Additional surcharge for the number of accidents:

Number of Accidents 
Accident Surcharge ($) 
1 
50 
2 
125 
3 
225 
4 
375 
5 
575
6 or more
No insurance

Example 1: 
How old are you? 45 
How many accidents you had before? 6 
Sorry, No insurance 

Example 2: 
How old are you? 20 
How many accidents you had before? 3 
Your insurance cost is 825

Example 3: 
How old are you? 30 
How many accidents you had before? 3 
Your insurance cost is 725


*/
/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : 01 - Selection (Lab 4)
 * Question    : Exercise 5 - Automobile Insurance
 * Date        : 2026-04-02
 * Description : Calculate insurance cost with manual math.
 * ===================================================
 */

package lab_4;

import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How old are you? ");
        int old = input.nextInt();

        System.out.print("How many accidents you had before? ");
        int accidents = input.nextInt();

        switch (accidents) {
            case 0:
                if (old < 25) {
                    System.out.println("Your insurance cost is " + (550 + 100));
                } else {
                    System.out.println("Your insurance cost is " + 550);
                }
                break;

            case 1:
                if (old < 25) {
                    
                    System.out.println("Your insurance cost is " + 700);
                } else {
                    
                    System.out.println("Your insurance cost is " + 600);
                }
                break;

            case 2:
                if (old < 25) {
                    
                    System.out.println("Your insurance cost is " + 775);
                } else {
                    
                    System.out.println("Your insurance cost is " + 675);
                }
                break;

            case 3:
                if (old < 25) {
                    
                    System.out.println("Your insurance cost is " + 825);
                } else {
                    
                    System.out.println("Your insurance cost is " + 725);
                }
                break;

            case 4:
                if (old < 25) {
                    
                    System.out.println("Your insurance cost is " + 1025);
                } else {
                    
                    System.out.println("Your insurance cost is " + 925);
                }
                break;

            case 5:
                if (old < 25) {
                    
                    System.out.println("Your insurance cost is " + 1225);
                } else {
                    
                    System.out.println("Your insurance cost is " + 1125);
                }
                break;

            default: 
                System.out.println("Sorry, No insurance");
                break;
        }

        input.close();
    }
}
/*
int total = 550; 
if (old < 25) total += 100; 

switch (accidents) {
    case 0: break; 
    case 1: total += 50; break;
    case 2: total += 125; break;
    case 3: total += 225; break; 
    case 4: total += 375; break;
    case 5: total += 575; break;
    default: 
        System.out.println("Sorry, No insurance");
        return; 
}
System.out.println("Your insurance cost is " + total);
*/
