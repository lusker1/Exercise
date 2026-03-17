/*
Exercise 16 — Minutes to Years and Days
Description: Convert a large number of minutes into an approximate number of years and
remaining days. The program reads an integer minutes value and calculates how many whole
years and extra days that represents (assuming 1 year = 365 days). Input:- totalMinutes :
int Output: The equivalent in years and days. Sample run:

Enter total minutes: 1000000
1000000 minutes is approximately 1 year(s) and 329 day(s)

===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 16 - Minutes to Years and Days
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-17
 Description: Optimized the calculation by using 
              525600 minutes for a year and 1440 
              minutes for a day to get the result 
              directly and efficiently.
===================================================
*/
import java.util.*;

public class Minutes_to_Years_and_Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter total minutes: ");
        int totalMinutes = input.nextInt();

        int years = (totalMinutes / 525600);
        int days = ((totalMinutes % 525600) / 1440);
        System.out.println(years + " Years(s) "+ days + " Days(S) ");

    }
}
