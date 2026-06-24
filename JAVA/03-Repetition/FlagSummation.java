/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Sentinel Summation Using Boolean Flag
 * Date        : 2026-06-24
 * Description : Accumulate positive numbers and terminate 
 * control flow dynamically using a boolean state flag.
 * ===================================================
 */

import java.util.* ; 

public class FlagSummation {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;

        double sum = 0  , value ; 
        boolean positvenumber = true ; 

        while (positvenumber) {
            
            System.out.println("sum all numbers (to Exit type any nigative number)");
           value = input.nextDouble() ; 
           
           if (value < 0) {
            positvenumber = false 
             ; 
           } else 
                sum += value ; 


        }
        System.out.println("Total Equal " + sum);
    }
}