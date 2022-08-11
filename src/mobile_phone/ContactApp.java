package mobile_phone;

import java.util.ArrayList;
import java.util.List;

public class ContactApp {
   public static void main(String[] args) {

      Contact bob = new Contact("Bob", "1234");
      Contact john = new Contact("John", "2345");
      Contact pat = new Contact("Pat", "3456");
      Contact tom = new Contact("Tom", "4567");

      MobilePhone mobilePhone = new MobilePhone(List.of(bob, john, pat, tom),"23456");

      mobilePhone.printContact(bob);
      mobilePhone.findContact("John");
      mobilePhone.queryContact("Tom");
      mobilePhone.updateContact(john,new Contact("mary","0000"));
      mobilePhone.findContact("John");
      mobilePhone.queryContact("mary");

   }
}
