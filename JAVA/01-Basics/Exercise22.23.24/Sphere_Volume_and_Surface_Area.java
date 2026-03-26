/*
Exercise 24 — Sphere Volume and Surface Area
Description: Compute the volume and surface area of a sphere from its radius. Use the
formulas V = 4
3
πr3 and A = 4πr2. The program reads the sphere’s radius and outputs both
the volume and surface area. Input:- radius : double Output: The volume and surface area
of the sphere. Sample run:

Enter sphere radius: 2
Volume = 33.510321638291124
Surface Area = 50.26548245743669

/*
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 24 - Sphere Volume and Surface Area
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-19
 Description: Computes the sphere's volume (4/3*π*r³) 
              and surface area (4*π*r²) using Math.PI 
              and Math.pow for high precision.
===================================================
*/
import java.util.* ; 


public class Sphere_Volume_and_Surface_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;

        System.out.println("Enter Sphere radius: ");
        double sphereRadius = input.nextDouble() ; 

        double volume = ((4.0/3) * Math.PI * Math.pow(sphereRadius, 3)) ; 
        double surfaceArea = (4 * Math.PI * Math.pow(sphereRadius, 2)) ;


        
        System.out.println("==========================");
        System.out.println("Volume Equal = " + volume);
        System.out.println("==========================");

        System.out.println("Surface Area = " + surfaceArea);
        System.out.println("==========================");
    }
}
