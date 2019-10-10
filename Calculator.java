import java.util.Scanner;

/**
 * Calculates simple stuff.
 */
public class Calculator {

  public static void main(String[] args) {
    runCalculator();
  }

  private static void runCalculator() {
    System.out.println("SIMPLE CALCULATOR");
    System.out.println("Enter your name: ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    System.out.println("Welcome to Simple Calculator, " + name + "!");

    while (true) {
      System.out.println("Enter first operand: ");
      int operandA = scanner.nextInt();

      System.out.println("Enter second operand: ");
      int operandB = scanner.nextInt();

      System.out.println("Enter the operation (+ - / or *)");
      char operation = scanner.next().charAt(0);

      switch (operation) {
      case '+':
        System.out.println(operandA + " + " + operandB + " = " + (operandA + operandB));
        break;
      case '-':
        System.out.println(operandA + " - " + operandB + " = " + (operandA - operandB));
        break;
      case '*':
        System.out.println(operandA + " * " + operandB + " = " + (operandA * operandB));
        break;
      case '/':
        if (operandB == 0) {
          System.out.println("The second operand cannot be 0 if you are using /");
          break;
        }
        System.out.print(operandA + " / " + operandB + " = " + (operandA / operandB));
        if ((operandA % operandB) != 0) {
          System.out.println(" Remainder " + (operandA % operandB));
        }
        break;
      default:
        System.out.println("Invalid operation");
        break;
      }
      System.out.println();
    }
  }
}
