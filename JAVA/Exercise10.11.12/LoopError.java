/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 2 - Loop (Fixed)
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-15
 Description: Resolved! We added (count++) and the 
              infinite loop is finally over.
===================================================
*/
public class LoopError {
    public static void main(String[] args) {
        
        int count = 1 ; 
        System.out.println("--- Starting Count ---");
        while (count <= 5) {
            System.out.println("   current number: " + count );

           count++ ; 


        }
        System.out.println("--- End of Count ---");
    }
}
