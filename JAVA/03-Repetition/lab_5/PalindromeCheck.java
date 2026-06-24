/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Is Palindrome Method
 * Date        : 2026-06-24
 * Description : A method that checks if a string reads the 
 * same backward using two pointers and a while loop.
 * ===================================================
 */
import java.util.*;

public class PalindromeCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input = ");
        String text = input.nextLine();

        isPalindrome(text);
    }

    public static void isPalindrome(String text) {
        int left = 0, right = text.length() - 1;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {
                System.out.println("It is not a palindrome");
                return;
            }

            right--;
            left++;

        }
        System.out.println("its is a plindrome");
    }
}
