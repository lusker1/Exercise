/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : For Loop Countdown (10 To 0)
 * Date        : 2026-06-27
 * Description : A simple Java program that demonstrates a for loop 
 * counting down and printing numbers from 10 safely down to 0.
 * ===================================================
 */
import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for(int i = 10 ; i >= 0 ; i--) {

            System.out.println(i);
        }
    }
}
