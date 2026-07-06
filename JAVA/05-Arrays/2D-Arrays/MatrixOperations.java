/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : 2D Array Matrix Operations
 * Date        : 2026-07-07
 * Description : A simple program to fill, print, and sum 
 * a 2D array (matrix) using specialized methods.
 * ===================================================
 */

import java.util.*;

public class MatrixOperations {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] martix = new int[5][3]; // row 5 ,,,,, columns 3

        fillarray(martix);
        System.out.println("======= array filled =======");

        System.out.println("======= Array will be printed =======");
        printarray(martix);

        System.out.println("Array will be summed ");
      int total =   sumarray(martix) ;

      System.out.println("sum are Equal = " + total);
    }

    public static void fillarray(int[][] list) {

        for (int row = 0; row < list.length; row++)
            for (int col = 0; col < list[0].length; col++) {
                System.out.println("Enter data for Row Number = " + (row + 1) + " , And column number = " + (col + 1 ));
                list[row][col] = input.nextInt();
            }
    }

    public static void printarray(int[][] list) 
    {

        for(int row = 0 ; row < list.length ; row++ )
            for(int col = 0 ; col < list[0].length ; col++) {
                System.out.println(list[row][col] + "\t");
            }
            System.out.println();

    }

        public static int sumarray(int[][] list) 
    {
        int sum = 0 ; 
        for(int row = 0 ; row < list.length ; row++ )
            for(int col = 0 ; col < list[0].length ; col++) {
                sum += list[row][col];

            }
            return sum ; 

    }


}
