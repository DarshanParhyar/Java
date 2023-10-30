import java.util.Scanner;

public class ReverseTheDigitInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer to reverse it: ");
        int num = input.nextInt();
        int rev = 0;

        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        System.out.print("Reverse number: " + rev);
        input.close();

    }
}
