package dee;

public class DistanceBtwTwoPoints {
   public static void main(String[] args) {
      distanceBetweenPoints(1,3,3,9);

   }

   static void distanceBetweenPoints(int x1, int x2, int y1, int y2){
      int x=x2-x1;
      int y= y2-y1;
       double distance= Math.sqrt((x*x)+(y*y));
      System.out.println("Distance between to points: "+ distance);

   }
}
