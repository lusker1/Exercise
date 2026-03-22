
/*
Exercise 30 — Population Projection
Description: Project the population after a given number of years using assumed birth,
death, and immigration rates. The program takes the current population and the number of
years, then calculates the new population based on the following assumptions (approximately
reflecting world averages):- One birth every 7 seconds- One death every 13 seconds- One
new immigrant every 45 seconds The net change is applied to the current population. (All
years are assumed to have 365 days.) Input:- currentPopulation : int- years : int Output:
The projected population after the specified number of years. Sample run:

Enter current population: 1000000
Enter number of years: 1
Projected population = 3780096

/*
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Author      : BinSaleh (lusker1)
 Exercise    : Exercise 30 - Population Projection
 Date        : 2026-03-22
 Description : Projects future population by calculating 
               total seconds in years and applying birth, 
               death, and immigration rates.
===================================================


*/
import java.util.*;

public class Population_Projection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter current population: ");
        long population = input.nextLong();

        System.out.println("Enter number of years: ");
        double years = input.nextDouble();

        double totalSeconds = (years * (365 * 24 * 60 * 60));

        double newBorns = (totalSeconds / 7);

        double deaths = (totalSeconds / 13);

        double immigration = (totalSeconds / 45);

        double newPopulation = population + (newBorns + immigration) - deaths;

        System.out.println("Projected population = " + (long) newPopulation);
        input.close();
    }
}
