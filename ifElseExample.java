package java_assignment;

import java.util.Scanner;

public class ifElseExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Even/Odd Number Checker ---");
            System.out.print("Enter a number (Type 'e' to exit): ");
            
            String input = sc.next();

            if (input.equalsIgnoreCase("e")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                int num = Integer.parseInt(input);

                System.out.println("\n----------------------------------------");
                System.out.println("Number Entered : " + num);
                
                if (num % 2 == 0) {
                    System.out.println("Result         : The number is EVEN");
                } else {
                    System.out.println("Result         : The number is ODD");
                }
                System.out.println("----------------------------------------");

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid integer or 'e'.");
            }
        }

        sc.close();
    }
}