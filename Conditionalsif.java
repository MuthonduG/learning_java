import java.util.Scanner;

public class Conditionalsif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNum = scanner.nextFloat();       
        scanner.nextLine(); // Consume the leftover newline

        System.out.print("Enter the second number: ");
        double secondNum = scanner.nextFloat();
        scanner.nextLine(); // Consume the leftover newline

        System.out.print("Enter the operation (sum, subtract, multiply, divide): ");
        String operation = scanner.nextLine();

        double result = 0; // Default result

        if (operation.equalsIgnoreCase("sum")) {
            result = firstNum + secondNum;
        } 
        else if (operation.equalsIgnoreCase("subtract")) {
            result = firstNum - secondNum;
        } 
        else if (operation.equalsIgnoreCase("multiply")) {
            result = firstNum * secondNum;
        } 
        else if (operation.equalsIgnoreCase("divide")) {
            if (secondNum != 0) {
                result = firstNum / secondNum;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                scanner.close();
                return;
                
            }
        } 
        else {
            System.out.println("Invalid operation.");
            scanner.close();
            return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
