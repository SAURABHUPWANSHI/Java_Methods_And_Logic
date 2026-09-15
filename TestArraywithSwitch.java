package java_assignment;

import java.util.Scanner;

public class TestArraywithSwitch {

    static int[] numbers;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Array Switch System (File 2) ---");
            System.out.println("1: Create array");
            System.out.println("2: Iterate the array");
            System.out.println("3: Update the array");
            System.out.println("4: Find max from the array");
            System.out.println("5: Exit");
            System.out.print("Enter the option: ");
            
            String input = scanner.next();
            
            try {
                int op = Integer.parseInt(input);
                switch (op) {
                    case 1: setupArray(); break;
                    case 2: displayArray(); break;
                    case 3: modifyArray(); break;
                    case 4: getMaxValue(); break;
                    case 5: 
                        System.out.println("Exiting TestArraywithSwitch...");
                        System.exit(0);
                        break;
                    default: System.out.println("Invalid option!"); 
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }

    public static void setupArray() {
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        numbers = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Array created successfully!\n");
    }

    public static void displayArray() {
        if (numbers == null) {
            System.out.println("Array is empty!\n");
            return;
        }
        System.out.print("Array elements: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println("\n");
    }

    public static void modifyArray() {
        if (numbers == null) {
            System.out.println("Array is empty!\n");
            return;
        }
        System.out.print("Enter index to update (0 to " + (numbers.length - 1) + "): ");
        int index = scanner.nextInt();
        if (index >= 0 && index < numbers.length) {
            System.out.print("Enter new value: ");
            numbers[index] = scanner.nextInt();
            System.out.println("Updated successfully!\n");
        } else {
            System.out.println("Index out of bounds!\n");
        }
    }

    public static void getMaxValue() {
        if (numbers == null) {
            System.out.println("Array is empty!\n");
            return;
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max value is: " + max + "\n");
    }
}