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
import static source.Order.Orders;

/**
 *
 * @author Mohamed Yousef
 */
public class Offer {
    private final String OffersFileName = "Offers.txt";
    public static ArrayList<Offer> Offers = new ArrayList<Offer>();
    
    protected int offerID;
    protected int productID;
    protected String offer;
    FileManage FManager = new FileManage();
    
    public Offer() {
        
    }
    
    public Offer(int offerID, int productID, String offer) {
        this.offerID = offerID;
        this.productID = productID;
        this.offer = offer;
    }
    
    public int getOfferID() {
        return this.offerID;
    }
    
    public String getOffer() {
        return this.offer;
    }
    
    public int getProductID() {
        return this.productID;
    }
    
    public void setOfferID(int offerID) {
        this.offerID = offerID;
        
    }
    
    public void setProductID(int productID) {
        this.productID = productID;
    }
    
    public void setOffer(String offer) {
        this.offer = offer;
    }
    
     private String getOffersData() {
        return this.offerID + "-" + this.productID + "-" + this.offer;
    }
     
         public boolean addOffer() {
        if (FManager.write(getOffersData(), OffersFileName, true)) {
            return true;
        } else {
            return false;
        }
    }
         
         private void commitToFile() {
             if(Offers.isEmpty()) {
                 try {
                     new FileWriter(OffersFileName, false).close();
                 } catch (IOException ex) {
                     Logger.getLogger(Offer.class.getName()).log(Level.SEVERE, null, ex);
                 }
             } else {
        FManager.write(Offers.get(0).getOffersData(), OffersFileName, false);
        for (int i = 1; i < Offers.size(); i++) {
            FManager.write(Offers.get(i).getOffersData(), OffersFileName, true);
        }
             }
    }
         
         private void loadFromFile()  {
        
        try {
            Offers = (ArrayList<Offer>) (Object) FManager.read(OffersFileName);
        } catch (ParseException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
        } 
         
          private int getOffersIndex(int id){
        for (int i = 0; i < Offers.size(); i++)
            if(Offers.get(i).getOfferID() == id)
                return i;

        return -1;
    }
          
           public ArrayList<Offer> listOffers() {
        loadFromFile();
        return Offers;
    }
           
           public boolean deleteOffers(int id){
        loadFromFile();
        int index = getOffersIndex(id);
        Offers.remove(index);
        commitToFile();
        return true;
    }

    
}
