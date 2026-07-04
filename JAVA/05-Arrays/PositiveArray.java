/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Positive Integers Array Sum and Average
 * Date        : 2026-07-04
 * Description : A simple program that stores positive integers 
 * in an array and calculates their sum and average.
 * ===================================================
 */
import java.util.*;

public class PositiveArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("how many arrays would you like : ");
        while (!input.hasNextInt()) {
            System.out.println("Erorr! please enter a valid integer");
            input.next();
        }

        int totalElemnets = input.nextInt();

        double[] slaries = new double[totalElemnets];
        double sum = 0;

        for (int i = 0; i < slaries.length;) {
            System.out.println("Enter a postive number " + (i + 1) + ":");

            while (!input.hasNextDouble()) {
                System.out.println("Error please enter a (number only) ");
                input.next();
            }
            double currentSalary = input.nextDouble();
            // slaries[i] = input.nextDouble();
            if (currentSalary < 0) {

                System.out.println("please enter a positve number");
                continue;
            }
            slaries[i] = currentSalary;
            sum += slaries[i];
            i++;

        }
        System.out.println("===========================");
        System.out.println("sum = " + sum);
        System.out.println("Avg = " + sum / slaries.length);
        System.out.println("===========================");

    }
}
