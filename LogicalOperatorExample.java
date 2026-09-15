package java_assignment;

import java.util.Scanner;

public class LogicalOperatorExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- CDAC Final Marksheet System ---");
            System.out.print("Enter Student Name (Type 'exit' to stop): ");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                System.out.println("\n[ CCEE Section - 4 Papers ]");
                System.out.print("Total CCEE Lab Marks (Out of 160)   : ");
                int cceeLab = Integer.parseInt(sc.nextLine());
                System.out.print("Total CCEE MCQ Marks (Out of 80)    : ");
                int cceeMcq = Integer.parseInt(sc.nextLine());
                System.out.print("Total CCEE Theory Marks (Out of 160): ");
                int cceeTheory = Integer.parseInt(sc.nextLine());

                System.out.println("\n[ CMCE Section - 5 Papers ]");
                System.out.print("Total CMCE Lab Marks (Out of 200)   : ");
                int cmceLab = Integer.parseInt(sc.nextLine());
                System.out.print("Total CMCE MCQ Marks (Out of 100)   : ");
                int cmceMcq = Integer.parseInt(sc.nextLine());
                System.out.print("Total CMCE Theory Marks (Out of 200): ");
                int cmceTheory = Integer.parseInt(sc.nextLine());

                System.out.println("\n[ Project Section ]");
                System.out.print("Total Project Marks (Out of 100)    : ");
                int project = Integer.parseInt(sc.nextLine());

                int cceeTotal = cceeLab + cceeMcq + cceeTheory;
                int cmceTotal = cmceLab + cmceMcq + cmceTheory;
                int grandTotal = cceeTotal + cmceTotal + project;
                
                float percentage = grandTotal / 10.0f;

                boolean isPass = (cceeTotal >= 160) && (cmceTotal >= 200) && (project >= 40);
                
                String status = isPass ? "PASS" : "FAIL";

                char grade;
                if (!isPass) {
                    grade = 'F';
                } else if (percentage >= 80) {
                    grade = 'A';
                } else if (percentage >= 65) {
                    grade = 'B';
                } else if (percentage >= 50) {
                    grade = 'C';
                } else {
                    grade = 'D';
                }

                System.out.println("\n==================================================");
                System.out.println("              FINAL ACADEMIC RESULT               ");
                System.out.println("==================================================");
                System.out.println("Name           : " + name);
                System.out.println("--------------------------------------------------");
                System.out.println("CCEE Total     : " + cceeTotal + " / 400");
                System.out.println("CMCE Total     : " + cmceTotal + " / 500");
                System.out.println("Project        : " + project + " / 100");
                System.out.println("--------------------------------------------------");
                System.out.println("Grand Total    : " + grandTotal + " / 1000");
                System.out.println("Percentage     : " + percentage + "%");
                System.out.println("Final Result   : " + status);
                System.out.println("Final Grade    : " + grade);
                System.out.println("==================================================");

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter valid numerical marks.");
            }
        }
        sc.close();
    }
}