import java.util.Scanner;

public class Conditionalswitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNum = scanner.nextFloat();       
        scanner.nextLine(); // Consume the leftover newline

        System.out.print("Enter the second number: ");
        double secondNum = scanner.nextFloat();
        scanner.nextLine(); // Consume the leftover newline

        System.out.print("Enter the operation (sum, subtract, multiply, divide): ");
        String operation = scanner.nextLine().toLowerCase(); // Convert input to lowercase

        double result = 0; // Default result

        switch (operation) {
            case "sum":
                result = firstNum + secondNum;
                break;
            case "subtract":
                result = firstNum - secondNum;
                break;
            case "multiply":
                result = firstNum * secondNum;
                break;
            case "divide":
                if (secondNum != 0) {
                    result = firstNum / secondNum;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    scanner.close();
                    return; // Exit program early
                }
                break;
            default:
                System.out.println("Invalid operation.");
                scanner.close();
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
