/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Interactive Method Overloading
 * Date        : 2026-07-03
 * Description : A program that takes numbers and chars from 
 * the user and finds the larger using overloaded methods.
 * ===================================================
 */

import java.util.*;

public class MethodOverloading {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers (e.g., 10 20 30) : ");
        int a = input.nextInt() ;
        int b = input.nextInt() ; 
        int c = input.nextInt() ; 

        System.out.println("Result: " + larger(a, b, c));
        System.out.println("---------------------------") ; 
        
        System.out.println("Enter two characters (e.g., A a) : ");;
        char y = input.next().charAt(0) ; 
        char x = input.next().charAt(0) ; 

        input.close();
    }

    public static int larger(int n1, int n2) {

        if (n1 > n2)
            return n1;
        else
            return n2;
    }

    public static double larger(double n1, double n2) {

        {
            if (n1 > n2) {
                System.out.println(n1 + " is larger than " + n2);
                return n1;
            } else {
                System.out.println(n2 + " is larger than or equal to " + n1);
                return n2;
            }
        }
    }

    public static char larger(char c1, char c2) {

        if (c1 > c2) {
            System.out.println(c1 + "is greater than " + c2);

            return c1;
        }

        else {
            System.out.println(c2 + " is larger then or equal to " + c1);
            return c2;
        }
    }

    public static int larger(int n1, int n2, int n3) {

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is larger than [" + n2 + " , " + n3 + "] ");
            return n1;
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is larger than [" + n1 + " , " + n3 + "] ");
            return n2;
        } else {
            System.out.println(n3 + " is larger than [" + n1 + " , " + n2 + "] ");
            return n3;
        }

    }

}