import java.util.Scanner ;

/*
 * ===================================================
 *       سبحان الله وبحمده .. سبحان الله العظيم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Character Classification using Character Class
 * Date        : 2026-07-31
 * Description : Classifies a given character as uppercase, lowercase, digit, or special symbol.
 * ---------------------------------------------------
 * Sample Run  :
 * Output      : Enter a character: M
 *               M is an uppercase letter.
 * ===================================================
 */

public class CharTypeChecker {
    static Scanner input = new Scanner (System.in) ; 

    public static void main(String [] args) {

            System.out.println("Enter a character : ");
            char ch = input.next().charAt(0) ; 
    
            if(Character.isUpperCase(ch)) {
                System.out.println(ch + " is an uppercase letter. ");
            }else if(Character.isLowerCase(ch)) {
                System.out.println(ch + " is a lowercase letter. ");
            }else if(Character.isDigit(ch)){
                System.out.println(ch + " is a Digit  ");
            }else 
                System.out.println(ch + " is a Special symbols letter. ");
        }   
}