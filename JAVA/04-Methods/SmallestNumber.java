/*
 * ===================================================
 * سبحان الله وبحمده سبحان الله العظيم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Smallest Number Finder
 * Date        : 2026-07-26
 * Description : Reads three double numbers from the user and finds the smallest value using a custom method with Java streams.
 * ===================================================
 */
import java.util.*;

public class SmallestNumber {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double[] numbers = new double[3];
        String[] labels = {"First" , "Second" , "Third"} ; 
        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter the " + labels[i] +" number : ");
            numbers[i] = input.nextDouble();

        }
        double min = smallestNum(numbers[0], numbers[1], numbers[2]);
        System.out.println("Smallest number: " + min);
    }

    public static double smallestNum(double Num1, double Num2, double Num3) {

        return Arrays.stream(new double[] { Num1, Num2, Num3 }).min().getAsDouble();
    }
}