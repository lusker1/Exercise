/*
Exercise 13 — Slope of a Line
Description: Compute the slope of a line through two points (x1,y1) and (x2,y2). The
formula for the slope is m = y2−y1
x2−x1
. The program reads the coordinates of two points and
outputs the slope m. Input:- x1 : double- y1 : double- x2 : double- y2 : double Output:
The slope of the line as a double (which could be an integer value in special cases). Sample run:

Enter x1, y1, x2, y2: 1 2 3 6
Slope = 2.

/*
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 13 - Slope of a Line
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-16
 Description: Calculates the slope (m) between two 
              points using the formula (y2-y1)/(x2-x1).
===================================================


*/
import java.util.* ; 

// exercsie13 
public class Slope_of_a_Line {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in) ; 
        
        
        
        System.out.println("--- Slope Calculator---"); 
        System.out.printf("   x1 , y1 , x2 , y2 ");
        double x1 = input.nextDouble() ; 
        double y1 = input.nextDouble() ; 
        double x2 = input.nextDouble() ;
        double y2 = input.nextDouble() ;
        System.out.println("----------------------");
        System.out.printf("the Slope Equal = %.2f%n",(y2-y1) / (x2-x1) );
        System.out.println("----------------------");

        input.close();
    }
}
