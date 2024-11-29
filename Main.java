public class Main{
    public static void main(String[] args){
       MenuFinalProject fp = new MenuFinalProject();
       Date date = new Date(29, 11, 2024);

       String name = fp.getSaveNameText();
       String address = fp.getSaveAddressText();
       int contactNo = fp.getChangeContactNoText();

       int gallon = fp.getChangeSaveQuantityText();
       double price = fp.getSavePriceText();
       int quantity = fp.getChangeSaveQuantityText();

       String type = fp.getGivenText();

       Staff staff = new Staff("Kiervy", "Hernani", "Delivery Man");

       WaterRefillingStation wrs = new WaterRefillingStation(gallon, price, "Water Refilling System: Refill and Go", quantity, date);

       double total = wrs.calculateTotalAmount(price, quantity);
    
       Customer customer = new Customer(name, address, contactNo, date);

       wrs.createOrder(name, address, contactNo, date, type, total);
    }
 }
