package java_assignment;

import java.util.Scanner;

public class IntArrayExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Advanced Array Operations System ---");
            System.out.println("1: Integer Array (Sum, Average, Max, Min)");
            System.out.println("2: Subject String Array (Iterate & Search)");
            System.out.println("3: Exit");
            System.out.print("Enter your choice: ");

            String choice = sc.next();

            if (choice.equals("3")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                int option = Integer.parseInt(choice);

                if (option == 1) {
                    System.out.print("Enter the size of the integer array: ");
                    int size = sc.nextInt();
                    int[] num = new int[size];

                    System.out.println("Enter " + size + " integer elements:");
                    int sum = 0;
                    for (int i = 0; i < size; i++) {
                        num[i] = sc.nextInt();
                        sum += num[i];
                    }

                    int max = num[0];
                    int min = num[0];
                    for (int i = 1; i < size; i++) {
                        if (num[i] > max) max = num[i];
                        if (num[i] < min) min = num[i];
                    }
                    
                    double average = (double) sum / size;

                    System.out.println("\n========================================");
                    System.out.print("Array Elements : ");
                    for (int n : num) {
                        System.out.print(n + " ");
                    }
                    System.out.println("\nSum of Elements: " + sum);
                    System.out.println("Average        : " + average);
                    System.out.println("Maximum Value  : " + max);
                    System.out.println("Minimum Value  : " + min);
                    System.out.println("========================================");

                } else if (option == 2) {
                    System.out.print("Enter the number of subjects: ");
                    int count = sc.nextInt();
                    sc.nextLine(); 

                    String[] subject = new String[count];
                    System.out.println("Enter " + count + " subject names:");
                    for (int i = 0; i < count; i++) {
                        subject[i] = sc.nextLine();
                    }

                    System.out.println("\n--- Subject List ---");
                    for (int i = 0; i < subject.length; i++) {
                        System.out.println((i + 1) + ". " + subject[i]);
                    }

                    System.out.print("\nEnter a subject name to search: ");
                    String searchItem = sc.nextLine();
                    boolean found = false;

                    for (String ele : subject) {
                        if (ele.equalsIgnoreCase(searchItem)) {
                            found = true;
                            break;
                        }
                    }

                    System.out.println("\n========================================");
                    if (found) {
                        System.out.println("Result: '" + searchItem + "' is AVAILABLE in your subjects.");
                    } else {
                        System.out.println("Result: '" + searchItem + "' is NOT FOUND.");
                    }
                    System.out.println("========================================");

                } else {
                    System.out.println("Invalid option! Please enter 1, 2, or 3.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter valid numeric choices/values.");
                sc.nextLine();
            }
        }
        sc.close();
    }
}