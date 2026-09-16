package java_assignment;

import java.util.Scanner;

public class InbuiltStaticMethodExample {

    public static long getFactorial(long n) {
        if (n < 0 || n > 20) return -1; 
        if (n == 0 || n == 1) return 1;
        long fact = 1;
        for (long i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean checkPrime(long n) {
        if (n <= 1) return false;
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean checkPerfect(long n) {
        if (n <= 0) return false;
        long sum = 0;
        for (long i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    public static long getReverse(long n) {
        long rev = 0;
        long temp = Math.abs(n);
        while (temp != 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        return n < 0 ? -rev : rev;
    }

    public static long getSumOfDigits(long n) {
        long sum = 0;
        long temp = Math.abs(n);
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }

    public static boolean checkArmstrong(long n) {
        if (n < 0) return false;
        long sum = 0;
        long temp = n;
        long digits = String.valueOf(n).length();
        while (temp != 0) {
            long rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===============================================================================");
            System.out.println("                 COMPREHENSIVE NUMERICAL ANALYSIS SYSTEM                       ");
            System.out.println("===============================================================================");
            System.out.print("Enter ANY number to completely analyze it (or type 'exit' to stop): ");
            
            String input = sc.next();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Shutting down the analysis system... Goodbye!");
                break;
            }

            try {
                double val = Double.parseDouble(input);
                long intVal = (long) val;
                boolean isInteger = (val == intVal);

                System.out.println("\n===============================================================================");
                System.out.printf("                        FULL ANALYSIS OF NUMBER: %s\n", input);
                System.out.println("===============================================================================");
                
                System.out.println("\n[1] CORE MATHEMATICS ----------------------------------------------------------");
                System.out.printf("%-30s: %f\n", "Square Root (√x)", Math.sqrt(val));
                System.out.printf("%-30s: %f\n", "Cube Root (∛x)", Math.cbrt(val));
                System.out.printf("%-30s: %f\n", "Square (x²)", Math.pow(val, 2));
                System.out.printf("%-30s: %f\n", "Cube (x³)", Math.pow(val, 3));
                System.out.printf("%-30s: %f\n", "Absolute Value (|x|)", Math.abs(val));
                System.out.printf("%-30s: %f\n", "Ceiling (Round Up)", Math.ceil(val));
                System.out.printf("%-30s: %f\n", "Floor (Round Down)", Math.floor(val));
                System.out.printf("%-30s: %d\n", "Rounded Integer", Math.round(val));
                System.out.printf("%-30s: %f\n", "Signum (Sign Indicator)", Math.signum(val));

                System.out.println("\n[2] TRIGONOMETRY (Assuming input as Degrees) ----------------------------------");
                double rad = Math.toRadians(val);
                System.out.printf("%-30s: %f\n", "Radians Equivalent", rad);
                System.out.printf("%-30s: %f\n", "Sine (Sin)", Math.sin(rad));
                System.out.printf("%-30s: %f\n", "Cosine (Cos)", Math.cos(rad));
                System.out.printf("%-30s: %f\n", "Tangent (Tan)", Math.tan(rad));
                System.out.printf("%-30s: %f\n", "Hyperbolic Sine (Sinh)", Math.sinh(val));
                System.out.printf("%-30s: %f\n", "Hyperbolic Cosine (Cosh)", Math.cosh(val));

                System.out.println("\n[3] LOGARITHMIC & EXPONENTIAL -------------------------------------------------");
                System.out.printf("%-30s: %f\n", "Exponential (e^x)", Math.exp(val));
                System.out.printf("%-30s: %f\n", "Natural Log (ln)", Math.log(val));
                System.out.printf("%-30s: %f\n", "Base-10 Log (log10)", Math.log10(val));
                System.out.printf("%-30s: %f\n", "Expm1 (e^x - 1)", Math.expm1(val));
                System.out.printf("%-30s: %f\n", "Log1p (ln(1+x))", Math.log1p(val));

                System.out.println("\n[4] GEOMETRY (Assuming input is Radius or Side) -------------------------------");
                System.out.printf("%-30s: %f\n", "Circle Area", Math.PI * Math.pow(val, 2));
                System.out.printf("%-30s: %f\n", "Circle Circumference", 2 * Math.PI * val);
                System.out.printf("%-30s: %f\n", "Sphere Volume", (4.0 / 3.0) * Math.PI * Math.pow(val, 3));
                System.out.printf("%-30s: %f\n", "Sphere Surface Area", 4 * Math.PI * Math.pow(val, 2));
                System.out.printf("%-30s: %f\n", "Square Area", Math.pow(val, 2));
                System.out.printf("%-30s: %f\n", "Cube Volume", Math.pow(val, 3));

                System.out.println("\n[5] REAL-WORLD CONVERSIONS ----------------------------------------------------");
                System.out.printf("%-30s: %f\n", "Celsius to Fahrenheit", (val * 9 / 5) + 32);
                System.out.printf("%-30s: %f\n", "Fahrenheit to Celsius", (val - 32) * 5 / 9);
                System.out.printf("%-30s: %f\n", "Kilometers to Miles", val * 0.621371);
                System.out.printf("%-30s: %f\n", "Miles to Kilometers", val * 1.60934);
                System.out.printf("%-30s: %f\n", "Kilograms to Pounds", val * 2.20462);
                System.out.printf("%-30s: %f\n", "Pounds to Kilograms", val / 2.20462);
                System.out.printf("%-30s: %f\n", "Meters to Feet", val * 3.28084);
                System.out.printf("%-30s: %f\n", "Bytes to Megabytes", val / (1024 * 1024));

                System.out.println("\n[6] DEEP NUMBER LOGIC ---------------------------------------------------------");
                if (isInteger) {
                    System.out.printf("%-30s: %s\n", "Is Even Number?", (intVal % 2 == 0) ? "YES" : "NO");
                    System.out.printf("%-30s: %s\n", "Is Odd Number?", (intVal % 2 != 0) ? "YES" : "NO");
                    System.out.printf("%-30s: %s\n", "Is Prime Number?", checkPrime(intVal) ? "YES" : "NO");
                    System.out.printf("%-30s: %s\n", "Is Perfect Number?", checkPerfect(intVal) ? "YES" : "NO");
                    System.out.printf("%-30s: %s\n", "Is Palindrome?", (intVal == getReverse(intVal)) ? "YES" : "NO");
                    System.out.printf("%-30s: %s\n", "Is Armstrong Number?", checkArmstrong(intVal) ? "YES" : "NO");
                    System.out.printf("%-30s: %d\n", "Sum of Digits", getSumOfDigits(intVal));
                    System.out.printf("%-30s: %d\n", "Reversed Number", getReverse(intVal));
                    
                    long fact = getFactorial(intVal);
                    if (fact != -1) {
                        System.out.printf("%-30s: %d\n", "Factorial (n!)", fact);
                    } else {
                        System.out.printf("%-30s: %s\n", "Factorial (n!)", "Number too large/negative for Factorial");
                    }
                } else {
                    System.out.println(">> Logic checks skipped (Input is a Decimal, not an Integer) <<");
                }
                
                System.out.println("===============================================================================\n");

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
        sc.close();
    }
}