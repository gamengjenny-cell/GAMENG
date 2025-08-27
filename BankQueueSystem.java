/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue_;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Customer class
class Customer {
    private String name;
    private int number;

    public Customer(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Customer #" + number + ": " + name;
    }
}

// Main class
public class BankQueueSystem {
    private static Queue<Customer> queue = new LinkedList<>();
    private static int customerCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Welcome to the Bank Queue System ===");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add customer to queue");
            System.out.println("2. Serve next customer");
            System.out.println("3. View queue");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addCustomer(scanner);
                    break;
                case "2":
                    serveCustomer();
                    break;
                case "3":
                    viewQueue();
                    break;
                case "4":
                    running = false;
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private static void addCustomer(Scanner scanner) {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        Customer customer = new Customer(name, customerCounter++);
        queue.add(customer);
        System.out.println("Customer added: " + customer);
        viewQueue();
    }

    private static void serveCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in the queue.");
        } else {
            Customer served = queue.poll();
            System.out.println("Serving customer: " + served);
        }
        viewQueue();
    }

    private static void viewQueue() {
        if (queue.isEmpty()) {
            System.out.println("The queue is currently empty.");
        } else {
            System.out.println("Current queue:");
            for (Customer c : queue) {
                System.out.println(" - " + c);
            }
        }
    }
}
