import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter operand1: ");
        int op1 = input.nextInt();
        System.out.print("Enter operand2: ");
        int op2 = input.nextInt();
        System.out.print("Enter Operator: ");
        char op = input.next().charAt(0);
        int result;
        if (op == '+') {
            result = op1 + op2;
            System.out.print("Addition of " + op1 + " + " + op2 + " = " + result);
        }

        else if (op == '-') {
            result = op1 - op2;
            System.out.print("Subtraction of " + op1 + " - " + op2 + " = " + result);
        }

        else if (op == '*') {
            result = op1 * op2;
            System.out.print("Multiplication of " + op1 + " * " + op2 + " = " + result);
        }

        else if (op == '/') {
            result = op1 / op2;
            System.out.print("Division of " + op1 + " / " + op2 + " = " + result);
        }

        else {
            System.out.print("Enter Operator (+,-,*,/)");
        }
        input.close();
    }
}
