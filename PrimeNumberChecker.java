import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check prime or not: ");
        int num = input.nextInt();

        for (int i = 2; i <= num / 2;) {
            if (num % i == 0) {
                System.out.println("The number " + num + " is NOT a prime number.");
                break;
            } else {
                System.out.println("The number " + num + " IS a prime number.");
                break;
            }
        }
        input.close();
    }
}
