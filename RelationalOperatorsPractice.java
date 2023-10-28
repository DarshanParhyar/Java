public class RelationalOperatorsPractice {
    public static void main(String[] args) {
        int x = 10, y = 20;
        boolean t = x == y;
        System.out.println("x == y : " + t);
        t = x != y;
        System.out.println("x != y : " + t);
        t = x > y;
        System.out.println("x > y : " + t);
        t = x < y;
        System.out.println("x < y : " + t);
        t = x >= y;
        System.out.println("x >= y : " + t);
        t = x <= y;
        System.out.println("x <= y : " + t);

        String str1 = "Hello", str2 = "hello";
        t = str1 == str2;
        System.out.println("str1 == str2 : " + t);
        t = str1.equals(str2);
        System.out.println("str1.equals(str2) : " + t);

    }
}
