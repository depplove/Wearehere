package dee;

public class LCM {
   public static void main(String[] args){
      System.out.println("LCM of Two Numbers: "+lcmOfTwoNum(15,5));
      lcmOfNNumbers();
   }

   // LCM of two numbers
   static int lcmOfTwoNum(int num1, int num2){
      if(num1!=num2) {
         for (int i = 1; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
               return i;
            }
         }
      }
      return num1;
   }

   // LCM of N numbers

   static  void lcmOfNNumbers(){
      int[] nums={5,10,15,7};
      int lcm=nums[0];
      for(int i=1; i<nums.length; i++){
         lcm= lcmOfTwoNum(lcm,nums[i]);
      }
      System.out.println("LCM of given numbers: "+ lcm);

   }


}
