import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueConversion;

        do {
            System.out.println("***  Welcome to Temperature Converter ***");
            System.out.println("Enter 1 for Celsius to Fahrenheit temperature");
            System.out.println("Enter 2 for Celsius to Kelvin temperature");
            System.out.println("Enter 3 for Fahrenheit to Celsius temperature");
            System.out.println("Enter 4 for Fahrenheit to Kelvin temperature");
            System.out.println("Enter 5 for Kelvin to Fahrenheit temperature");
            System.out.println("Enter 6 for Kelvin to Celsius temperature");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    CelsiusToFahrenheit();
                    break;
                case 2:
                    CelsiusToKelvin();
                    break;
                case 3:
                    FahrenheitToCelsius();
                    break;
                case 4:
                    FahrenheitToKelvin();
                    break;
                case 5:
                    KelvinToFahrenheit();
                    break;
                case 6:
                    KelvinToCelsius();
                    break;
                default:
                    System.out.print("INVALID NUMBER");
                    break;
            }

            System.out.println("\nDo you want to continue? (yes/no)");
            continueConversion = input.next().equalsIgnoreCase("yes");

        } while (continueConversion);

        input.close();
    }

    public static void CelsiusToFahrenheit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Celsius Temperature to Convert it in Fahrenheit: ");
        double celsius = input.nextDouble();
        double result = (celsius * 1.8) + 32;
        System.out.println("Fahrenheit temperature is " + result + "°F of Celsius temperature " + celsius + "°C");
    }

    public static void CelsiusToKelvin() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Celsius Temperature to Convert it in Kelvin: ");
        double celsius = input.nextDouble();
        double result = celsius + 273.15;
        System.out.println("Kelvin temperature is " + result + "K of Celsius temperature " + celsius + "°C");
    }

    public static void FahrenheitToCelsius() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fahrenheit Temperature to Convert it in Celsius: ");
        double fahrenheit = input.nextDouble();
        double result = (fahrenheit - 32) / 1.8;
        System.out.println("Celsius temperature is " + result + "°C of Fahrenheit temperature " + fahrenheit + "°F");
    }

    public static void FahrenheitToKelvin() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fahrenheit Temperature to Convert it in Kelvin: ");
        double fahrenheit = input.nextDouble();
        double result = ((fahrenheit - 32) * 5 / 9) + 273.15;
        System.out.println("Kelvin temperature is " + result + "K of Fahrenheit temperature " + fahrenheit + "°F");
    }

    public static void KelvinToFahrenheit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Kelvin Temperature to Convert it in Fahrenheit: ");
        double kelvin = input.nextDouble();
        double result = ((kelvin - 273.15) * 9 / 5) + 32;
        System.out.println("Fahrenheit temperature is " + result + "°F of Kelvin temperature " + kelvin + "K");
    }

    public static void KelvinToCelsius() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Kelvin Temperature to Convert it in Celsius: ");
        double kelvin = input.nextDouble();
        double result = kelvin - 273.15;
        System.out.println("Celsius temperature is " + result + "°C of Kelvin temperature " + kelvin + "K");
    }
}
