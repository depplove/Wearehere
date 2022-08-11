package mobile_phone;

public class Contact {
   String name, phoneNumber;
   public Contact(String name, String phoneNumber){
      this.name=name;
      this.phoneNumber=phoneNumber;
   }

   Contact createContact(String name, String phoneNumber){
      return new Contact(name,phoneNumber);
   }

   // getters
   public String getName() {
      return name;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   @Override
   public String toString() {
      return "Contact{" +
          "name='" + name + '\'' +
          ", phoneNumber='" + phoneNumber + '\'' +
          '}';
   }
}
