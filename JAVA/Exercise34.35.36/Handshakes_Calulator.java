/*
Exercise 35 — Handshakes Calculator

Description: Determine the number of handshakes that would occur in a meeting of n
people if each person shakes hands with every other person exactly once. The formula for
the number of handshakes is n(n−1) / 2
. The program reads the number of people and computes
the handshake count. Input:- people : int Output: The total number of unique handshakes.
Sample run:
Enter number of people: 4
Number of handshakes = 6

/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Author      : BinSaleh (lusker1)
 Exercise    : Exercise 35 - Handshakes Calculator
 Date        : 2026-03-24
 Description : Calculates the total number of unique 
               handshakes for n people using the 
               combinatorial formula n(n-1)/2.
===================================================

*/

import java.util.*;

public class Handshakes_Calulator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("--- Handshakes calculator ---");
        System.out.println("   Enter number of people: ");
        int ppl = input.nextInt() ; 
        
        double furmula = ((ppl * (ppl-1)) / 2) ;

        System.out.println("Number of handshakes: "+ furmula);

        input.close(); 

    }
}
