/*
Exercise 1: 
Write a Java program that determines whether a number n given by the user is inside the 
range [a, b] or not, where a and b are also given by the user in any order (your program 
should ensure that a always smaller than b). Hint: Swap their values when needed. 

/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Exercise 1 - Range Checker
 * Date        : 2026-03-28
 * Description : Check if n is within [a, b] with swapping.
 * ===================================================
 
*/
package lab_3;
import java.util.* ; 
public class Exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ; 

        System.out.println("Enter the first number (a)" );
        double a = input.nextDouble() ;
        System.out.println("Enter the second number (b)") ;
        double b = input.nextDouble() ;     

        System.out.println("Enter the number of check (n)");
        double n = input.nextDouble() ; 
        if (a > b ) {
              double temp = a; 
            a = b; 
            b= temp;
        }
        if (a <= n && n <= b ) {
          
            System.out.println(n + " is inside the range [" + a + ", " + b + "]");
        }else
            System.out.println(n + " is not inside the range [" + a + " ," + b + "]");
    
            input.close();
    }
    
}