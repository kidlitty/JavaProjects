import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //INTRODUCTION
        System.out.println("**************");
        System.out.println("UNIT CONVERTER");
        System.out.println("**************");
        System.out.println();

        //USER INPUT
        System.out.println("What Would You Like To Convert:");
        System.out.print("1. Length \n2. Weight \n3. Time \n4. Temperature \n5. Exit\n");
        System.out.print("Enter your choice here: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                lengthConverter(scanner);
                break;
            case 2:
                weightConverter(scanner);
                break;
            case 3:
                timeConverter(scanner);
                break;
            case 4:
                temperatureConverter(scanner);
                break;
            case 5:
                
                break;
            default:
                System.out.println("Invalid Choice.");
                break;
        }
        

        //CONVERSION AND OUTPUT

        scanner.close();
    }
    //METHODS TO USE
    public static void lengthConverter(Scanner scanner) {
        String [] options = {"1. Centimeters To Inches      ", "2. Metres To Feet             ", "3. Kilometers To Miles        \n", "4. Inches To Centimeters      ", "5. Feet To Metres             ", "6. Miles To Kilometers        \n", "7. Centimeters To Metres      ", "8. Metres To Kilometers       ", "9. Metres To Centimeters       \n", "10. Inches To Feet            ", "11. Feet To Miles             ", "12. Feet To Inches            ", "\n13. Exit                      "};

        System.out.println("What do you wish to convert: \n");

        for (String option : options) {
            System.out.print(option);
        }
        System.out.println();
        System.out.print("\nEnter your choices here: ");
        int choice = scanner.nextInt();
        double num = 0;
        double result = 0;


        switch (choice) {
            case 1:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 2.54;
                System.out.printf("%.2fcm = %.2fin", num, result);
                break;
            case 2:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num * 3.281;
                System.out.printf("%.2fm = %.2fft", num, result);
                break;
            case 3:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 1.609;
                System.out.printf("%.2fkm = %.2fmi", num, result);
                break;
            case 4:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num * 2.54;
                System.out.printf("%.2fin = %.2fcm", num, result);
                break;
            case 5:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 3.281;
                System.out.printf("%.2fft = %.2fm", num, result);
                break;
            case 6:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 1.609;
                System.out.printf("%.2fcm = %.2fin", num, result);
                break;
            case 7:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 100;
                System.out.printf("%.2fcm = %.2fm", num, result);
                break;
            case 8:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 1000;
                System.out.printf("%.2fm = %.2fkm", num, result);
                break;
            case 9:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num * 100;
                System.out.printf("%.2fm = %.2fcm", num, result);
                break;
            case 10:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 12;
                System.out.printf("%.2fin = %.2fft", num, result);
                break;
            case 11:
               System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 5280;
                System.out.printf("%.2fft = %.2fmi", num, result);
                break;
            case 12:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num * 12;
                System.out.printf("%.2fft = %.2fin", num, result);
                break;
            case 13:
                break;
            default:
                System.out.println("Invalid Choice.");
                break;
        }

    }
    public static void weightConverter(Scanner scanner) {
        String [] options = {"1. Grams To Ounces        ", "2. Kilograms To Pounds      ", "3. Metric Ton To US Ton      \n", "4. Ounces To Grams        ", "5. Pounds To Kilograms      ", "6. US Ton To Metric Ton      \n", "7. Grams To Kilograms     ", "8. Kilograms To Metric Tonne       ", "9. Kilograms To Grams       \n", "10. Ounces To Pounds      ", "11. Pounds To US Ton        ", "12. Pounds To Ounces        \n", "13. Exit      "};

        System.out.println("What do you wish to convert: \n");
        for (String option : options) {
            System.out.print(option);
        }
        System.out.println();
        System.out.print("\nEnter your choice here: ");
        int choice = scanner.nextInt();
        double num = 0;
        double result = 0;

        switch (choice) {
            case 1:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 28.35;
                System.out.printf("%.2fg = %.2foz", num, result);
                break;
            case 2:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num * 2.205;
                System.out.printf("%.2fkg = %.2flb", num, result);
                break;
            case 3:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num * 1.102;
                System.out.printf("%.2fton = %.2ft", num, result);
                break;
            case 4:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num * 28.35;
                System.out.printf("%.2foz = %.2fg", num, result);
                break;
            case 5:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 2.205;
                System.out.printf("%.2flb = %.2fkg", num, result);
                break;
            case 6:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 1.102;
                System.out.printf("%.2fton = %.2ft", num, result);
                break;
            case 7:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 1000;
                System.out.printf("%.2fg = %.2fkg", num, result);
                break;
            case 8:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 1000;
                System.out.printf("%.2fkg = %.2fton", num, result);
                break;
            case 9:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 1000;
                System.out.printf("%.2fkg = %.2fg", num, result);
                break;
            case 10:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 16;
                System.out.printf("%.2foz = %.2flb", num, result);
                break;
            case 11:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 2000;
                System.out.printf("%.2flb = %.2ft", num, result);
                break;
            case 12:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num * 16;
                System.out.printf("%.2flb = %.2ft", num, result);
                break;
            case 13:
                
                break;
            default:
                System.out.println("Invalid Choice.");
                break;
        }

    }
    public static void timeConverter(Scanner scanner) {
        String [] options = {"1. Seconds To Minutes     ", "2. Minutes To Hours     ", "3. Hours To Days        \n", "4. Days To Weeks      ", "5. Weeks To Months      ", "6. Months To Years      \n", "7. Years To Decades       ", "8. Decades To Centuries     ", "9. Minutes To Seconds       \n", "10. Hours To Minutes        ", "11. Days To Hours     ", "12. Weeks To Days       \n", "13. Months To Weeks       ", "14. Years To Months     ", "15. Decades To Years        ", "16. Centuries To Decades        \n", "17. Exit"};

        System.out.println("What do you wish to convert: \n");
        for (String option : options) {
            System.out.print(option);
        }
        System.out.println();
        System.out.print("\nEnter your choice here: ");
        int choice = scanner.nextInt();
        double num = 0;
        double result = 0;

        switch (choice) {
            case 1:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 60;
                System.out.printf("%.1fsec = %.1fmin", num, result);
                break;
            case 2:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 60;
                System.out.printf("%.1fmin = %.1fhr", num, result);
                break;
            case 3:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 24;
                System.out.printf("%.1fhr = %.1f days", num, result);
                break;
            case 4:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 7;
                System.out.printf("%.1f days = %.1f weeks", num, result);
                break;
            case 5:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 4.345;
                System.out.printf("%.1f weeks = %.1f months", num, result);
                break;
            case 6:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 12;
                System.out.printf("%.1f months = %.1f years", num, result);
                break;
            case 7:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 10;
                System.out.printf("%.1f years = %.1f decades", num, result);
                break;
            case 8:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num / 10;
                System.out.printf("%.1f decades = %.1f centuries ", num, result);
                break;
            case 9:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num * 60;
                System.out.printf("%.1fmin = %.1fsec", num, result);
                break;
            case 10:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num * 60;
                System.out.printf("%.1fhr = %.2fmin", num, result);
                break;
            case 11:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num * 24;
                System.out.printf("%.1f days = %.1fhr", num, result);
                break;
            case 12:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num * 7;
                System.out.printf("%.1f weeks = %.1f days", num, result);
                break;
            case 13:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num * 4.345;
                System.out.printf("%.1f months = %.1f weeks", num, result);
                break;
            case 14:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num * 12;
                System.out.printf("%.1f years = %.1f month", num, result);
                break;
            case 15:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num * 10;
                System.out.printf("%.1f decades = %.1f years", num, result);
                break;
            case 16:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num * 10;
                System.out.printf("%.1f centuries = %.1f decades", num, result);
                break;
            case 17:
                
                break;
            default:
                System.out.println("Invalid Choice.");
                break;
        }

    }
    public static void temperatureConverter(Scanner scanner) {
        String [] options = {"1. Celsius To Fahrenheit     ", "2. Celsuis To Kelvin        \n", "3. Fahrenheit To Celsuis       ", "4. Fahrenheit To Kelvin     \n", "5. Kelvin To Celsuis      ", "6. Kelvin To Fahrenheit     \n", "7. Exit       "};

        System.out.println("What do you wish to convert: \n");
        for (String option : options) {
            System.out.print(option);
        }
        System.out.println();
        System.out.print("\nEnter your choice here: ");
        int choice = scanner.nextInt();
        double num = 0;
        double result = 0;

        switch (choice) {
            case 1:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = (num * 9/5) + 32;
                System.out.printf("%.2f°C = %.2f°F", num, result);
                break;
            case 2:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num + 273.15;
                System.out.printf("%.2f°C = %.2fK", num, result);
                break;
            case 3:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = (num - 32) * 5 / 9;
                System.out.printf("%.2f°F = %.2f°C", num, result);
                break;
            case 4:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = (num - 32) * 5 / 9 + 273.15;
                System.out.printf("%.2f°F = %.2fK", num, result);
                break;
            case 5:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = num - 273.15;
                System.out.printf("%.2fK = %.2f°C", num, result);
                break;
            case 6:
                System.out.println(options[choice-1]);
                System.out.print("Enter the number: ");
                num = scanner.nextDouble();
                result = (num - 273.15) * 9/5 + 32;
                System.out.printf("%.2fK = %.2f°F", num, result);
                break;
            case 7:

                break;
        
            default:
                System.out.println("Invalid Choice");
                break;
        }

    }
}
