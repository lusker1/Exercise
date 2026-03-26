/*
Exercise 32 — Letter Case Converter
Description: Convert a lowercase letter to uppercase (without using built-in string conver
sion methods). The program reads a single lowercase alphabetic character and outputs the
corresponding uppercase character. Input:- lowerChar : char (a lowercase letter ’a’–’z’)
Output: The same letter in uppercase. 
Sample run:

Enter a lowercase letter: b
Uppercase version: B
/*
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Author      : BinSaleh (lusker1)
 Exercise    : Exercise 32 - Letter Case Converter
 Date        : 2026-03-23
 Description : Converts a lowercase letter to uppercase 
               by subtracting the ASCII offset (32) 
               and using explicit type casting.
===================================================

*/

import java.util.* ; 

public class Letter_Case_Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ; 

        System.out.println("Enter a lowercase letter: ");
        char lowerCase = input.next().charAt(0) ;
        int casting = lowerCase - 32 ; 
        
        System.out.println("Uppercase version : " + (char) casting);

        input.close(); 
        
    }    
}
