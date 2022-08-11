package interview_practice_programs;

import java.util.Scanner;

public class SwapNumbers {

   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the value of x");
      int x = sc.nextInt();
      System.out.println("Enter the value of y");
      int y = sc.nextInt();

      System.out.println("before swapping: "+ "x = "+ x+ " and y= "+ y);

      x = x + y;
      y = x - y;
      x = x - y;

      System.out.println("after swapping: "+ "x = "+ x+ " and y= "+ y);
   }
}
