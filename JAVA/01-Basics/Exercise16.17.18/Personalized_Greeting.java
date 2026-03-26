/*
Exercise 18 — Personalized Greeting
Description: A simple interactive program that greets the user by name. The program
prompts for the user’s name and then prints a greeting message. Input:- name : String
Output: A greeting incorporating the provided name. Sample run:

Enter yourname: Alice 
Hello, allice!

/*
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 18 - Personalized Greeting
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-17
 Description: This program asks for the user's name 
              and prints a hello message. It uses 
              nextLine() to read the full name.
===================================================

*/
import java.util.* ; 

public class Personalized_Greeting {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in) ; 

    System.out.println("Enter your name: ");
    String userName = input.nextLine() ; 

    System.out.println("Hello ," + userName + "!");

    input.close(); 
}    
}
