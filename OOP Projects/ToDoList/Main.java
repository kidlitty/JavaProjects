import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static final String filePath = "C:\\Users\\User\\Desktop\\Java Projects\\OOP Projects\\ToDoList\\Tasks.txt";

    public static void main (String[] args) {
        loadTasksFromFile();

        // Java To Do List Program
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;


        System.out.println("*************************");
        System.out.println("WELCOME TO THE TO DO LIST");
        System.out.println("*************************");

        while (isRunning) {
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    deleteTask(scanner);
                    break;
                case 3:
                    listTasks();
                    break;
                case 4:
                    System.out.println("Thank you for using the program. Bye!");
                    saveTasksToFile();
                    System.out.println("Your tasks have been saved.");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }


        scanner.close();
    }
    public static void addTask (Scanner scanner) {
        System.out.println("Enter the title of your task: ");
        String title = scanner.nextLine();
        System.out.println("Enter the contents of your task: ");
        String description = scanner.nextLine();

        tasks.add(new Task(title, description));
        System.out.println("Task added!");
    }
    public static void deleteTask (Scanner scanner) {
        int i = 1;
        for (Task task : tasks) {
            System.out.println(i + ". " + task);
            i++;
        }
        System.out.print("Enter the task you wish to delete: ");
        int taskDeleted = scanner.nextInt();
        scanner.nextLine();

        tasks.remove(taskDeleted - 1);
        System.out.println("Task removed!");
    }
    public static void listTasks () {
        int i = 1;
        for (Task task : tasks) {
            System.out.println(i + ". " + task);
            i++;
        }
    }
    public static void saveTasksToFile () {
        try (FileWriter writer = new FileWriter(filePath)) {
            int i = 1;
            for (Task task : tasks) {
                writer.write(i + ". Title: " + task.getTitle() + "\n" +
                                 "Description: " + task.getDescription() + "\n" +
                                 "Status: " + (task.isCompleted() ? "Completed" : "Pending") + "\n");
                i++;
            }
        }
        catch (IOException e) {
            System.out.println("Error saving tasks");
        }
    }
    public static void loadTasksFromFile () {
        System.out.println("Current Tasks To Do:" + "\n");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char)i);
            }
            System.out.println();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }

}
