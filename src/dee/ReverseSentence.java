package dee;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseSentence {
   public static void main(String[] args) {
      String sentence="my name is Dhiren";
      reverseSentence(sentence);

      char[] character= {'a','b','c','d','c','d'};
      duplicateChar(character);
   }
   static void reverseSentence(String str){
      String[] s = str.split(" ");
      System.out.println(Arrays.toString(s));
      String[] reverse=new String[s.length];
      int j=0;
      for(int i=s.length-1;i>=0;i--){
         reverse[j++]=s[i];
      }
      System.out.println("Reverse Sentence\n"+ Arrays.toString(reverse));
   }

   static void duplicateChar(char[] charArr) {
      for (int i = 0; i < charArr.length - 1; i++) {
         for (int j = i + 1; j < charArr.length; j++) {
            if (charArr[i] == charArr[j]) {
               System.out.println("I gotch yaaaaaaa! " + charArr[i]);
            }
         }
      }
   }
}
