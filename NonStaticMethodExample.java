package java_assignment;

import java.util.Scanner;

public class NonStaticMethodExample {

    String name;
    String profession;
    int experience;
    double salary;

    public void registerProfile(String n, String p, int e) {
        name = n;
        profession = p;
        experience = e;
        
        if (experience < 5) {
            salary = 500000.0;
        } else if (experience >= 5 && experience < 10) {
            salary = 1200000.0;
        } else if (experience >= 10 && experience < 15) {
            salary = 2500000.0;
        } else if (experience >= 15 && experience < 20) {
            salary = 4500000.0;
        } else if (experience >= 20 && experience < 25) {
            salary = 7000000.0;
        } else {
            salary = 10000000.0;
        }
    }

    public void generateCard() {
        System.out.println("\n==============================================");
        System.out.println("           PROFESSIONAL ID & PAYSLIP          ");
        System.out.println("==============================================");
        System.out.println("Name         : " + name);
        System.out.println("Profession   : " + profession);
        System.out.println("Experience   : " + experience + " Years");
        System.out.println("Base Package : ₹ " + salary + " / Year");
        System.out.println("==============================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NonStaticMethodExample obj = new NonStaticMethodExample();

        while (true) {
            System.out.println("\n--- Profile & Salary Generator ---");
            System.out.print("Enter your Name (Type 'exit' to stop): ");
            String inputName = sc.nextLine();

            if (inputName.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                System.out.print("Enter your Profession (e.g., Full Stack Developer): ");
                String inputProf = sc.nextLine();

                System.out.print("Enter your Experience (in years): ");
                int inputExp = Integer.parseInt(sc.nextLine());

                obj.registerProfile(inputName, inputProf, inputExp);
                
                obj.generateCard();

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number for experience.");
            }
        }
        sc.close();
    }
}