/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Multi-Group Baggage Calculator with Input Validation
 * Date        : 2026-07-02
 * Description : A robust baggage calculator using nested loops, 
 * switch-case, and secure input validation to prevent crashes.
 * ===================================================
 */

import java.util.*;

public class BaggageCharge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter number of group");
        while (!input.hasNextInt()) {
            System.out.println("Error! please enter a valid number, characterrrs are not allowed :");
            input.next();
        }
        int numberofgroup = input.nextInt();

        for (int groupcounter = 1; groupcounter <= numberofgroup; groupcounter++) {

            System.out.println("please enter number of passenger for group Number : " + groupcounter);
            while (!input.hasNextInt()) {
                System.out.println("Error! please enter a valid number, characterrrs are not allowed :");
                input.next();
            }
            int totalPasnger = input.nextInt();
            for (int counter = 1; counter <= totalPasnger; counter++) {

                System.out.println("please enter passenger's class " + counter);
                char ch = Character.toUpperCase(input.next().charAt(0));
                int wight, total = 0;
                switch (ch) {

                    case 'F':
                        System.out.println("Enter bag wight (Maximum 30 Kg)");
                        while (!input.hasNextInt()) {
                            System.out.println("Error! Please enter a valid weight (numbers only):");
                            input.next();
                        }
                        wight = input.nextInt();

                        if (wight > 30) {
                            System.out.println("You will pay 10SR each 1kg");

                            total = ((wight - 30) * 10);
                            System.out.println("total cost = " + total);
                        }
                        break;

                    case 'B':
                        System.out.println("Enter a bag wight (Maximum 25 kg)");
                        while (!input.hasNextInt()) {
                            System.out.println("Error! Please enter a valid weight (numbers only):");
                            input.next();
                        }
                        wight = input.nextInt();

                        if (wight > 25) {
                            System.out.println("You will pay 10SR each 1kg");

                            total = ((wight - 25) * 10);
                            System.out.println("total cost = " + total);

                        }
                        break;
                    case 'E':

                        System.out.println("Enter bag weight (Maximum 20 Kg)");
                        while (!input.hasNextInt()) {
                            System.out.println("Error! Please enter a valid weight (numbers only):");
                            input.next();
                        }
                        wight = input.nextInt();

                        if (wight > 20) {
                            total = ((wight - 20) * 10);
                            System.out.println("total cost = " + total + " SR");
                        } else {
                            System.out.println("No excess baggage charge. Have a nice trip :)");
                        }
                        break;
                    default:
                        System.out.println("Invalid please enter one of (F , B , E)");
                }
            }
        }

        
        input.close();

    }
}