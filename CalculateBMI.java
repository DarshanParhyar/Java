import java.util.Scanner;

public class CalculateBMI {

    public static double calculateBMI(double weight, double height) {
        
        return (weight / (height * height)) * 703;
    }

    public static String findStatus(double bmi) {
        
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi <= 24.9)
            return "Normal";
        else if (bmi <= 29.9)
            return "Overweight";
        else
            return "Obese"; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds:");
        double weight = input.nextDouble();

        System.out.println("Enter height in inches:");
        double height = input.nextDouble();

       
        double bmi = calculateBMI(weight, height);

       
        String status = findStatus(bmi);

        System.out.println("Your BMI is " + bmi + " which is considered " + status);

        input.close(); 
    }
}
