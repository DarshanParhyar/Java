import java.util.Scanner;
public class Even_Odd {

 public static void main (String [] args) 
 {

  Scanner input = new Scanner (System.in);

   System.out.println("Enter a number to know its even or odd: ");
   int num = input.nextInt();

   if(num % 2 == 0) 
   {
   
   System.out.println("Its even");
   }

  else {

   System.out.println("Its ODD");

}

}

}