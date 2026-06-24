/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Loop Flag Login System
 * Date        : 2026-06-24
 * Description : A Java program that repeatedly asks for username 
 * and password using a boolean flag until correct.
 * ===================================================
 */
import java.util.*;

public class CredentialCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String CORRECT_USER = "admin";
        final String CORRECT_PASS = "1234";

        boolean keepAsking = true;

        while (keepAsking) {
            System.out.println("Enter username : ");
            String username = input.nextLine();

            System.out.println("Enter password");
            String password = input.nextLine();
            if (username.equals(CORRECT_USER) && password.equals(CORRECT_PASS)) {
                System.out.println("Welcome, admin!");
                keepAsking = false;
            } else {
                System.out.println("Invalid credentials. Try again");
            }
        }
    }
}
