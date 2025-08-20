/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        class TaskNode {
    String title;
    TaskNode next;

    public TaskNode(String title) {
        this.title = title;
        this.next = null;
    }
}

// Linked List class
class ToDoList {
    private TaskNode head;

    // Add task at the end
    public void addTask(String title) {
        TaskNode newNode = new TaskNode(title);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Task added!");
    }

    // Delete task by title
    public void deleteTask(String title) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.title.equals(title)) {
            head = head.next;
            System.out.println("Task deleted!");
            return;
        }

        TaskNode temp = head;
        while (temp.next != null && !temp.next.title.equals(title)) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Task not found!");
        } else {
            temp.next = temp.next.next;
            System.out.println("Task deleted!");
        }
    }

    // Print all tasks
    public void printTasks() {
        if (head == null) {
            System.out.println("No tasks found!");
            return;
        }

        System.out.println("Your Tasks:");
        TaskNode temp = head;
        while (temp != null) {
            System.out.println("- " + temp.title);
            temp = temp.next;
        }
    }

    // Search task by title
    public boolean contains(String title) {
        TaskNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

// Main class with menu

    
        Scanner sc = new Scanner(System.in);
        ToDoList list = new ToDoList();
        int choice;

        do {
            System.out.println("\n1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. View all tasks");
            System.out.println("4. Search task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = sc.nextLine();
                    list.addTask(title);
                    break;

                case 2:
                    System.out.print("Enter task title to delete: ");
                    String delTitle = sc.nextLine();
                    list.deleteTask(delTitle);
                    break;

                case 3:
                    list.printTasks();
                    break;

                case 4:
                    System.out.print("Enter task title to search: ");
                    String searchTitle = sc.nextLine();
                    if (list.contains(searchTitle)) {
                        System.out.println("Task found!");
                    } else {
                        System.out.println("Task not found!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
    
