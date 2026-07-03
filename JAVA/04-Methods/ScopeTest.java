/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Variables Scope and Methods Test
 * Date        : 2026-07-03
 * Description : A simple program to test global, local, 
 * and block variables with basic methods.
 * ===================================================
 */

import java.util.*;

public class ScopeTest {

    static int globalvar;
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;

        System.out.println("Enter two numbers = " );
        int num1 = input.nextInt() ; 
        int num2 = input.nextInt() ;

        System.out.println(sum(num1, num2));
    
        globalvar = 100;
        int globalvar;
        globalvar = 500;
        int local = 100;
        System.out.println(globalvar);
        System.out.println(ScopeTest. globalvar); // this one is global read it 100 not 500 
        {
            local = 333;
            int blockbariable = 10;
                blockbariable = 300;
        }
        ddisplay();

        
    }

    public static void ddisplay() {
        System.out.println(globalvar);

    }

    public static int sum(int a , int b ) {

        int total = a + b ; 
    //  System.out.println(total);
        return total ;
    }

}
