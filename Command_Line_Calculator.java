import java.util.Scanner;
public class Command_Line_Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to the Command-Line Calculator!");
            System.out.println("Please enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Please enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Please select an operation (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                default:
                    System.out.println("Invalid operator!");
                    break;
            }

            System.out.println("The result is: " + result);

            scanner.close();
        }
}
