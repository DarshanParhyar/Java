public class TernaryOperatorPractice {
    public static void main(String[] args) {
        int score = 85;

        String result = score > 60 ? "pass" : "fail";
        System.out.println(result);

        result = score >= 90 ? "Excellent" : (score > 60 ? "Pass" : "Fail");
        System.out.println(result);

    }
}
