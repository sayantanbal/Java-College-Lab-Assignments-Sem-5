import java.util.Scanner;

// Class ArithmeticOp
class ArithmeticOp {

    // 1. Add function - returns int
    int add(int a, int b) {
        return a + b;
    }

    // 2. Subtract function - returns int
    int subtract(int a, int b) {
        return a - b;
    }

    // 3. Multiply function - returns int
    int mult(int a, int b) {
        return a * b;
    }

    // 4. Divide function - returns double, throws exception if divisor is 0
    double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return (double) a / b;
    }
}

// Main class to test
public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticOp op = new ArithmeticOp();

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.println("\nResults:");
        System.out.println("Addition: " + op.add(n1, n2));
        System.out.println("Subtraction: " + op.subtract(n1, n2));
        System.out.println("Multiplication: " + op.mult(n1, n2));

        // Handling exception for divide
        try {
            System.out.println("Division: " + op.divide(n1, n2));
        } catch (ArithmeticException e) {
            System.out.println("Division Error: " + e.getMessage());
        }

        sc.close();
    }
}