/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : Exam Practice
 * Question    : Exercise 1 - Ticket Selection
 * Date        : 2026-04-03
 * Description : Calculate age from birth year and determine ticket price based on age groups (Free, 150 SAR, or 220 SAR).
 * ===================================================
 */
package ExerciseTAJ;
import java.util.* ; 
public class Exercise1 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in) ; 
        System.out.println("Enter birthdate of the passenger: ");
        int passngerOld = input.nextInt() ;

        int formula1 = 2026 - passngerOld ;
        
        System.out.println("Age of the passenger is: " + formula1 + " years old");

        if (passngerOld >= 17) {
            System.out.println("The ticket price is: 220 Riyals");

        }  else if (3 <= passngerOld && passngerOld <= 16) {
            System.out.println("the ticket price is: 150 Riyals");
        } else 
            System.out.println("the ticket is free");
    }
}
