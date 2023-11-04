public class IndexOfElement {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        int element = 5;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("The index of the " + element + " is: " + i);
                return;

            }

        }

        System.out.print("No such element found");

    }
}