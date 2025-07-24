import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();

        
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        // Perform operation using if statements
        if (operator == '+') {
            result = n1 + n2;
            System.out.println("Result: " + result);
        } else if (operator == '-') {
            result = n1 - n2;
            System.out.println("Result: " + result);
        } else if (operator == '*') {
            result = n1 * n2;
            System.out.println("Result: " + result);
        } else if (operator == '/') {
            if (n2 != 0) {
                result = n1 / n2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator.");
        }


    }
}
