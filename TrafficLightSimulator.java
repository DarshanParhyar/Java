import java.util.Scanner;

public class TrafficLightSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter light color ");
        String lightColor = input.next();

        switch (lightColor) {
            case "Red":
                System.out.print("STOP");
                break;
            case "Green":
                System.out.print("GO");
                break;
            case "Yellow":
                System.out.print("Caution");
                break;
            default:
                System.out.println("Invalid Color");

                break;
        }

        input.close();
    }
}
