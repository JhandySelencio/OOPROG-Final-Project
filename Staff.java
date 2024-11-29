//Made by Edrian Samante
public class Staff{
   private String firstName;
   private String lastName;
   private String position;
   
   public Staff(String firstName, String lastName, String position){
      this.firstName = firstName;
      this.lastName = lastName;
      this.position = position;
   }
   
   public String getFirstName(){
      return this.firstName;
   }
   
   public String getLastName(){
      return this.lastName;
   }
   
   public String getPosition(){
      return this.position;
   }
   
   public void displayStaffInfo(){
      System.out.println("Name: " + this.firstName + ", " + this.lastName);
      System.out.println("Position: " + this.position);
   }
}