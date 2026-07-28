/*
 * ===================================================
 * سبحان الله وبحمده سبحان الله العظيم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Day of the Week Finder
 * Date        : 2026-07-28
 * Description : Maps a day number (1-7) to its corresponding weekday name using a switch statement.
 * ---------------------------------------------------
 * Sample Run  :
 * Input       : Enter a day number (1-7): 2
 * Output      : Monday
 * ---------------------------------------------------
 * Input       : Enter a day number (1-7): 9
 * Output      : Invalid day number
 * ===================================================
 */

import java.util.*;
                        
public class DayOfWeek {
    static Scanner input = new Scanner (System.in) ;
    public static void main(String[] args ) {

        String day;
        // keep asking until user enters a valid day number (1-7)
        do {
            System.out.print("Enter a day number (1-7): ");
            day = input.next();
        } while (!dayName(day));
    }
    public static boolean dayName(String n) {
    
        
        switch(n) {

            case "1" : 
                System.out.println("Sunday");
                break ;
            case "2":
                System.out.println("Monday");
                break; 
            case "3" : 
                System.out.println("Tuesday");
                break;
            case "4": 
                System.out.println("Wednesday");
                break;
            case "5": 
                System.out.println("Thursday");
                break;
            case "6":
                System.out.println("Friday");
                break;
            case "7" :
                System.out.println("Saturday");
                break;
            default  :
                System.out.println("Invalid day number — try again.");
                return false;
        }
        return true;
    }
}