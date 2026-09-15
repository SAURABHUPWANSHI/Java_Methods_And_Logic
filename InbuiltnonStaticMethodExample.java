package java_assignment;

import java.util.Scanner;

public class InbuiltnonStaticMethodExample {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Marksheet Generator ---");
            System.out.print("Enter Student Name (Type 'exit' to stop): ");
            String name = s.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                System.out.print("Enter Student ID: ");
                int sid = Integer.parseInt(s.nextLine());

                System.out.print("Enter English marks: ");
                int eng = Integer.parseInt(s.nextLine());

                System.out.print("Enter Hindi marks: ");
                int hin = Integer.parseInt(s.nextLine());

                System.out.print("Enter Maths marks: ");
                int math = Integer.parseInt(s.nextLine());

                System.out.print("Enter Physics marks: ");
                int phy = Integer.parseInt(s.nextLine());

                System.out.print("Enter Chemistry marks: ");
                int chem = Integer.parseInt(s.nextLine());

                int totalMarks = eng + hin + math + phy + chem;
                float percentage = totalMarks / 5.0f;

                String status;
                if (eng >= 33 && hin >= 33 && math >= 33 && phy >= 33 && chem >= 33) {
                    status = "PASS";
                } else {
                    status = "FAIL";
                }

                char grade;
                if (status.equals("FAIL")) {
                    grade = 'F';
                } else if (percentage >= 80) {
                    grade = 'A';
                } else if (percentage >= 60) {
                    grade = 'B';
                } else if (percentage >= 50) {
                    grade = 'C';
                } else {
                    grade = 'D';
                }

                System.out.println("\n========================================");
                System.out.println("             STUDENT MARK SHEET         ");
                System.out.println("========================================");
                System.out.println("Student ID : " + sid);
                System.out.println("Name       : " + name);
                System.out.println("----------------------------------------");
                System.out.println("English    : " + eng);
                System.out.println("Hindi      : " + hin);
                System.out.println("Maths      : " + math);
                System.out.println("Physics    : " + phy);
                System.out.println("Chemistry  : " + chem);
                System.out.println("----------------------------------------");
                System.out.println("Total Marks: " + totalMarks + " / 500");
                System.out.println("Percentage : " + percentage + "%");
                System.out.println("Result     : " + status);
                System.out.println("Grade      : " + grade);
                System.out.println("========================================");

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers only for ID and Marks.");
            }
        }
        s.close();
    }
}