/*
Question 6 (Shipping Cost): 
Write a program that asks the user to enter a shipping zone (A, B, C, D) 
and prints the shipping cost based on the zone. 
• Print the corresponding shipping cost:   - Zone A: 18 SAR - Zone B: 37.5 SAR - Zone C: 56.25 SAR   - Zone D: 75 SAR  
If the user enters an invalid zone, display an error message.   
Example 6 : 
➔Input: B 
➔Output: Shipping cost: 37.5 SAR.

/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : 02 - Selection and Logic
 * Question    : Question 6 - Shipping Cost
 * Date        : 2026-03-26
 * Description : Calculate shipping cost based on zone.
 * ===================================================
 

*/
package Programming_Practice_Ch3_Switch;

import java.util.*;

public class Shipping_Cost {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ; 

        System.out.println("Enter a Shipping zone (A,B,C,D)");
        String zone = input.next() ;
        switch (zone) {
            case "A" : 
            System.out.println("Shipping cost:18 SAR");
        break ;
            case "B" : 
            System.out.println("Shipping cost: 37.5 SAR");
        break ; 
            case "C" :
            System.out.println("Shipping cost: 56.25 SAR ");
        break ;
            case "D" :
            System.out.println("Shipping cost:75 SAR");
        break ; 
            default :
            System.out.println("Error : Invaild Category please enter A , B , C , D ");
            
                }
         input.close(); 
    }
}
