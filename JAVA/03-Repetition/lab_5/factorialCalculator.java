/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Factorial Calculator (n!)
 * Date        : 2026-06-24
 * Description : Calculate the factorial of a given number 
 * using a post-decrement while loop control structure.
 * ===================================================
 */
import java.util.* ;

public class factorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;

        
        System.out.println("input: ");
        int n = input.nextInt() ; 

        int originalNumber = n ; 
        long factorial = 1 ; 

        while (n > 0) {
            factorial *= n  ; 
            n-- ; 
        System.out.println("Factorial of " + originalNumber + " ! is: " + factorial);

        } 

    }    
}
