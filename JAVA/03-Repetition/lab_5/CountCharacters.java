/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Count Letters, Digits, and Symbols
 * Date        : 2026-06-24
 * Description : A program that checks a string character by character 
 * and counts the number of letters, digits, and special symbols.
 * ===================================================
 */
import java.util.* ; 

public class CountCharacters {
    
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in)  ;
        String text = "" ; 

        System.out.println("Input");
        text = input.nextLine(); 
        int letters = 0, digits= 0 , symbols= 0 , counter = 0   ; 

        while (counter < text.length()) {
            char ch = text.charAt(counter) ;

            if(Character.isLetter(ch)) {
                letters++ ;
            } else if (Character.isDigit(ch)) {
                digits++ ;
            } else {
                symbols ++ ; 
            }
            counter ++ ; 
        }
        System.out.println("Letters=" + letters + ", Digits=" + digits + ", Symbols=" + symbols);
    }
}
