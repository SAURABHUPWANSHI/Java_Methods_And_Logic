package java_assignment;

import java.util.Scanner;

public class ifelseifExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- If-Else If Examples ---");
            System.out.println("1: Student Grade Calculator");
            System.out.println("2: Simple Calculator");
            System.out.println("3: Exit");
            System.out.print("Enter your choice: ");

            String choice = sc.next();

            if (choice.equals("3")) {
                System.out.println("Exiting the program...");
                break;
            }

            if (choice.equals("1")) {
                try {
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Project Marks: ");
                    int projectMark = sc.nextInt();

                    char grade;
                    if (projectMark > 80) {
                        grade = 'A';
                    } else if (projectMark > 60) {
                        grade = 'B';
                    } else if (projectMark > 50) {
                        grade = 'C';
                    } else {
                        grade = 'F';
                    }

                    System.out.println("\n=========================");
                    System.out.println("Student ID   : " + sid);
                    System.out.println("Student Name : " + name);
                    System.out.println("Project Marks: " + projectMark);
                    System.out.println("Final Grade  : " + grade);
                    System.out.println("=========================");

                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter correct values.");
                    sc.nextLine(); 
                }
            } else if (choice.equals("2")) {
                try {
                    System.out.print("Enter first number (a): ");
                    int a = sc.nextInt();

                    System.out.print("Enter second number (b): ");
                    int b = sc.nextInt();

                    System.out.print("Enter operator (+, -, *, /): ");
                    char op = sc.next().charAt(0);

                    System.out.println("\n=========================");
                    if (op == '+') {
                        System.out.println("Result: " + a + " + " + b + " = " + (a + b));
                    } else if (op == '-') {
                        System.out.println("Result: " + a + " - " + b + " = " + (a - b));
                    } else if (op == '*') {
                        System.out.println("Result: " + a + " * " + b + " = " + (a * b));
                    } else if (op == '/') {
                        if (b != 0) {
                            System.out.println("Result: " + a + " / " + b + " = " + (a / b));
                        } else {
                            System.out.println("Error: Cannot divide by zero!");
                        }
                    } else {
                        System.out.println("Invalid operator!");
                    }
                    System.out.println("=========================");

                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter numbers correctly.");
                    sc.nextLine();
                }
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
        sc.close();
    }
}