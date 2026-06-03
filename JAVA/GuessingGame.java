import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.class);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess = 0;
        boolean win = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");
        
        while (!win) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;
            
            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Wrong! The number is **HIGHER** than " + guess + " 👇");
            } else {
                System.out.println("Wrong! The number is **LOWER** than " + guess + " 👆");
            }
        }
        
        System.out.println("\n🎉 Congratulations, Sidi Mawlay! You won the game!");
        System.out.println("The correct number was: " + numberToGuess);
        System.out.println("Total attempts: " + numberOfTries);
        
        scanner.close();
    }
}
