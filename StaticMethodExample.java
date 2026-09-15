package java_assignment;

import java.util.Scanner;

public class StaticMethodExample {

    public static String findOddEven(int num) {
        if (num % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Static Method Demo (Odd/Even Checker) ---");
            System.out.print("Enter a number to check (Type 'exit' to stop): ");
            
            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                int num = Integer.parseInt(input);
                
                String result = findOddEven(num);
                
                System.out.println("\n========================================");
                System.out.println("Input Number : " + num);
                System.out.println("Result       : The number is " + result);
                System.out.println("========================================");
                
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid integer number.");
            }
        }
        sc.close();
    }
}