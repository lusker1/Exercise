import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.class);
        
        // Take user details
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        // Calculate approximate birth year
        int currentYear = 2026;
        int birthYear = currentYear - age;
        
        // Output result
        System.out.println("\n--- User Profile ---");
        System.out.println("Welcome, " + name + "!");
        System.out.println("You were probably born in: " + birthYear);
        
        input.close();
    }
}
