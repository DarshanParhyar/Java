import java.util.Scanner;

public class ReadNumReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Input the number of elements to store in the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Input" + size + " number of elements in the array :" );
        for (int index = 0; index < size; index++) {
            System.out.print("Elements - "+ index+":" );
            arr[index]=input.nextInt();

        }

        System.out.println("The value Stored in the array are ");
        for (int index = 0; index < size; index++) {
            System.out.print( arr[index] +" ");
        }

        System.out.println("\nThe values store into the array in reverse are :");
        for (int index = size-1; index >=0; index--) {
            System.out.print( arr[index] + " ");
        }

    }
}
