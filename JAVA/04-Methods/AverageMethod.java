/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Math Operations Using Methods
 * Date        : 2026-07-03
 * Description : A simple program to calculate sum and 
 * average of 3 numbers using methods.
 * ===================================================
 */
import java.util.* ; 

public class AverageMethod {
    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in) ; 
    double total , avg ; 
    System.out.println("Enter 3 numbers : ");
    int n1 = input.nextInt() ;
    int n2 = input.nextInt() ;
    int n3 = input.nextInt() ; 
    total = sum(n1, n2, n3) ;
    avg = average(n1, n2, n3); 

   // System.out.println("total Equal = " + total +"\nAverage = " + avg);
    display(total,avg);
    }
    public static  int sum (int n1 , int n2 , int n3) {

        return n1 + n2 + n3 ;

    } 
    public static double average(int num1 , int num2 , int num3) {

      //   int total  = (n1 + n2 + n3) / 3 ; 

       //  System.out.println(total);

       return sum(num1, num2, num3) / 3.0 ; 
    }

    public static void display (double a  , double j) {

        System.out.println("the sum of the 3 numbers is = " + a );
        System.out.println("The average of 3 number is = " + j);
        
    }

    
}
