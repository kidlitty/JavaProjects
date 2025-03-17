import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //VARIABLES
        int highest;
        int randomNum;
        int userInput;
        int attempts = 0;
        int score = 0;

        //INITAILIZE THE RANDOM NUMBER
        System.out.println("********************");
        System.out.println("NUMBER GUESSING GAME");
        System.out.println("********************");
        System.out.println();

        System.out.print("Enter the highest number: ");
        highest = scanner.nextInt();

        randomNum = random.nextInt(1, highest + 1);

        //USER INPUT FOR GUESSING

        while (true) {
            System.out.printf("Guess The Number Between(1 - %d): ", highest);
            userInput = scanner.nextInt();
            
            if (userInput > randomNum) {
                System.out.println("The number is smaller");
                attempts++;
                System.out.println("Attempts: " + attempts);
                
            } else if (userInput < randomNum) {
                System.out.println("The number is bigger");
                attempts++;
                System.out.println("Attempts: " + attempts);

            } else {
                System.out.println("Correct! The number is: " + randomNum);
                score++;
                System.out.println("Your score is: " + score);
                break;
            }
        }

        scanner.close();
    }
}
