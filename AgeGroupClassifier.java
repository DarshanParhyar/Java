import java.util.Scanner;

public class AgeGroupClassifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if (age < 12 && age > 0) {
            System.out.println("You are a child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a teenager");
        } else if (age >= 20 && age <= 59) {
            System.out.print("You are an adult");
        } else {
            System.out.println("You are Senior");
        }
        input.close();
    }
}
