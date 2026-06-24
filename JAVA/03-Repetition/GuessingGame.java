/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Random Number Guessing Game
 * Date        : 2026-06-24
 * Description : Interactive guessing game using Math.random() 
 * with dynamic boolean flag control and scoped block logic.
 * ===================================================
 */

import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int guess, rand;
        rand = (int) (Math.random() * 100);
        boolean stillplaying = true;
        System.out.println("The Generated Random number is " + rand);
        while (stillplaying) {

            System.out.println("Guess a number between 0 and 100");
            guess = input.nextInt();

            if (guess > rand) {
                System.out.println("guess is too large");
            } else if (guess < rand) {
                System.out.println("Guess is too small");
            } else {
                System.out.println("Congrats you win");
                stillplaying = false;
            }
        }

    }

}