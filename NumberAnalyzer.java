package java_assignment;

import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Number Analyzer System ---");
            System.out.print("Enter any integer number (Type 'exit' to stop): ");
            
            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                int number = Integer.parseInt(input);
                
                System.out.println("\n========================================");
                System.out.println("Input Number : " + number);
                
                if (number > 0) {
                    System.out.println("Result       : The number is POSITIVE");
                } else if (number < 0) {
                    System.out.println("Result       : The number is NEGATIVE");
                } else {
                    System.out.println("Result       : The number is ZERO");
                }
                
                System.out.println("========================================");
                
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid integer number.");
            }
        }
        sc.close();
    }
}