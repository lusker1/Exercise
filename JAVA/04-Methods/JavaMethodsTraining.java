/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Java Methods Training Basics
 * Date        : 2026-07-05
 * Description : A simple program practicing basic methods 
 * with different parameters and return types.
 * ===================================================
 */

import java.util.*;

public class JavaMethodsTraining {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        welcomeMassage();

        System.out.println("Enter num1 and num2 = ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        printSum(n1, n2);
        double sub = getSubtraction(n1, n2);
        System.out.println("Subtraction result is = " + (sub));
        Mul(n1, n2);

        int myAge = getAge();
        System.out.println("Your Age is Saved as a Variable = " + myAge);
    }

    public static void welcomeMassage() {
        System.out.println("===================================");
        System.out.println("welcome to my training Method");
        System.out.println("===================================");
    }

    public static void printSum(int num1, int num2) {

        int result = num1 + num2;

        System.out.println("total result = " + ((double) result));
    }

    public static double getSubtraction(int num1, int num2) {

        int result = num1 - num2;
        return (double) result;
    }

    public static void Mul(int num1, int num2) {

        double result = ((double) num1 * num2);

        System.out.println("total result = " + result);

    }

    public static int getAge() {
        System.out.println("How old Are you ? ");
        int age = input.nextInt();

        return age;
    }

}