import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.class);

        System.out.println("=== BMI Calculator ===");

        // Input Weight in kilograms
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();

        // Input Height in centimeters and convert to meters
        System.out.print("Enter your height in cm: ");
        double heightInCm = input.nextDouble();
        double heightInMeters = heightInCm / 100.0;

        // Calculate BMI: weight / (height * height)
        double bmi = weight / (heightInMeters * heightInMeters);

        // Print the result formatted to 2 decimal places
        System.out.printf("%nYour BMI is: %.2f%n", bmi);

        // Determine weight status
        if (bmi < 18.5) {
            System.out.println("Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Status: Normal weight (Healthy)");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obesity");
        }

        input.close();
    }
}
