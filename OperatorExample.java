package java_assignment;

import java.util.Scanner;

public class OperatorExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Increment Operator Example ---");
            System.out.println("1: Post-Increment (b = a++)");
            System.out.println("2: Pre-Increment (b = ++a)");
            System.out.println("3: Complex Expression (b = a++ + ++a)");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");
            
            String choice = sc.next();

            if (choice.equals("4")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                System.out.print("Enter the initial value of 'a': ");
                int initialValue = Integer.parseInt(sc.next());
                int a = initialValue;

                System.out.println("\n=================================");
                if (choice.equals("1")) {
                    int b = a++;
                    System.out.println("Operation  : b = a++");
                    System.out.println("Result 'b' : " + b + " (Takes old value)");
                    System.out.println("New 'a'    : " + a + " (Incremented after)");
                } else if (choice.equals("2")) {
                    int b = ++a;
                    System.out.println("Operation  : b = ++a");
                    System.out.println("Result 'b' : " + b + " (Takes new value)");
                    System.out.println("New 'a'    : " + a + " (Incremented before)");
                } else if (choice.equals("3")) {
                    int b = a++ + ++a;
                    System.out.println("Operation  : b = a++ + ++a");
                    System.out.println("Initial 'a': " + initialValue);
                    System.out.println("Result 'b' : " + b);
                    System.out.println("Final 'a'  : " + a);
                } else {
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
                }
                System.out.println("=================================");

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid integer number.");
            }
        }
        sc.close();
    }
}