package java_assignment;

import java.util.Scanner;

public class Passbyreference {

    public static void change(int[] n, int index, int newValue) {
        n[index] = newValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Pass By Reference (Array) Demo ---");
            System.out.print("Do you want to test Pass by Reference? (y/exit): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                System.out.print("Enter the size of the array: ");
                int size = Integer.parseInt(sc.next());
                int[] num = new int[size];

                System.out.println("Enter " + size + " elements:");
                for (int i = 0; i < size; i++) {
                    num[i] = Integer.parseInt(sc.next());
                }

                System.out.println("\n========================================");
                System.out.print("Array BEFORE calling change function : ");
                for (int ele : num) {
                    System.out.print(ele + " ");
                }
                System.out.println();

                System.out.print("\nEnter the index you want to modify (0 to " + (size - 1) + "): ");
                int index = Integer.parseInt(sc.next());

                System.out.print("Enter the new value: ");
                int newValue = Integer.parseInt(sc.next());

                change(num, index, newValue);

                System.out.print("\nArray AFTER calling change function  : ");
                for (int ele : num) {
                    System.out.print(ele + " ");
                }
                System.out.println("\n========================================");
                System.out.println("Note: Original array is permanently modified");
                System.out.println("because arrays are passed by reference!");

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter valid integer numbers/index.");
            }
        }
        sc.close();
    }
}