/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package source;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Mohamed Yousef
 */
public class Order {
    private final String OrdersFileName = "Orders.txt";
    public static ArrayList<Order> Orders = new ArrayList<Order>();
    public static ArrayList<Order> Cancelled = new ArrayList<Order>();
    protected int orderID;
    protected int productID;
    protected int quantity;
   
    FileManage FManager = new FileManage();
   
    
    public Order() {
    }
    
    public Order(int orderID,int productID, int quantity ){
        this.orderID = orderID;
        this.productID= productID;
        this.quantity = quantity;
    }
    
    public int getOrderID() {
        return this.orderID;
    }
    
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    
    public int getProductID() {
        return this.productID;
    }
    
    public void setProductID(int productID) {
        this.productID = productID;
    }
   
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public double getTotalPrice() {
        Products products = new Products();
        Products returned = products.searchProducts(this.productID);
        return returned.getPrice() * this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    private String getOrdersData() {
        return this.orderID + "-" + this.productID + "-" + this.quantity;
    }
     
         public boolean addOrder() {
        if (FManager.write(getOrdersData(), OrdersFileName, true)) {
            return true;
        } else {
            return false;
        }
    }
         
         private void commitToFile() throws IOException {
         if(Orders.isEmpty()) {
             new FileWriter(OrdersFileName, false).close();
         } else {
        FManager.write(Orders.get(0).getOrdersData(), OrdersFileName, false);
        for (int i = 1; i < Orders.size(); i++) {
            FManager.write(Orders.get(i).getOrdersData(), OrdersFileName, true);
        }
         }

    }
         
          private void commitToReturnFile() throws IOException {
         
        FManager.write(Cancelled.get(0).getOrdersData(), "Returns.txt", false);
        for (int i = 1; i < Cancelled.size(); i++) {
            FManager.write(Cancelled.get(i).getOrdersData(), "Returns.txt", true);
        }
         

    }
         
         private void loadFromFile()  {
        
        
        try {
            Orders = (ArrayList<Order>) (Object) FManager.read(OrdersFileName);
        } catch (ParseException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        } 
          private void loadFromReturnsFile() throws ParseException  {
        
        
        
            Cancelled = (ArrayList<Order>) (Object) FManager.read("Returns.txt");
        
        
        } 
         
          private int getOrdersIndex(int id){
        for (int i = 0; i < Orders.size(); i++)
            if(Orders.get(i).getOrderID() == id)
                return i;

        return -1;
    }
           public Order searchOrders(int id){
        loadFromFile();
        int index = getOrdersIndex(id);
        if(index != -1)
            return  Orders.get(index);
        else
            return null;
    }
          
           public ArrayList<Order> listOrders() {
        loadFromFile();
        return Orders;
    }
           public ArrayList<Order> listCancelled() throws ParseException {
               loadFromReturnsFile();
               return Cancelled;
           }
           
           public void addReturns() {
               FManager.write(getOrdersData(), "Returns.txt", true);
           }
           
           public boolean deleteOrders(int id) throws IOException, ParseException{
        loadFromFile();
        
        int index = getOrdersIndex(id);
        Cancelled.add(Orders.get(index));
        Orders.remove(index);
        commitToFile();
        commitToReturnFile();
        return true;
    }
  
    
    
}
