package source;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Admin extends Staff {
private final String AdminFileName = "Admin.txt";  
 public static ArrayList<Admin> Admins = new ArrayList<Admin>();

    public Admin() {
       
    }

    public Admin(int id, String userName, String pass, String fname, String lname, int age, double salary) {
        super(id, userName, pass, fname, lname, age, salary);
    }
    
    
    private String getAdminData() {
        return this.id + "-" + this.userName + "-" + this.pass + "-" + this.fname + "-" + this.lname + "-" + this.age + "-" + this.salary;
    }
    
    private void commitToFile() {
        FManager.write(Admins.get(0).getAdminData(), AdminFileName, false);
        for (int i = 1; i < Admins.size(); i++) {
            FManager.write(Admins.get(i).getAdminData(), AdminFileName, true);
        }

    }
     private void loadFromFile() throws ParseException {
        Admins = (ArrayList<Admin>) (Object) FManager.read(AdminFileName);
    }
     private int getAdminIndex(String username){
        for (int i = 0; i < Admins.size(); i++)
            if(Admins.get(i).getUserName().equals(username))
                return i;

        return -1;
    }
     
     public Admin searchAdmin(String username) throws ParseException{
        loadFromFile();
        int index = getAdminIndex(username);
        if(index != -1)
            return  Admins.get(index);
        else
            return null;
    }
      public boolean updateAdmin(String username, Admin x) throws ParseException{
        loadFromFile();
        int index = getAdminIndex(username);
        Admins.set(index, x);
        commitToFile();
        return true;
    }

    


    public void addNewMarketingEmp(int id, String userName, String pass, String fname, String lname, int age, double salary) {
        MarketingEmployee x = new MarketingEmployee(id,userName,pass,fname,lname,age,salary);
        if(x.addMarketingEmp()) {
            System.out.println((x) + "Added Successfully...!");
        } else {
            System.out.println("Failed to insert ...!");
        }
    }
    public void searchForMarketingEmp(int id) {
        MarketingEmployee x = new MarketingEmployee();
        try {
            System.out.println(x.searchMarketing(id));
        } catch (ParseException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void displayMarketing() {
        MarketingEmployee x = new MarketingEmployee();
        try {
            System.out.println(x.displayAllMarketing());
        } catch (ParseException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void updateMarketing(int oldID, MarketingEmployee newMarketingValues) throws IOException {
        MarketingEmployee x = new MarketingEmployee();
        try {
            x.updateMarketing(oldID, newMarketingValues);
        } catch (ParseException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Updated Successfully...!");
    }

    public void deleteMarketing(int Id) throws IOException {
        MarketingEmployee x = new MarketingEmployee();
        try {
            x.deleteMarketing(Id);
        } catch (ParseException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Deleted Successfully...!");
    }

    public void addNewInventoryEmp(int id, String userName, String pass, String fname, String lname, int age, double salary) {
        InventoryEmployee x = new InventoryEmployee(id,userName,pass,fname,lname,age,salary);
        if(x.addInventoryEmp()) {
            System.out.println((x) + "Added Successfully...!");
        } else {
            System.out.println("Failed to insert ...!");
        }
    }
    public void searchForInventoryEmp(int id) {
        InventoryEmployee x = new InventoryEmployee();
        System.out.println(x.searchInventory(id));
    }

    public void displayInventory() {
        InventoryEmployee x = new InventoryEmployee();
        System.out.println(x.displayAllInventory());
    }


    public void updateInventory(int oldID, InventoryEmployee newInventoryValues) throws IOException {
        InventoryEmployee x = new InventoryEmployee();
        x.updateInventory(oldID, newInventoryValues);
        System.out.println("Updated Successfully...!");
    }

    public void deleteInventory(int Id) throws IOException {
        InventoryEmployee x = new InventoryEmployee();
        x.deleteInventory(Id);
        System.out.println("Deleted Successfully...!");
    }




}
