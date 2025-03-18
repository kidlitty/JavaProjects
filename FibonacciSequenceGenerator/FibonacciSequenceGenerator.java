import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //VARIABLES
        int userNum;
        int a, b;

        //INTRODUCTION
        System.out.println("****************************");
        System.out.println("FIBONACCI SEQUENCE GENERATOR");
        System.out.println("****************************");
        System.out.println();

        //USER INPUT
        System.out.print("Enter the number of sequences: ");
        userNum = scanner.nextInt();

        if (userNum <= 0) {
            System.out.println("Please enter a positive number");
        }

        //FIBONACCI SEQUENCE
        System.out.println("FIBONACCI SEQUENCE: ");
        a = 0;
        b = 1;

        for (int i = 0; i <= userNum; i++) {
            System.out.print(a + " ");
            int nextNum = a + b;
            a = b;
            b = nextNum;
        }

        scanner.close();
    }
}
