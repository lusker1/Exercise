/*
 * ===================================================
 *       سبحان الله وبحمده .. سبحان الله العظيم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Random Number Arithmetic Operations
 * Date        : 2026-07-30
 * Description : Generates two random integers between 1 and 50 and performs basic arithmetic operations using a dedicated method.
 * ---------------------------------------------------
 * Sample Run  :
 * Output      : Number 1 = 37
 *               Number 2 = 12
 *               Sum = 49
 *               Difference = 25
 *               Product = 444
 *               Quotient = 3.0833333333333335
 *               Remainder = 1
 * ===================================================
 */

public class RandomCalculator {

    public static void main(String[] args) {

        performOperations();
    }

    public static void performOperations() {

        int num1 = (int) (Math.random() * 50) + 1;
        int num2 = (int) (Math.random() * 50) + 1;
        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Sum " + (num1 + num2));
        System.out.println("Difference = " + (num1 - num2));
        System.out.println("Product = " + (num1 * num2));
        System.out.println("Quotient = " + ((double) num1 / num2));
        System.out.println("Remainder = " + (num1 % num2));
    }
}