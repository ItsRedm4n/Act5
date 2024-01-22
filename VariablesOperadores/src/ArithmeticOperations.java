import java.util.Scanner;

public class ArithmeticOperations {
    private double numX;
    private double numY;

    public ArithmeticOperations(double attributeX, double attributeY) {
        this.numX = attributeX;
        this.numY = attributeY;
    }

    public void performOperations() {
        double sum = numX + numY;
        double subtraction = numX - numY;
        double multiplication = numX * numY;

        // Handle division by zero to avoid errors
        double division = (numY != 0) ? (numX / numY) : Double.POSITIVE_INFINITY;
        double modulo = (numY != 0) ? (numX % numY) : Double.NaN;

        // Print the results
        System.out.println("X = " + numX);
        System.out.println("Y = " + numY);
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for attributeX
        System.out.print("Enter the value for X: ");
        double attributeX = scanner.nextDouble();

        // Get user input for attributeY
        System.out.print("Enter the value for Y: ");
        double attributeY = scanner.nextDouble();

        // Example of usage
        ArithmeticOperations operations = new ArithmeticOperations(attributeX, attributeY);
        operations.performOperations();

        // Close the scanner
        scanner.close();
    }
}
