import java.util.*;

public class gradeEvaluation {

    /*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : Exam Practice
 * Question    : Grade Evaluation
 * Date        : 2026-06-23
 * Description : Map academic letter grades to remarks 
 * using a clean and formatted switch-case structure.
 * ===================================================
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char grade ; 
        String message  = ""; 

        System.out.println("Enter Your Grade : ");
        grade = input.next().charAt(0) ; 

        switch(grade) {

            case 'A' : message = "Excellent" ; break ; 
            case 'B' : message = "Very Good" ; break ; 
            case 'C' : message = "Good" ; break ; 
            case 'D' : message = "Fair" ;  break ; 
            case 'F' : message = "Failed" ; break ; 

            default : 
                System.out.println("Sorry please choose one of (A , B , C , D , F)");
                input.close();
                return ; 

        }

        System.out.println(message);

        input.close();
        
        }
    }

