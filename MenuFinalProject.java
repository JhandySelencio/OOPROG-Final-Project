// Made by Jhandy Selencio

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuFinalProject extends JFrame implements ActionListener{
   
   //Variables
   private String displayReceipt;
   private String givenText;
   private String saveNameText;
   private String saveAddressText;
   private String saveContactNoText;
   private int changeContactNoText;
   
   private String saveTypeText;
   private double savePriceText;
   private String saveQuantityText;
   private char changeSaveTypeText;
   private double changeSavePriceText;
   private int changeSaveQuantityText;
   
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
   JTextField nameText;
   JTextField addressText;
   JTextField contactNoText;
   JButton proceedBTN;
   
   //Get Order GUI
   JLabel type;
   JLabel price;
   JLabel quantity;
   JLabel orderPlaced;
   JTextField typeText;
   JTextField priceText;
   JTextField quantityText;
   JButton submitBTN;
      
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
      
      nameText = new JTextField();
      nameText.setBounds(130, 55, 248, 25);
      nameText.addActionListener(this);
      nameText.setVisible(false);
      
      addressText = new JTextField();
      addressText.setBounds(130, 105, 248, 25);
      addressText.addActionListener(this);
      addressText.setVisible(false);
      
      contactNoText = new JTextField();
      contactNoText.setBounds(130, 155, 248, 25);
      contactNoText.addActionListener(this);
      contactNoText.setVisible(false);
      
      proceedBTN = new JButton("Proceed");
      proceedBTN.setBounds(140, 205, 150, 30);
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
      
      typeText = new JTextField("Type (A) for Walk-in, (B) for Delivery");
      typeText.setFont(new Font("Tahoma", Font.PLAIN, 14));
      typeText.setForeground(new Color(0x000000));
      typeText.addActionListener(this);
      typeText.setBounds(110, 55, 248, 25);
      typeText.setVisible(false);
      
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
      
      //Variables
      this.displayReceipt = displayReceipt;
           
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
      
      //Order GUI
      panel.add(type);
      panel.add(price);
      panel.add(quantity);
      panel.add(typeText);
      panel.add(priceText);
      panel.add(quantityText);
      panel.add(submitBTN);
      
      //Reciept GUI
      

      //Set frame visibile       
      this.setVisible(true);
   }
    
   @Override
   public void actionPerformed(ActionEvent e){
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
      } else if(e.getSource()==nameText){ //Stores the user input
         this.saveNameText = nameText.getText();
         setSaveNameText(this.saveNameText);
      } else if(e.getSource()==addressText){
         this.saveAddressText = addressText.getText();
         setSaveAddressText(this.saveAddressText);
      } else if(e.getSource()==contactNoText){
         saveContactNoText = contactNoText.getText();
         this.changeContactNoText = Integer.parseInt(saveContactNoText);
         setChangeContactNoText(this.changeContactNoText);
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
         //ON
         type.setVisible(true);
         price.setVisible(true);
         quantity.setVisible(true);
         typeText.setVisible(true);
         priceText.setVisible(true);
         quantityText.setVisible(true);
         submitBTN.setVisible(true);   
      } else if(e.getSource()==typeText){ //Stores the user input 2
         saveTypeText = typeText.getText();
         this.changeSaveTypeText = saveTypeText.charAt(0);
         setChangeSaveTypeText(this.changeSaveTypeText);
         if(this.changeSaveTypeText == 'A'){
            priceText.setText("P25.00");
            this.savePriceText = 25;
            setSavePriceText(savePriceText);
            setGivenText("Walk-In");
         } else if(this.changeSaveTypeText == 'B'){
            priceText.setText("P35.00");
            this.savePriceText = 35;
            setSavePriceText(savePriceText);
            setGivenText("Delivery");
         } else if(this.changeSaveTypeText != 'A' || this.changeSaveTypeText != 'B'){
            typeText.setText("Invalid option, please enter A or B only");
         }
      } else if(e.getSource()==quantityText){
         saveQuantityText = contactNoText.getText();
         this.changeSaveQuantityText = Integer.parseInt(saveQuantityText);
         setChangeSaveQuantityText(this.changeSaveQuantityText);
      } else if(e.getSource()==submitBTN){
         JOptionPane.showMessageDialog(null, "Name + " getSaveNameText() + "\nAddress: " + );
      }
   }

   public String getSaveNameText(){
      return this.saveNameText;
   }
   public void setSaveNameText(String saveNameText){
      this.saveNameText = saveNameText;
   }
   //
   public String getSaveAddressText(){
      return this.saveAddressText;
   }
   public void setSaveAddressText(String saveAddressText){
      this.saveAddressText = saveAddressText;
   }
   //
   public int getChangeContactNoText(){
      return this.changeContactNoText;
   }
   public void setChangeContactNoText(int changeContactNoText){
      this.changeContactNoText = changeContactNoText;
   }
   //
   public char getChangeSaveTypeText(){
      return changeSaveTypeText;
   }
   public void setChangeSaveTypeText(char changeSaveTypeText){
      this.changeSaveTypeText = changeSaveTypeText;
   }
   //  
   public double getSavePriceText(){
      return savePriceText;
   }
   public void setSavePriceText(double savePriceText){
      this.savePriceText = savePriceText;
   }
   //
   public int getChangeSaveQuantityText(){
      return this.changeSaveQuantityText;
   }
   public void setChangeSaveQuantityText(int changeSaveQuantityText){
      this.changeSaveQuantityText = changeSaveQuantityText;
   }
   //
   public String getDisplayReceipt(){
      return displayReceipt;
   }
   public void setDisplayReceipt(String displayReceipt){
      this.displayReceipt = displayReceipt;
   }
   //
    public String getGivenText(){
        return displayReceipt;
    }
    public void setGivenText(String givenText){
        this.givenText = givenText;
    }
   
   public void displayReceipt(String display){
      JOptionPane.showMessageDialog(null, display);
   }
}
