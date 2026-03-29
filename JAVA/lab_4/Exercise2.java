/*
Exercise 2 
Write a Java program that receive a number between 1 and 7, and prints the day corresponding to 
the entered number starting by Friday. When the user enters a value that doesn’t correspond to any 
day (less than 1 or more that 7), the program displays an error message.

Example 1: 
Enter a number (1-7): 1 
Day is Friday 
Example 2: 
Enter a number (1-7): 7 
Day is Thursday 
Example 3: 
Enter a number (1-7): 9 
Error: Invalid number! Please enter a value between 1 and 7. 

/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : 01 - Selection (Lab 4)
 * Question    : Exercise 2 - Days of Week
 * Date        : 2026-03-29
 * Description : Show day name from number using switch.
 * ===================================================
 
*/
package lab_4 ; 

import java.util.* ; 

public class Exercise2 {
    public static void main (String [] args ) {
        Scanner input = new Scanner (System.in) ;

        System.out.println("Enter a number (1-7): ");
        int number = input.nextInt() ;

        switch (number) {
            case 1 : 
                System.out.println("Day is Friday");
        break ;
            case 2 :
                System.out.println("Day is Saturday");
        break ; 
            case 3 : 
                System.out.println("Day is Sunday");
        break ; 
            case 4 : 
                System.out.println("Day is Monday");
        break ;
            case 5 :
            System.out.println("Day is Tuesday");
        break ;
            case 6 :
            System.out.println("Day is Wednesday");
        break ; 
            case 7 :
            System.out.println("Day is Thursday");
        break ; 

        default : 
            System.out.println("Error invalid number ! please enter a value between 1 and 7 ");
            }
        input.close();

               
    }
}