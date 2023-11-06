import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of elements to store in the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Input " + size + " number of elements in the array:");

        for (int index = 0; index < size; index++) {
            System.out.print("Element " + index + ": ");
            arr[index] = input.nextInt();
        }

        int max = arr[0]; 

        for (int index = 1; index < size; index++) {
            if (arr[index] > max) {
                max = arr[index]; 
            }
        }

        System.out.println("Max element in the array is: " + max);
    }
}
