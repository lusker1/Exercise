
/*
Exercise 19 — ASCII Code to Character
Description: Given an ASCII code (an integer between 0 and 127), display the corresponding
character. For example, 65 corresponds to ’A’. Input:- code : int (ASCII code in the range
0–127) Output: The character with that ASCII value. Sample run:

Enter an ASCII code (0-127): 65
The character is: A

/*
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 19 - ASCII Code to Character
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-18
 Description: This program takes an integer code 
              (0-127) and converts it to its 
              character using (char) type casting.
===================================================


*/
import java.util.*;

public class ASCII_code_to_character {
    public static void main(String[] xxxx) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an ASCII code (0-127): ");
        int ASCII = input.nextInt() ; 
        char ch = (char) ASCII;
        System.out.println("The Character is: " + ch);

    }
}
