import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name?");
        String name = scanner.nextLine();
        
        System.out.printf("Hello %s, how old are you", name);
        
        int age = scanner.nextInt();
        System.out.printf("%d, is a nice age to start programming", age);

        scanner.close();
    }
    
}
