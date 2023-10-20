import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        
        if(c >= 'A' && c <= 'Z') {
            System.out.print("1");
        } else if(c >= 'a' && c <= 'z') {
            System.out.print("0");
        } else {
            System.out.print("-1");
        }
    }
}
