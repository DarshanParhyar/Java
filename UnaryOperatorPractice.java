public class UnaryOperatorPractice {
    public static void main(String[] args) {
        int num = 5, res;
        System.out.println("Original Number : " + num);
        res = num++;
        System.out.println("Post increment " + res);
        res = ++num;
        System.out.println("Pre increment " + res);
        res = --num;
        System.out.println("Pre Decrement by 1: " + res);
        res = num--;
        System.out.println("Post Decrement by 1: " + res);
        System.out.print(res);

    }
}
