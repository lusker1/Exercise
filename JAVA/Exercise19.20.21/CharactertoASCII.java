/*
Exercise 19 — ASCII Code to Character
Description: Given an ASCII code (an integer between 0 and 127), display the corresponding 
character. For example, 65 corresponds to ’A’. Input:- code : int (ASCII code in the range
0–127) Output: The character with that ASCII value. Sample run:

Enter an ASCII code (0-127): 65
The character is: A
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 20 - Character to ASCII Code
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-18
 Description: This program demonstrates how Java 
              stores characters as numbers. It converts 
              a character to its fixed ASCII value 
              using (int) casting.
===================================================
*/

import java.util.*;

public class CharactertoASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A character: ");
        
      char ch = input.next().charAt(0) ; 

      int code = (int) ch ; 
      System.out.println("The ASCII code is " + code);
        input.close(); 
    }

}
