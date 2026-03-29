/*
/*
 * ===================================================
 * ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Section     : 03 - Switch Statements
 * Question    : How to use char and string in switch
 * Date        : 2026-03-29
 * Description : Basic  for using text in switch.
 * ===================================================
 */

package lab_4.Switch_Statements;

public class string {
    public static void main (String [] args ) {
        String color = "Red";

switch (color) {
    case "Red": 
        System.out.println("Stop!");
        break;
    case "Green":
        System.out.println("Go!");
        break;
    default:
        System.out.println("Unknown color");
}
    }
}
