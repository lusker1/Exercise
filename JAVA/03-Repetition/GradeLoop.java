/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Smart Grade Average Calculator
 * Date        : 2026-06-24
 * Description : Optimized grade calculation using a 
 * zero-indexed loop and precise sentinel handling.
 * ===================================================
 */
import java.util.*;

public class GradeLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int grade = 0, students = 0, sum = 0; 

        System.out.println("Enter 5 grades or -1 To Exit");
        grade = input.nextInt(); 

        while (students < 5 && grade != -1) {
            sum += grade;
            students++; 

            if (students < 5) {
                grade = input.nextInt();
            }
        }

        if (students > 0) {
            System.out.println("Average of the grades is " + ((double) sum / students));
        } else {
            System.out.println("No grades were entered.");
        }

        input.close();
    }
}