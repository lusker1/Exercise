
/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Dynamic Student Average Calculator
 * Date        : 2026-06-24
 * Description : Calculate the average grade for a dynamic 
 * number of students using a while loop and input handling.
 * ===================================================
 */
import java.util.*;

public class studentAverage {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int TOTAL_STUDENT = 0 ; 
        int student = 1;
        int grade = 0, sum = 0;

            System.out.println("Enter total students : ");
            TOTAL_STUDENT = input.nextInt() ; 

        while (student <= TOTAL_STUDENT) {

            System.out.printf("Enter grade for student %d :", student);
            grade = input.nextInt();

            sum += grade;
            student++;

        }
        System.out.println("Average Grade is : " +  ( (double)sum/TOTAL_STUDENT) );

        input.close();

    }

}
