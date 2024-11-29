// Made by Carlos Cruz
public class WaterRefillingStation{
    private int gallon;
    private double price;
    private String stationName;
    private int orderQuantity;
    private double totalAmount;
    private Date orderDate;
    private Customer customer;
    private Staff staff;

    public WaterRefillingStation(int gallon, double price, String stationName, int orderQuantity, double totalAmount, Date orderDate, Customer customer, Staff staff){
        this.gallon = gallon;
        this.price = price;
        this.stationName = stationName;
        this.orderQuantity = orderQuantity;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.customer = customer;
        this.staff = staff;
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
    
    public Customer getCustomer(){
      return this.customer;
    }
    
    public Staff getStaff(){
      return this.staff;
    }

    public void createOrder(String ) {
        
    }

    public double calculateTotalAmount() {
        
        return totalAmount;
    }

    public void displayDeliveryStatus() {
        
    }
}