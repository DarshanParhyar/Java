public class RemoveSpecificElement {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        System.out.print("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int removeIndex = 1;
        for (int i = removeIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.print("\nArray after Removing element: ");

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
