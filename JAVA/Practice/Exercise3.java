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

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the year season Detector text ! ");
        System.out.println("Please enter the month number (1-12)");

        int number = input.nextInt();

        System.out.println("Please enter Year: ");
        int numberYear = input.nextInt();

        if (number == 12 || number == 1 || number == 2) {
            System.out.println("the season in " + numberYear + " for month " + number + " is: Winter");
        } else if (number == 3 || number == 4 || number == 5) {
            System.out.println("the season in " + numberYear + " for month " + number + " is: Spring");

        } else if (number == 6 || number == 7 || number == 8) {
            System.out.println("the season in " + numberYear + " for month " + number + " is: Summer");
        } else if (number == 9 || number == 10 || number == 11) {
            System.out.println("the season in " + numberYear + " for month " + number + " is: Autumn");
        }else 
            System.out.println("Error Invalid number please Enter one of : (1-12)");
        
    }
}
/*
===================================
     Another answer Question
===================================

switch (number) {
    case 12:
    case 1:
    case 2:
        System.out.println("the season in " + numberYear + " for month " + number + " is: Winter");
        break;
    case 3:
    case 4:
    case 5:
        System.out.println("the season in " + numberYear + " for month " + number + " is: Spring");
        break;
    case 6:
    case 7:
    case 8:
        System.out.println("the season in " + numberYear + " for month " + number + " is: Summer");
        break;
    case 9:
    case 10:
    case 11:
        System.out.println("the season in " + numberYear + " for month " + number + " is: Autumn");
        break;
    default:
        System.out.println("Error Invalid number please Enter one of : (1-12)");
}
*/