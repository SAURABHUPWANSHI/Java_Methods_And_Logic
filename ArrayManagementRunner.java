package java_assignment;

import java.util.Scanner;

public class ArrayManagementRunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Array Management System ---");
            System.out.println("1: Create Array");
            System.out.println("2: Iterate Array Elements");
            System.out.println("3: Update Array Element");
            System.out.println("4: Find Maximum Value");
            System.out.println("5: Exit");
            System.out.print("Enter your option: ");

            String input = sc.next();

            try {
                int op = Integer.parseInt(input);

                switch (op) {
                    case 1: 
                        ArrayManagement.createArray(); 
                        break;
                    case 2: 
                        ArrayManagement.iterateArrayElement(); 
                        break;
                    case 3: 
                        ArrayManagement.updateArrayElement(); 
                        break;
                    case 4: 
                        ArrayManagement.findMax(); 
                        break;
                    case 5: 
                        System.out.println("Exiting the program...");
                        sc.close();
                        System.exit(0);
                        break;
                    default: 
                        System.out.println("Invalid option! Please enter a number between 1 and 5."); 
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }
}