/*
Exercise 5 — Cylinder Volume
Description: Compute the volume of a cylinder given its radius r and height h. Use the
formula V = πr2h. The program reads r and h (e.g., in meters) and outputs the volume.
Input:- radius : double- height : double Output: The volume of the cylinder. Sample run:
Enter cylinder radius: 2.0
Enter cylinder height: 10.0
Cylinder volume = 125.66370614359172

===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
Exercise: Exercise 5 — Cylinder Volume
Date: 3/12/2026
Author: BinSaleh (lusker1)
Description: Compute the area and volume of a cylinder using the formula: Area = radius * radius * π and Volume = area * length.
===================================================
*/


import java.util.*;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Cylinder radius");
        double radius = input.nextDouble();
        System.out.println("Enter cylinder height");
        double height = input.nextDouble();

        double formula = (Math.PI * radius * radius * height);

        System.out.println("Cylinder volume : " + formula);
        input.close();
    }
}