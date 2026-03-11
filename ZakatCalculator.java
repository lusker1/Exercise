
/*
Exercise 2 — Zakat Calculator
Description: Compute the annual zakat (charitable donation) that is 2.5Input:- savings :
double Output: The zakat amount (2.5Sample run:)

Enter your total savings: 10000
Zakat due (2.5%): 250.0

===================================================
/**
 * Exercise 2: Zakat Calculator
 * Date: 3/11/2026
 * Author: BinSaleh
 * Description: A program to compute the annual Zakat (2.5%) based on total savings.

===================================================
*/
import java.util.Scanner;

public class ZakatCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your total Savings : ");
        double saving = input.nextDouble();
        double zakatAmount = saving * 0.025;
        System.out.println("Zakat due :" + zakatAmount);

        input.close();

    }

}