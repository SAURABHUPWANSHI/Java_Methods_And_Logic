package java_assignment;

import java.util.Scanner;

public class ArrayManagement {
    
    static int[] arr;
    static Scanner sc = new Scanner(System.in);

    // Ye raha main method jo error ko theek karega
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Array Management System ---");
            System.out.println("1: Create array");
            System.out.println("2: Iterate the array");
            System.out.println("3: Update the array");
            System.out.println("4: Find max from the array");
            System.out.println("5: Exit");
            System.out.print("Enter the option: ");
            
            int op = sc.nextInt();
            
            switch (op) {
                case 1: 
                    createArray(); 
                    break;
                case 2: 
                    iterateArrayElement(); 
                    break;
                case 3: 
                    updateArrayElement(); 
                    break;
                case 4: 
                    findMax(); 
                    break;
                case 5: 
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
                default: 
                    System.out.println("Invalid option. Please try again.\n"); 
            }
        }
    }

    public static void createArray() {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        arr = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array created successfully!\n");
    }

    public static void iterateArrayElement() {
        if (arr == null) {
            System.out.println("Array is empty! Please create the array first (Option 1).\n");
            return;
        }
        
        System.out.print("Array elements are: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

    public static void findMax() {
        if (arr == null) {
            System.out.println("Array is empty! Please create the array first (Option 1).\n");
            return;
        }
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum value in the array is: " + max + "\n");
    }

    public static void updateArrayElement() {
        if (arr == null) {
            System.out.println("Array is empty! Please create the array first (Option 1).\n");
            return;
        }
        
        System.out.print("Enter the index you want to update (0 to " + (arr.length - 1) + "): ");
        int index = sc.nextInt();
        
        if (index >= 0 && index < arr.length) {
            System.out.print("Enter the new value: ");
            int newValue = sc.nextInt();
            arr[index] = newValue;
            System.out.println("Array element updated successfully!\n");
        } else {
            System.out.println("Invalid index!\n");
        }
    }
}