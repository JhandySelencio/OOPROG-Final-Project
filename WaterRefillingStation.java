// Made by Carlos Cruz
public class WaterRefillingStation{
    private int gallon;
    private double price;
    private String stationName;
    private int orderQuantity;
    private double totalAmount;
    private Date orderDate;

    public int getGallon() {
        return gallon;
    }
    
    public void setGallon(int gallon) {
        this.gallon = gallon;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    public String getStationName() {
        return stationName;
    }
    
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }
    
    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
    
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getOrderDate() {
        return orderDate;
    }  
    
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    } 

    public String createOrder(String name, String address, int contactNo, Date orderDate, String type, double total, int gallon, int orderQuantity){
        return "RECEIPT" +
               "\nName: " + name +
               "\nAddress: " + address +
               "\nContact Number: " + contactNo +
               "\nGallon: " + gallon +
               "\nOrder placed: " + orderDate.display() + 
               "\nType: " + type +
               "\nOrder Quantity: " + orderQuantity +
               "\nTotal Amount: P" + total + "0";
    }

    public double calculateTotalAmount(double price, int quantity) {
        this.totalAmount = price * quantity;
        return this.totalAmount;
    }

    public String displayDeliveryStatus(String staffFirstName, String staffLastName, String position, String address, String stationName){
        return "Your gallon will be delivered by " + position + ", " + staffFirstName + " " + staffLastName + " within this day to " + address + "." +
               "\nThank you for placing your order in " + stationName + ". Have a nice day!";
    }
}
