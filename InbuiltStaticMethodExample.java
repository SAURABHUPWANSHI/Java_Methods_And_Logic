package java_assignment;

import java.util.Scanner;

public class InbuiltStaticMethodExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Advanced Inbuilt Math Operations ---");
            System.out.println("1: Calculate Square Root");
            System.out.println("2: Calculate Power (Base & Exponent)");
            System.out.println("3: Find Maximum of Two Numbers");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");

            String choice = sc.next();

            if (choice.equals("4")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                int option = Integer.parseInt(choice);

                if (option == 1) {
                    System.out.print("Enter a positive number: ");
                    double num = sc.nextDouble();
                    
                    if (num < 0) {
                        System.out.println("Error: Square root of a negative number is not real.");
                    } else {
                        double result = Math.sqrt(num);
                        System.out.println("\nResult: Square Root of " + num + " is " + result);
                    }
                    
                } else if (option == 2) {
                    System.out.print("Enter the base number: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter the exponent (power): ");
                    double exponent = sc.nextDouble();
                    
                    double result = Math.pow(base, exponent);
                    System.out.println("\nResult: " + base + " raised to the power of " + exponent + " is " + result);
                    
                } else if (option == 3) {
                    System.out.print("Enter the first number: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num2 = sc.nextDouble();
                    
                    double result = Math.max(num1, num2);
                    System.out.println("\nResult: The maximum between " + num1 + " and " + num2 + " is " + result);
                    
                } else {
                    System.out.println("Invalid option! Please enter a number between 1 and 4.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter valid numeric values.");
                sc.nextLine(); 
            }
        }
        sc.close();
    }
}