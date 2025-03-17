import java.util.Scanner;

public class SimpleQuizProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //VARIABLES
        String [] questions = {
            "A) What is the capital city of France?",
            "B) Which chemical element has the symbol Au?",
            "C) Who painted the Mona Lisa?",
            "D) Which Shakespeare play features the star-crossed lovers Romeo and Juliet?",
            "E) Which planet in our solar system has the most moons",
            "F) What is the chemical symbol for sodium?",
            "G) Which planet is known as the \"Red Planet\"?",
            "H) The Great Barrier Reef is located off the coast of which country?",
            "I) Which famous painter cut off part of his own ear?",
            "J) What is the largest organ in the human body?"
        };

        String [][] answers = {
            {"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},
            {"1. Silver", "2. Gold", "3. Aluminum", "4. Iron"},
            {"1. Vincent Van Gogh", "2. Leonardo Da Vinci", "3. Pablo Picasso", "4. Michelangelo"},
            {"1. Hamlet", "2. Macbeth", "3. Romeo And Juliet", "4. Othello"},
            {"1. Jupiter", "2. Saturn", "3. Uranus", "4. Neptune"},
            {"1. So", "2. Na", "3. S", "4. K"},
            {"1. Venus", "2. Mars", "3. Jupiter", "4. Mercury"},
            {"1. Brazil", "2. Australia", "3. Indonesia", "4. Mexico"},
            {"1. Pablo Picasso", "2. Salvador Dalí", "3. Vincent Van Gogh", "4. Claude Monet"},
            {"1. Liver", "2. Heart", "3. Skin", "4. Lungs"},
        };

        int [] correctAnswers = {3,2,2,3,2,2,2,2,3,3,2,2};
        int score = 0;


        //USER INPUT
        System.out.println("*******************");
        System.out.println("SIMPLE QUIZ PROGRAM");
        System.out.println("*******************");
        System.out.println();

        //QUIZ
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            
            for (String answer : answers[i]) {
                System.out.println(answer);
            }

            System.out.print("Choose your answer: ");
            int userChoice = scanner.nextInt();

            if (userChoice == correctAnswers[i]) {
                score++;
                System.out.println("Correct!\n");
            } else if (userChoice > 4 || userChoice < 1) {
                System.out.println("Invalid Answer");
            } else {
                System.out.println("Wrong!\n");
            }
        }
        //RESULTS FROM QUIZ
        System.out.println("Quiz Ended! Your score is: " + score);

        scanner.close();
    }
}
