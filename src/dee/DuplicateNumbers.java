package dee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumbers {
   public static void main(String[] args){
      int[] arr={1,2,4,2,4,3,3};
      getDuplicateNumber(arr);
   }
   // function to print duplicate numbers using For-loop
   static void getDuplicateNumber(int[] arr){
      ArrayList<Integer> duplicateNumbers=new ArrayList<>();
      for(int i=0;i< arr.length-1; i++){
//         System.out.println("Print i: "+ i);
         for (int j=i+1;j<arr.length;j++){
            if (arr[i]==arr[j]){
               System.out.println("Printing ");
               System.out.println("I got you!  "+ arr[i]);
               duplicateNumbers.add(arr[i]);
            }
         }
      }
      System.out.println(List.of(duplicateNumbers));       // using List.of() to print duplicate character
      System.out.println(Arrays.asList(duplicateNumbers));
      for (int i:duplicateNumbers){
         System.out.print("  "+ i);
      }
      System.out.println();
      System.out.println("You got "+ duplicateNumbers.size()+ " duplicate numbers.");
   }
}

