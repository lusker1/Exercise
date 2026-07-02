/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Custom Line Drawing Method
 * Date        : 2026-07-02
 * Description : A simple program that uses a method 
 * to draw lines with a loop.
 * ===================================================
 */

import java.util.*;

public class LineDrawer {
    public static void main(String[] args) {

        System.out.println("Start of program");
        drawLine('*', 10);
        System.out.println("End of program");
        drawLine('#', 30);

    }

    public static void drawLine(char ch, int length) {
        int i;
        for (i = 0; i <= length; i++) {
            System.out.print(ch);
        }
        System.out.println();

    }
}
