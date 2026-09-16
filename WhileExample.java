package java_assignment;

import java.util.Scanner;

public class WhileExample {

    public static int sumOfDigits(int num) {
        int sum = 0;
        num = Math.abs(num);
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int countDigits(int num) {
        int count = 0;
        num = Math.abs(num);
        if (num == 0) return 1;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int reverseNumber(int num) {
        int reverse = 0;
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);
        while (num != 0) {
            reverse = reverse * 10 + (num % 10);
            num /= 10;
        }
        return reverse * sign;
    }

    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }

    public static boolean isArmstrong(int num) {
        if (num < 0) return false;
        int original = num;
        int sum = 0;
        int digits = countDigits(num);
        int temp = num;
        
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Advanced Number Digit Analyzer ---");
            System.out.print("Enter an integer (or type 'exit' to stop): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                int num = Integer.parseInt(input);

                int sum = sumOfDigits(num);
                int count = countDigits(num);
                int reverse = reverseNumber(num);
                boolean palindrome = isPalindrome(num);
                boolean armstrong = isArmstrong(num);

                System.out.println("\n========================================");
                System.out.println("Input Number        : " + num);
                System.out.println("Total Digits        : " + count);
                System.out.println("Sum of Digits       : " + sum);
                System.out.println("Reversed Number     : " + reverse);
                System.out.println("Is Palindrome?      : " + (palindrome ? "YES" : "NO"));
                System.out.println("Is Armstrong Number?: " + (armstrong ? "YES" : "NO"));
                System.out.println("========================================");

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid integer number.");
            }
        }
        sc.close();
    }
}