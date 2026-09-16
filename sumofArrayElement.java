package java_assignment;

import java.util.Scanner;

public class sumofArrayElement {

    public static int[] createintArray(Scanner sc, int size) {
        int[] num = new int[size];
        System.out.println("Enter " + size + " integer elements:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        return num;
    }

    public static int findsum(int[] num) {
        int sum = 0;
        for (int j : num) {
            sum += j;
        }
        return sum;
    }

    public static double findAverage(int sum, int size) {
        return (double) sum / size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Dynamic Array Math Calculator ---");
            System.out.print("Type 'start' to calculate or 'exit' to stop: ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                System.out.print("Enter the size of the array: ");
                int size = sc.nextInt();

                if (size <= 0) {
                    System.out.println("Size must be greater than 0.");
                    continue;
                }

                int[] arr = createintArray(sc, size);
                
                int totalSum = findsum(arr);
                double average = findAverage(totalSum, size);
                
                int evenCount = 0;
                int oddCount = 0;
                for (int n : arr) {
                    if (n % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }

                System.out.println("\n========================================");
                System.out.print("Array Elements : ");
                for (int n : arr) {
                    System.out.print(n + " ");
                }
                System.out.println("\nTotal Sum      : " + totalSum);
                System.out.println("Average        : " + average);
                System.out.println("Even Numbers   : " + evenCount);
                System.out.println("Odd Numbers    : " + oddCount);
                System.out.println("========================================");

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter valid integer numbers.");
                sc.nextLine(); 
            }
        }
        sc.close();
    }
}