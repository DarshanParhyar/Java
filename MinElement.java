import java.util.Scanner;

public class MinElement {
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

        int min = arr[0]; 

        for (int index = 1; index < size; index++) {
            if (arr[index] < min) {
                min = arr[index]; 
            }
        }

        System.out.println("min element in the array is: " + min);
    }
}
