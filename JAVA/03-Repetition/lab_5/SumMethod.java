/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Calculate Sum Method
 * Date        : 2026-06-24
 * Description : A method that asks for numbers, adds them 
 * together, and stops when the user enters 0.
 * ===================================================
 */

import java.util.*;

public class SumMethod {

    public static void main(String[] args) {
        CalculateSum() ;
    }
    public static void CalculateSum() {
        Scanner input = new Scanner(System.in);

        boolean keepPlaying = true;

        double realnumber = 0 ;

        while (keepPlaying) {
            
        System.out.println("Enter a number : ");
        double number = input.nextDouble();

            if (number == 0) {
                keepPlaying = false ; 

            }else {
                realnumber +=number ; 
            }

        }
    
        System.out.println("Sum :" + realnumber);
    
        input.close();
    
}
}