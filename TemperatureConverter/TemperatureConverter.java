import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //VARIABLES
        double temp;
        char unit;

        //INTRODUCTION
        System.out.println("*********************");
        System.out.println("TEMPERATURE CONVERTER");
        System.out.println("*********************");
        System.out.println("Convert from Celsius and Fahrenheit");
        System.out.println();
        
        //USER INPUT
        System.out.print("Enter the temperature you wish to convert: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        //CONVERSION
        System.out.print("What are you converting to?(F/C): ");
        unit = Character.toUpperCase(scanner.next().charAt(0));

        if (unit == 'F' ) {
            convertToFahrenheit(temp);
        } else if (unit == 'C') {
            convertToCelsius(temp);
        } else {
            System.out.println("Invalid Unit.");
        }

        scanner.close();
    }
    //METHODS TO USE
    public static void convertToFahrenheit(double i) {
        double result = (i * 9 / 5) + 32;
        System.out.printf("The temperature is: %.2fF", result);
    }
    public static void convertToCelsius(double i) {
        double result = (i - 32) * 5 / 9;
        System.out.printf("The temperature is: %.2fC", result);
    }
}
