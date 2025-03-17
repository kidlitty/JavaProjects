import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //VARIABLES
        double num1;
        double num2;
        double result;
        char symbol;
        
        //USER INPUT & PROMPT
        System.out.println("******************");
        System.out.println("CALCULATOR PROGRAM");
        System.out.println("******************");
        System.out.println();

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter your operator(+, -, *, /, %): ");
        symbol = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
        

        //CALCULATIONS & RESULTS
        switch (symbol) {
            case '+':
                result = num1 + num2;
                System.out.print("Your Answer Is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.print("Your Answer Is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.print("Your Answer Is: " + result);
                break;
            case '/':
                if (num1 == 0 || num2 == 0) {
                    System.out.println("Cannot divide with/by 0");
                } else {
                    result = num1 / num2;
                    System.out.print("Your Answer Is: " + result);
                }
                break;
            case '%':
                if (num1 == 0 || num2 == 0) {
                System.out.println("Cannot divide with/by 0");
                } else {
                result = num1 % num2;
                System.out.print("Your Answer Is: " + result);
                }   
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        scanner.close();
    }
}
