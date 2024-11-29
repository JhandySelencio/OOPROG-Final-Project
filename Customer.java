// Made by Raymond Sotelo

public class Customer{
   private String name;
   private String address;
   private int contactNumber;
   private Date date;
   
   public Customer(String name, String address, int contactNumber, Date date){
      this.name = name;
      this.address = address;
      this.contactNumber = contactNumber;
      this.date = date;
   }
   
   public String getName(){
      return this.name;
   }
   
   public String getAddress(){
      return this.address;
   }
   
   public int getContactNumber(){
      return this.contactNumber;
   }
   
   public Date getDate(){
      return this.date;
   }
   
   public void displayCustomerInfo(){
      System.out.println("Name: " + this.name);
      System.out.println("Address: " + this.address);
      System.out.println("Contact Number: " + this.contactNumber);     
   }
}