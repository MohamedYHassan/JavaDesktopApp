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
public class Report {
    private final String ReportsFileName = "Reports.txt";
    public static ArrayList<Report> Reports = new ArrayList<Report>();
    protected int reportID;
    protected int productID;
    protected int marketingID;
    protected String report;
    FileManage FManager = new FileManage();
    
    public Report() {
        
    }
    
    public Report(int reportID, int productID,int marketingID, String report) {
        this.reportID = reportID;
        this.productID = productID;
        this.marketingID = marketingID;
        this.report = report;
    }
    
    public int getReportID() {
        return this.reportID;
    }
    
    public int getProductID() {
        return this.productID;
    }
    
    public int getMarketingID() {
        return this.marketingID;
    }
    
    public String getReport() {
        return this.report;
    }
    
    public void setReportID(int reportID) {
        this.reportID = reportID;
    }
    
    public void setProductID(int productID) {
        this.productID = productID;
    }
    
    public void setMarketingID(int marketingID) {
        this.marketingID = marketingID;
    }
    
    public void setReport(String report) {
        this.report = report;
    }
    
    public boolean addReport() {
        if (FManager.write(getReportsData(), ReportsFileName, true)) {
            return true;
        } else {
            return false;
        }
    }
    
     private String getReportsData() {
        return this.reportID + "-" + this.productID + "-" + this.marketingID + "-" + this.report;
    }
     
      private void commitToFile() {
          if(Reports.isEmpty()) {
              try {
                  new FileWriter(ReportsFileName, false).close();
              } catch (IOException ex) {
                  Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
              }
          } else {
        FManager.write(Reports.get(0).getReportsData(), ReportsFileName, false);
        for (int i = 1; i < Reports.size(); i++) {
            FManager.write(Reports.get(i).getReportsData(), ReportsFileName, true);
        }
          }
    }
      
       private void loadFromFile()  {
        
        try {
            Reports = (ArrayList<Report>) (Object) FManager.read(ReportsFileName);
        } catch (ParseException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        } 
       
       private int getReportIndex(int id){
        for (int i = 0; i < Reports.size(); i++)
            if(Reports.get(i).getReportID() == id)
                return i;

        return -1;
    }
       
       public Report searchReports(int id){
        loadFromFile();
        int index = getReportIndex(id);
        if(index != -1)
            return  Reports.get(index);
        else
            return null;
    }
       
       
        public ArrayList<Report> listReports() {
        loadFromFile();
        return Reports;
    }
       
       

    
    
}
