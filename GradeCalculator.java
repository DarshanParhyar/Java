import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score between 0 and 100");
        int score = input.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.print("A grade");
        }

        else if (score >= 80 && score <= 89) {
            System.out.println("B Grade");

        }

        else if (score >= 70 && score <= 79) {
            System.out.print("C Grade");
        }

        else if (score >= 60 && score <= 69) {
            System.out.print("D Grade");
        }

        else if (score <= 59 && score >= 0) {
            System.out.println("F Grade");
        }

        else {
            System.out.println("Kindly Enter your score between 0 and 100");
        }

        input.close();

    }
}