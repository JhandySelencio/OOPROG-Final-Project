// Made by Carlos Cruz
public class WaterRefillingStation{
    private int gallon;
    private double price;
    private String stationName;
    private int orderQuantity;
    private double totalAmount;
    private Date orderDate;

    public WaterRefillingStation(int gallon, double price, String stationName, int orderQuantity, Date orderDate){
        this.gallon = gallon;
        this.price = price;
        this.stationName = stationName;
        this.orderQuantity = orderQuantity;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
    }

    public int getGallon() {
        return this.gallon;
    }

    public double getPrice() {
        return this.price;
    }

    public String getStationName() {
        return this.stationName;
    }

    public int getOrderQuantity() {
        return this.orderQuantity;
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }

    public Date getOrderDate() {
        return this.orderDate;
    }   

    public void createOrder(String name, String address, int contactNo, Date date, String type, double total) {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNo);
        System.out.println("Order placed: " + date);
        System.out.println("Type: " + type);
        System.out.println("Total Amount: " + total);
    }

    public double calculateTotalAmount(double price, int quantity) {
        this.totalAmount = price * quantity;
        return this.totalAmount;
    }

    public void displayDeliveryStatus(String staffName, String position, String address, String stationName){
        System.out.println("Name: " + staffName);
        System.out.println("Position: " + position);
        System.out.println("Your gallon will be delivered by " + staffName + " within this day to" + address + ".");
        System.out.println("Thank your for placing your order in " + stationName + ". Have a great day!");
    }
}
