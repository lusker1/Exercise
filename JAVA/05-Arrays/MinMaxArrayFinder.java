/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Find Largest and Smallest Using Array
 * Date        : 2026-07-08
 * Description : An optimized program to find the minimum 
 * and maximum numbers from user inputs without hardcoded variables.
 * ===================================================
 */
import java.util.* ; 

public class MinMaxArrayFinder {
    
    static Scanner input = new Scanner(System.in) ;
    public static void main (String [] args) {


        numbers5(); 
    }
     public static void numbers5 () {

        int[] numbers = new int[5] ; 
            System.out.println("Emter 5 Number : ");
        for(int counter = 0 ; counter < numbers.length;counter++ ) {

            while (!input.hasNextInt()) {
                System.out.println("Error please enter a number !!");
                input.next(); 
            }
            numbers[counter] = input.nextInt();

        }

        int largest = numbers[0] ;
        int smallest = numbers[0] ; 

        for(int i = 1 ; i < numbers.length ; i++ ) {

            if(numbers[i] > largest) {
                largest = numbers[i];

            }
            if (numbers[i] < smallest) {
                smallest = numbers[i] ; 
            }
        }
        System.out.println("Largest Number : " + largest);
        System.out.println("Smallest Number : " + smallest);
    }
}