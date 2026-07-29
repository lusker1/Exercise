/*
 * ===================================================
 *       سبحان الله وبحمده .. سبحان الله العظيم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Math Rounding Operations
 * Date        : 2026-07-29
 * Description : Generates a random decimal number between 0 and 100, then applies round, floor, and ceil operations using Math class methods.
 * ---------------------------------------------------
 * Sample Run  :
 * Output      : Original number: 37.6842
 *               Rounded (nearest): 38
 *               Rounded down: 37
 *               Rounded up: 38
 * ===================================================
 */
public class RandomRounder {
    public static void main(String[] args) {

        nawaf();
    }

    public static void nawaf() {
        double original = Math.random() * 100;

        System.out.println("Original number: " + original);

        System.out.println("Rounded (nearest): " + Math.round(original));

        System.out.println("Rounded down: " + (long) Math.floor(original));

        System.out.println("Rounded up: " + (long) Math.ceil(original));
    }
}