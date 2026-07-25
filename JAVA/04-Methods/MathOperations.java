/*
 * ===================================================
 * سبحان الله وبحمده سبحان الله العظيم
 * ===================================================
 * Author      : BinSaleh (lusker1)
 * Question    : Mathematical Operations & Methods
 * Date        : 2026-07-25
 * Description : Reads two double numbers and calculates their square roots, power, absolute difference, and min/max values using custom methods and streams.
 * ===================================================
 */
import java.util.* ;
public class MathOperations {

    static Scanner input = new Scanner (System.in) ; 
    public static void main(String[] args) {
        
        System.out.println("Enter a : " );
        double a = input . nextDouble();

        System.out.println("Enter b : ");
        double b = input . nextDouble() ;

        //method number 1 =  Math.sqrt();
        double[] roots = sqrt(a, b) ;
        System.out.println("Square roots are " + roots[0] + " and " +  roots[1]);

        // method number 2 =  Math.pow() ;
        System.out.println("a ^ b  = " + pow(a, b));
        
        // method number 3 = Absolute Math.abs();
        System.out.println("|a - b| = " + absolute(a, b));

        double[] higherLower = maxMin(a, b); 
        System.out.println("Maximum = " + higherLower[0] + " , Minimum = " + higherLower[1]);
    }
    public static double[] sqrt(double num1 , double num2 ) {

         double rootNum1 = Math.sqrt(num1) ; 
         double rootNum2 = Math.sqrt(num2) ;

         return new double[] {rootNum1 , rootNum2}; 
    }
    
    public static double pow(double num1 , double num2) {
        
        double pow = (Math.pow(num1, num2)) ; 
        return pow ; 
    }

    public static double absolute(double num1 , double num2) {
        
        //double  absolute1=  (num1 > num2) ? (num1 - num2) : (num2 - num1) ;
        double absolute1 = Math.abs(num1 - num2) ;
        return absolute1 ; 
        
    }
    public static double[] maxMin(double num1 , double num2) {

        double min = Arrays.stream(new double[]{num1 , num2}).min().getAsDouble();
        double max =  Arrays.stream(new double[]{num1 , num2}).max().getAsDouble();
        return new double[] {max , min}; 
    }
    
}