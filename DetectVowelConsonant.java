import java.util.Scanner;

public class DetectVowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter lower case character (A to Z) to check vowel or consonant ");
        char c = input.next().charAt(0);
        switch (c) {
            case 'A':
                System.out.print("Vowel");
                break;
            case 'E':
                System.out.print("Vowel");
                break;
            case 'I':
                System.out.print("Vowel");
                break;
            case 'O':
                System.out.print("Vowel");
                break;
            case 'U':
                System.out.print("Vowel");
                break;

            default:
                System.out.print("Consonant");
                break;
        }
        input.close();
    }
}
