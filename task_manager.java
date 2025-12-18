import java.util.*;

public class task_manager {

    // Feature methods will be added by team members
public static void addTask(String task) {
    try (java.io.FileWriter fw = new java.io.FileWriter("tasks.txt", true)) {
        fw.write(task + "\n");
        System.out.println("Task added successfully.");
    } catch (Exception e) {
        System.out.println("Error adding task.");
    }
}
    public static void showTasks() {}
    public static void deleteTask(String task) {}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Task Manager CLI ===");
        System.out.println("1. Add Task");
        System.out.println("2. Show Tasks");
        System.out.println("3. Delete Task");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.print("Enter task: ");
            addTask(sc.nextLine());
        } 
        else if (choice == 2) {
            showTasks();
        } 
        else if (choice == 3) {
            System.out.print("Enter task to delete: ");
            deleteTask(sc.nextLine());
        } 
        else {
            System.out.println("Invalid option");
        }
    }
}
