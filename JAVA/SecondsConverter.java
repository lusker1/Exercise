/*
Exercise 6 — Seconds to Hours/Minutes/Seconds
Description: Convert a total number of seconds into equivalent hours, minutes, and seconds.
The program reads an integer number of seconds and then computes how many hours,
minutes, and leftover seconds that corresponds to. 
Input:- totalSeconds : int Output: The equivalent time in hours, minutes, and seconds. Sample run:
Enter total seconds: 5000
5000 seconds = 1 hour(s), 23 minute(s), 20 second(s)

===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
Exercise: Exercise 6 — Seconds Converter
Date: 3/12/2026
Author: BinSaleh (lusker1)
Description: Convert a total number of seconds into equivalent hours, minutes, and seconds.
===================================================

*/
import java.util.*;

public class SecondsConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total seconds");
        int totalSeconds = input.nextInt();
        int hours = (totalSeconds / 3600);
        int minutes = ((totalSeconds % 3600) / 60) ; 
        int seconds = (totalSeconds % 60) ; 

        System.out.println(totalSeconds + " Second(s) = " + hours + "  hours(s) " + minutes + "  minutes(s) " + seconds + (" seconds"));

        input.close();

    }
}