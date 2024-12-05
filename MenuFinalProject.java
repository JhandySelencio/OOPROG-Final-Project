// Made by Jhandy Selencio

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuFinalProject extends JFrame implements ActionListener{  
   private String displayText;
   private String displayName;
   private String displayAddress;
   private int displayContactNo;
   private String displayWaterType;

   private int displayGallon;
   private double displayPrice;
   private int displayQuantity;
   private double displayTotal;
   private String staffFirstName;
   private String staffLastName;
   
   //Welcome GUI
   JLabel welcomeSign1;
   JLabel welcomeSign2;
   JButton startBTN;
   
   //Get Started GUI
   JPanel panel;
   JLabel sign;
   JLabel name;
   JLabel address;
   JLabel contactNo;
   JLabel waterType;
   JTextField nameText;
      JTextField addressText;
   JTextField contactNoText;
   JComboBox<String> comboBox;
   JRadioButton option1;
   JRadioButton option2;
   JButton proceedBTN;
   
   //Get Order GUI
   JLabel type;
   JLabel price;
   JLabel quantity;
   JLabel orderPlaced;
   JTextField priceText;
   JTextField quantityText;
   JButton submitBTN;
   
   //Get Receipt GUI
      
   public MenuFinalProject(){
      
      //Welcome GUI
      welcomeSign1 = new JLabel("Welcome to Water Refilling");
      welcomeSign1.setFont(new Font("Arial", Font.BOLD, 42));
      welcomeSign1.setForeground(new Color(0x000075));
      welcomeSign1.setBounds(23, 70, 550, 100);
      welcomeSign1.setVisible(true);
      
      welcomeSign2 = new JLabel("System: Refill and Go");
      welcomeSign2.setFont(new Font("Arial", Font.BOLD, 35));
      welcomeSign2.setForeground(new Color(0x000075));
      welcomeSign2.setBounds(90, 120, 550, 100);
      welcomeSign2.setVisible(true);
      
      startBTN = new JButton("Get Started");
      startBTN.setBounds(190, 230, 170, 30);
      startBTN.setFont(new Font("Arial", Font.BOLD, 18));
      startBTN.setForeground(new Color(0x000075));
      startBTN.addActionListener(this);
      startBTN.setFocusable(false);
      startBTN.setVisible(true);
      
      //Get Started GUI
      panel = new JPanel();
      panel.setBounds(80, 40, 500, 300);
      panel.setBackground(Color.decode("#addbeb"));
      panel.setLayout(null);
      panel.setVisible(false);
      
      sign = new JLabel("Please enter the following details below:");
      sign.setFont(new Font("Arial", Font.BOLD, 18));
      sign.setForeground(new Color(0x000075));
      sign.setBounds(20, 20, 830, 20);
      sign.setVisible(false);
      
      name = new JLabel("Name");
      name.setFont(new Font("Arial", Font.PLAIN, 18));
      name.setForeground(new Color(0x000075));
      name.setBounds(20, 50, 150, 30);
      name.setVisible(false);
      
      orderPlaced = new JLabel("Order Placed: ");
      orderPlaced.setFont(new Font("Arial", Font.PLAIN, 18));
      orderPlaced.setForeground(new Color(0x000075));
      orderPlaced.setBounds(20, 100, 150, 30);
      orderPlaced.setVisible(false);

      address = new JLabel("Address");
      address.setFont(new Font("Arial", Font.PLAIN, 18));
      address.setForeground(new Color(0x000075));
      address.setBounds(20, 100, 150, 30);
      address.setVisible(false);
      
      contactNo = new JLabel("Contact No.");
      contactNo.setFont(new Font("Arial", Font.PLAIN, 18));
      contactNo.setForeground(new Color(0x000075));
      contactNo.setBounds(20, 150, 150, 30);
      contactNo.setVisible(false);
      
      waterType = new JLabel("Type of Water");
      waterType.setFont(new Font("Arial", Font.PLAIN, 18));
      waterType.setForeground(new Color(0x000075));
      waterType.setBounds(20, 200, 248, 25);
      waterType.setVisible(false);
      
      nameText = new JTextField();
      nameText.setBounds(130, 55, 248, 30);
      nameText.addActionListener(this);
      nameText.setVisible(false);
      
      addressText = new JTextField();
      addressText.setBounds(130, 105, 248, 30);
      addressText.addActionListener(this);
      addressText.setVisible(false);
      
      contactNoText = new JTextField();
      contactNoText.setBounds(130, 155, 248, 25);
      contactNoText.addActionListener(this);
      contactNoText.setVisible(false);
      
      option1 = new JRadioButton("Mineral");
      option1.addActionListener(this);
      option1.setBounds(180, 205, 100, 25);
      option1.setContentAreaFilled(false);
      option1.setVisible(false);
      
      option2 = new JRadioButton("Alkaline");
      option2.addActionListener(this);
      option2.setContentAreaFilled(false);
      option2.setBounds(260, 205, 100, 25);
      option2.setVisible(false);
      
      ButtonGroup group = new ButtonGroup();
      group.add(option1);
      group.add(option2);
      
      proceedBTN = new JButton("Proceed");
      proceedBTN.setBounds(140, 255, 150, 30);
      proceedBTN.setForeground(new Color(0x000075));
      proceedBTN.setFont(new Font("Arial", Font.BOLD, 18));
      proceedBTN.addActionListener(this);
      proceedBTN.setFocusable(false);
      proceedBTN.setVisible(false);
      
      //Order GUI
      type = new JLabel("Type");
      type.setFont(new Font("Arial", Font.PLAIN, 18));
      type.setForeground(new Color(0x000075));
      type.setBounds(0, 50, 150, 30);
      type.setVisible(false);
      
      price = new JLabel("Price");
      price.setFont(new Font("Arial", Font.PLAIN, 18));
      price.setForeground(new Color(0x000075));
      price.setBounds(0, 100, 150, 30);
      price.setVisible(false);
      
      quantity = new JLabel("Quantity");
      quantity.setFont(new Font("Arial", Font.PLAIN, 18));
      quantity.setForeground(new Color(0x000075));
      quantity.setBounds(0, 150, 150, 30);
      quantity.setVisible(false);
      
      String[] typeText ={"Walk-in","Delivery"};
      comboBox = new JComboBox<>(typeText);
      comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
      comboBox.setForeground(new Color(0x000000));
      comboBox.addActionListener(this);
      comboBox.setBounds(110, 55, 248, 25);
      comboBox.setVisible(false);
      
      priceText = new JTextField();
      priceText.setBounds(110, 105, 248, 25);
      priceText.addActionListener(this);
      priceText.setEditable(false);
      priceText.setVisible(false);
      
      quantityText = new JTextField();
      quantityText.setBounds(110, 155, 248, 25);
      quantityText.addActionListener(this);
      quantityText.setVisible(false);
      
      submitBTN = new JButton("Submit");
      submitBTN.setBounds(140, 205, 150, 30);
      submitBTN.setForeground(new Color(0x000075));
      submitBTN.setFont(new Font("Arial", Font.BOLD, 18));
      submitBTN.addActionListener(this);
      submitBTN.setFocusable(false);
      submitBTN.setVisible(false);
               
      //Main Frame
      this.setTitle("Water Refilling System: Refill and Go");
      this.setSize(600, 400);
      this.setLayout(null);
      this.setResizable(false);
      this.getContentPane().setBackground(Color.decode("#addbeb"));
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //Welcome GUI
      this.add(welcomeSign1);
      this.add(welcomeSign2);
      this.add(startBTN);
      
      //Get Started GUI
      this.add(panel);
      panel.add(sign);
      panel.add(name);
      panel.add(address);
      panel.add(contactNo);
      panel.add(nameText);
      panel.add(addressText);
      panel.add(contactNoText);
      panel.add(proceedBTN);
      panel.add(waterType);
      panel.add(option1);
      panel.add(option2);
      
      //Order GUI
      panel.add(type);
      panel.add(price);
      panel.add(quantity);
      panel.add(comboBox);
      panel.add(priceText);
      panel.add(quantityText);
      panel.add(submitBTN);
      
      //Reciept GUI
      

      //Set frame visibile       
      this.setVisible(true);
   }
    
   @Override
   public void actionPerformed(ActionEvent e){
      
      Date orderPlace = new Date(30, 11, 2024); //Change this
      Customer customer = new Customer();
      WaterRefillingStation wrs = new WaterRefillingStation();
         
      int random = (int) (Math.random()*5);
      switch(random){
         case 1:
            setFirstName("Jhandy");
            setLastName("Selencio");
            break;
         case 2:
            setFirstName("Raymond");
            setLastName("Sotelo");
            break;
         case 3:
            setFirstName("Edrian");
            setLastName("Samante");
            break;
         case 4:
            setFirstName("Carlo");
            setLastName("Cruz");
            break;
         case 5:
            setFirstName("Kiervy");
            setLastName("Hernani");
            break;
      }
      
      Staff staff = new Staff(getFirstName(), getLastName(), "Delivery Man");
      
      customer.setDate(orderPlace);
      
      //Variables
      char setTypeText;
          
      if(e.getSource()==startBTN){
         //Set Visibility
         //OFF
         welcomeSign1.setVisible(false);
         welcomeSign2.setVisible(false);
         startBTN.setVisible(false);
         //ON
         panel.setVisible(true);
         sign.setVisible(true);
         name.setVisible(true);
         address.setVisible(true);
         contactNo.setVisible(true);
         nameText.setVisible(true);
         addressText.setVisible(true);
         contactNoText.setVisible(true);
         proceedBTN.setVisible(true);
         waterType.setVisible(true);
         option1.setVisible(true);
         option2.setVisible(true);
      } else if(e.getSource()==nameText){ //Stores the user input
         setDisplayName(nameText.getText());
         customer.setName(getDisplayName());
         System.out.println("Name: " + customer.getName());
      } else if(e.getSource()==addressText){
         setDisplayAddress(addressText.getText());
         customer.setAddress(getDisplayAddress());
         System.out.println("Address: " + customer.getAddress());
      } else if(e.getSource()==contactNoText){
         try{
            setDisplayContactNo(Integer.parseInt(contactNoText.getText()));
            customer.setContactNumber(getDisplayContactNo());
         }
         catch(NumberFormatException a){
            JOptionPane.showMessageDialog(null, "Please enter numbers only.");
         }
         setDisplayContactNo(Integer.parseInt(contactNoText.getText()));
         customer.setContactNumber(getDisplayContactNo());
         System.out.println("Contact Number: " + customer.getContactNumber());
      } else if(e.getSource()==option1){
         setWaterType("Mineral Water");
         System.out.println("Type of Water: " + getWaterType());
      } else if(e.getSource()==option2){
         setWaterType("Alkaline WaTer");   
         System.out.println("Type of Water: " + getWaterType()); 
      } else if(e.getSource()==proceedBTN){
         //Set Visibility
         //OFF
         sign.setText("Please enter the following order details below:");
         sign.setBounds(0, 10, 800, 20);
         name.setVisible(false);
         address.setVisible(false);
         contactNo.setVisible(false);
         nameText.setVisible(false);
         addressText.setVisible(false);
         contactNoText.setVisible(false);
         proceedBTN.setVisible(false);
         waterType.setVisible(false);
         option1.setVisible(false);
         option2.setVisible(false);
         //ON
         type.setVisible(true);
         price.setVisible(true);
         quantity.setVisible(true);
         comboBox.setVisible(true);
         priceText.setVisible(true);
         quantityText.setVisible(true);
         submitBTN.setVisible(true);   
      } else if(e.getSource()==comboBox){ //Stores the user input 2
         String selectOption = (String)comboBox.getSelectedItem();
         if(selectOption == "Walk-in"){
            priceText.setText("P25.00");
            setDisplayPrice(25);
            wrs.setPrice(getDisplayPrice());
            setDisplayType("Walk-In");
            System.out.println("Price: " + getDisplayPrice());
            System.out.println("Type: " + getDisplayType());
         } else if(selectOption == "Delivery"){
            priceText.setText("P35.00");
            setDisplayPrice(35);
            wrs.setPrice(getDisplayPrice());
            setDisplayType("Delivery");
            System.out.println("Price: " + getDisplayPrice());
            System.out.println("Type: " + getDisplayType());
         }
      } else if(e.getSource()==quantityText){
         try{
            setDisplayGallon(Integer.parseInt(quantityText.getText()));
            wrs.setGallon(getDisplayGallon());
            setDisplayQuantity(Integer.parseInt(quantityText.getText()));
            wrs.setOrderQuantity(getDisplayGallon());
            System.out.println("Quantity: " + wrs.getOrderQuantity());
         }
         catch(NumberFormatException a){
             JOptionPane.showMessageDialog(null, "Please enter numbers only.");
         }
         System.out.println("Price: " + getDisplayPrice() + "\nQuantity: " + getDisplayQuantity() + "\nResult: " + getDisplayPrice()*getDisplayQuantity());
         setDisplayTotal(wrs.calculateTotalAmount(getDisplayPrice(), getDisplayQuantity()));
         wrs.setTotalAmount(getDisplayTotal());
           
         
      } else if(e.getSource()==submitBTN){
         JOptionPane.showMessageDialog(null, wrs.createOrder(getDisplayName(),
                                                             getDisplayAddress(),
                                                             getDisplayContactNo(),
                                                             customer.getDate(),
                                                             getDisplayType(),
                                                             getDisplayPrice()*getDisplayQuantity(),
                                                             getDisplayGallon(),
                                                             getDisplayQuantity()));
         JOptionPane.showMessageDialog(null, wrs.displayDeliveryStatus(staff.getFirstName(), staff.getLastName(), 
                                             staff.getPosition(), getDisplayAddress(), "Refill and Go: Water Refilling Station"));
      }
   }
   
   public String getDisplayType(){
         return displayText;
   }   
   public void setDisplayType(String displayText){
         this.displayText = displayText;
   }
   
   public String getDisplayName(){
      return displayName;
   }
   public void setDisplayName(String displayName){
      this.displayName = displayName;
   }
   
   public String getDisplayAddress(){
      return displayAddress;
   }
   public void setDisplayAddress(String displayAddress){
      this.displayAddress = displayAddress;
   }
   
   public int getDisplayContactNo(){
      return displayContactNo;
   }
   public void setDisplayContactNo(int displayContactNo){
      this.displayContactNo = displayContactNo;
   }
   
   public int getDisplayGallon(){
      return displayGallon;
   }
   public void setDisplayGallon(int displayGallon){
      this.displayGallon = displayGallon;
   }
   
   public double getDisplayPrice(){
      return displayPrice;
   }
   public void setDisplayPrice(double displayPrice){
      this.displayPrice = displayPrice;
   }
   
   public int getDisplayQuantity(){
      return displayQuantity;
   }
   public void setDisplayQuantity(int displayQuantity){
      this.displayQuantity = displayQuantity;
   }
   
   public double getDisplayTotal(){
      return displayQuantity;
   }
   public void setDisplayTotal(double displayTotal){
      this.displayTotal = displayTotal;
   }
   
   public String getFirstName(){
      return staffFirstName;
   }
   public void setFirstName(String staffFirstName){
      this.staffFirstName = staffFirstName;
   }
   
   public String getLastName(){
      return staffLastName;
   }
   public void setLastName(String staffLastName){
      this.staffLastName = staffLastName;
   }
   
   public String getWaterType(){
      return displayWaterType;
   }
   
   public void setWaterType(String displayWaterType){
      this.displayWaterType = displayWaterType;
   }
}
