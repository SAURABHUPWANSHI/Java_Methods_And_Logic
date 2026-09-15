package java_assignment;

import java.util.Scanner;

public class passbyvalue {

    public static void change(int a, int b, int newA, int newB) {
        a = newA;
        b = newB;
        System.out.println("Inside Method  : a = " + a + "   b = " + b + " (Local copies changed)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Pass By Value Demo (Primitives) ---");
            System.out.print("Enter 'y' to test or 'exit' to stop: ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                System.out.print("Enter initial value for 'a': ");
                int a = Integer.parseInt(sc.next());
                
                System.out.print("Enter initial value for 'b': ");
                int b = Integer.parseInt(sc.next());

                System.out.print("Enter new value for 'a' to set inside method: ");
                int newA = Integer.parseInt(sc.next());

                System.out.print("Enter new value for 'b' to set inside method: ");
                int newB = Integer.parseInt(sc.next());

                System.out.println("\n=======================================================");
                System.out.println("Before Method  : a = " + a + "   b = " + b);
                
                change(a, b, newA, newB);
                
                System.out.println("After Method   : a = " + a + "   b = " + b + " (Originals unchanged)");
                System.out.println("=======================================================");
                System.out.println("Note: Primitives (int) pass a COPY of their value.");
                System.out.println("Modifying them inside the method doesn't affect originals.");

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter valid integer numbers.");
            }
        }
        sc.close();
    }
}