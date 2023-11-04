public class ArrayContainSpecificValue {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4 };
        int check = 10;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (check == array[i]) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.print(check + " is available in your give array");
        } else {
            System.out.print(check + " is not available in your give array");
        }
    }
}