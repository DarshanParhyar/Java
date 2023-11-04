public class AverageOfElements {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println("Average is " + result / arr.length);

    }
}