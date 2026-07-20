/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Exercise 5
 * Date        : 2026-07-20
 * Description : Replaces vowels with a user character and shifts text to the left.
 * ===================================================
 */
import java.util.*;

public class VowelAndShift {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input sentence :");
        String sentence = input.nextLine();

        System.out.println("Replacement char : ");
        char ch = input.next().charAt(0);

        String replaced = replaceVowels(sentence, ch);
        String shifted = leftShift(replaced);

        System.out.println("Encrypted sentence :" + shifted);
    }

    public static String replaceVowels(String str, char c) {
        return str.replaceAll("[aeiouAEIOU]", String.valueOf(c));
    }

    public static String leftShift(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(1) + str.charAt(0);
    }
}