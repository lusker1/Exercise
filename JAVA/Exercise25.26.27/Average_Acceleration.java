/*
Exercise 25 — Average Acceleration
Description: Compute the average acceleration of an object given its starting velocity, ending
velocity, and the time span. The formula for average acceleration is aavg = v1−v0/t, 
where v0 is the initial velocity, v1 is the final velocity, and t is the time interval. Input:- v0 : double
(initial velocity, e.g., in m/s)- v1 : double (final velocity, in m/s)- t : double (time in
seconds) Output: The average acceleration (in m/s²). Sample run:

Enter v0, v1, and time: 0 60 5
Average acceleration = 12.0 m/s^2

/*
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 25 - Average Acceleration
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-19
 Description: Computes average acceleration using the 
              formula (v1 - v0) / time. Demonstrates 
              operator precedence in Java.
===================================================
*/


import java.util.*;

public class Average_Acceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("--- Average Acceleration ---");
        System.out.printf("   Enter v0, v1, and time\n: ");
        double v0 = input.nextDouble() ;
        double v1 = input.nextDouble() ;
        double time = input.nextDouble() ; 

        double average = ((v1-v0) / time)  ;
        System.out.println("Average accelration = " + average + " m/s^2");

        input.close();

    }    
}
