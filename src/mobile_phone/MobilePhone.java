package mobile_phone;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
   List<Contact> contacts;
   String myNumber;


   public MobilePhone(List<Contact> contacts, String myNumber) {
      this.contacts = contacts;
      this.myNumber = myNumber;
   }

// methods

   boolean addNewContact(Contact contact){
      return contact==null;
   }

   boolean updateContact(Contact contact, Contact newContact){
      if (contact != null){
         contact = newContact;
         System.out.println("Updates contact -> "+ contact);
         return true;
      }
      return  false;
   }

   boolean removeContact(Contact contact){
      System.out.println("Removed and Updated Successfully");
      return contact != null;
   }


   int findContact(Contact contact){
      for (int i=0; i<contacts.size(); i++){
         if (contact.equals(contacts.get(i))){
            System.out.println("Got index value for given contact -> "+ i);
            return i;
         }
      }
      return -1;
   }

   int findContact(String name) {
      for (int i = 0; i < contacts.size(); i++) {
         if (name.equals(contacts.get(i).getName())) {
            System.out.println("Got index for given name -> " + i );
            return i;
         }
      }
      return -1;
   }

   Contact queryContact(String name){
      for (int i = 0; i < contacts.size(); i++) {
         if (name.equals(contacts.get(i).getName())) {
            System.out.println("Got Contact for given name -> "+ i + ": "+ contacts.get(i));
            return contacts.get(i);
         }
      }
      return null;
   }

   void printContact(Contact contact){
      System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
   }

}
