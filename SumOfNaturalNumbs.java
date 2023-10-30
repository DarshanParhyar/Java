import java.util.Scanner;

public class SumOfNaturalNumbs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to sum of natural of number ");
        int num1 = input.nextInt();
        int sum = 0;
        for (int index = 1; index <= num1; index++) {
            sum += index;
        }

        System.out.println("Sum of first " + num1 + " number is " + sum);
        input.close();

    }
}
