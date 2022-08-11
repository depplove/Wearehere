package vending_machine;

import java.util.Arrays;
import java.util.List;

public class ProductAndPrice {
   String coke;
   String chips;
   String mangoShake;
   String amulDoodh;

   List<String> products = Arrays.asList("coke","chips","mangoShake","amulDoodh");

   public List<String> getProducts() {
      return products;
   }

   final int COKEPRICE=40;
   final int  CHIPSPRICE=20;
   final int  MANGOSHAKEPRICE=30;
   final int  AMULDOODHPRICE=25;


   public String getCoke() {
      return coke;
   }

   public void setCoke(String coke) {
      this.coke = coke;
   }

   public String getChips() {
      return chips;
   }

   public void setChips(String chips) {
      this.chips = chips;
   }

   public String getMangoShake() {
      return mangoShake;
   }

   public void setMangoShake(String mangoShake) {
      this.mangoShake = mangoShake;
   }

   public String getAmulDoodh() {
      return amulDoodh;
   }

   public void setAmulDoodh(String amulDoodh) {
      this.amulDoodh = amulDoodh;
   }


}
