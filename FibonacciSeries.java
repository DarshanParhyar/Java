public class FibonacciSeries {
    public static void main(String[] args) {

        int n = 10;
        System.out.print("Fibonacci Series: ");
        int num1 = 0, num2 = 1, num3;
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        for (int i = 2; i <= n; i++) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;

        }
    }

}
