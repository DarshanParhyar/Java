import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer to count the digit: ");
        int num = input.nextInt();
        int count = 0;

        while (num != 0) {
            count++;
            num /= 10;
        }

        System.out.print("Digits in number: " + count);
        input.close();

    }
}
