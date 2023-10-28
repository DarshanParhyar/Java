public class ShiftOperatorsPractice {
    public static void main(String[] args) {
        int leftShiftValue = 5, rightShiftValue = -10;
        System.out.println("Left Shift operator by 2 positions" + (leftShiftValue << 2));
        System.out.println("Right Shift operator by 2 positions" + (rightShiftValue >> 2));
        System.out.print("Unsigned right shift of -10 by 2 positions" + (rightShiftValue >>> 2));

    }
}
