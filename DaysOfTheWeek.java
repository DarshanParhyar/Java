import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter days number to check the day ");
        int dayNum = input.nextInt();
        if (dayNum == 1) {
            System.out.print("Monday");
        } else if (dayNum == 2) {
            System.out.print("Tuesday");
        }

        else if (dayNum == 3) {
            System.out.print("Wednesday");
        }

        else if (dayNum == 4) {
            System.out.print("Thursday");
        }

        else if (dayNum == 5) {
            System.out.print("Friday");
        }

        else if (dayNum == 6) {
            System.out.print("Saturday");
        }

        else if (dayNum == 7) {
            System.out.print("Sunday");
        }

        else {
            System.out.print("Kindly enter the number between 1 to 7");
        }

        input.close();
    }
}
