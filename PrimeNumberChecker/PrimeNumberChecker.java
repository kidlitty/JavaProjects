import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //INTRODUCTION
        System.out.println("********************");
        System.out.println("PRIME NUMBER CHECKER");
        System.out.println("********************");
        System.out.println();

        //CHOICE BETWEEN CHECKING A SINGLE PRIME NUMBER
        //OR PRINTING EVERY PRIME NUMBER IN A GIVEN UNIT
        System.out.println("What Would You Like To Do: ");
        System.out.println("1. Check If A Single Number Is Prime");
        System.out.println("2. Print Out Every Prime Number Up To A Given Unit\n");
        System.out.print("Enter Your Choice: ");
        int choice = scanner.nextInt();

        //OUTPUT
        switch (choice) {
            case 1:
                checkPrimeNumber(scanner);
                break;
            case 2:
                printPrimeNumber(scanner);
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        
        scanner.close();
    }
    //METHODS TO USE
    public static void checkPrimeNumber(Scanner scanner) {
        System.out.println("Check If A Single Number Is Prime\n");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a prime number");
        } 

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number");
            } else {
                System.out.println(num + " is a prime number");
            }
            
        }
    }
    public static void printPrimeNumber(Scanner scanner) {
        System.out.println("Print Out Every Prime Number Up To A Given Unit\n");
        System.out.print("Enter the max number: ");
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a prime number");
        }

        for (int currentNum = 2; currentNum <= num; currentNum++) {
            if (isPrime(currentNum)) {
                System.out.println(currentNum);
            }
        }

        
    }
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
