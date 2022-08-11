package vending_machine;

import java.util.List;
import java.util.Scanner;

public class VendingApp {
   public static void main(String[] args) {
      ProductAndPrice productAndPrice =
          new ProductAndPrice();
      List<String> products = productAndPrice.getProducts();
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter product");
      String inputProduct= scn.nextLine();
      System.out.println("Input money");
      int inputMoney= scn.nextInt();
      for(String product: products){
         if(inputProduct.equals(product)){

         }
      }

   }
}
