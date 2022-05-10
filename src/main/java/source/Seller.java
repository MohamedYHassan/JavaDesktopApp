package source;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static source.Order.Orders;

public class Seller extends Staff{
    private final String SalesFileName = "Seller.txt";
    public static ArrayList<Seller> Sellers = new ArrayList<Seller>();

    public Seller() {
    }

    public Seller(int id, String userName, String pass, String fname, String lname, int age, double salary) {
        super(id, userName, pass, fname, lname, age, salary);
    }
    
    public boolean addSeller() {
        if (FManager.write(getSellerData(),SalesFileName , true)) {
            
            return true;
        } else {
            return false;
        }
    }
    private String getSellerData() {
        return this.id + "-" + this.userName + "-" + this.pass + "-" + this.fname + "-" + this.lname + "-" + this.age + "-" + this.salary;
    }

    private void commitToFile() {
        if(Sellers.isEmpty()) {
            try {
                new FileWriter(SalesFileName, false).close();
            } catch (IOException ex) {
                Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
        FManager.write(Sellers.get(0).getSellerData(), SalesFileName, false);
        for (int i = 1; i < Sellers.size(); i++) {
            FManager.write(Sellers.get(i).getSellerData(), SalesFileName, true);
        }
        }

    }

    private void loadFromFile() {
        try {
            Sellers = (ArrayList<Seller>) (Object) FManager.read(SalesFileName);
        } catch (ParseException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        private int getSellerIndex(int id){
        for (int i = 0; i < Sellers.size(); i++)
            if(Sellers.get(i).getId() == id)
                return i;

        return -1;
    }
        private int getSellerIndex(String username){
        for (int i = 0; i < Sellers.size(); i++)
            if(Sellers.get(i).getUserName().equals(username))
                return i;

        return -1;
    }


    public Seller searchSales(int id){
        loadFromFile();
        int index = getSellerIndex(id);
        if(index != -1)
            return Sellers.get(index);
        else
            return null;
    }
    public Seller searchSales(String username){
        loadFromFile();
        int index = getSellerIndex(username);
        if(index != -1)
            return  Sellers.get(index);
        else
            return null;
    }

    public String displayAllSales() {
        loadFromFile();
        String S = "\nAll Sellers Data:\n";
        for (Seller x : Sellers) {
            S = S + x.toString();
        }
        return S;
    }
    
        public ArrayList<Seller> listSales() {
        loadFromFile();
        return Sellers;
    }

    public boolean updateSales(int oldID, Seller x){
        loadFromFile();
        int index = getSellerIndex(oldID);
        Sellers.set(index, x);
        commitToFile();
        return true;
    }

    public boolean deleteSales(int id){
        loadFromFile();
        int index = getSellerIndex(id);
        Sellers.remove(index);
        commitToFile();
        return true;
    }


    @Override
    public String toString() {
        return "\nI'm : " + fname + " " + lname + "\n" + "ID : " + id +  "\nUserName: " + userName + "\t Password: " + pass + "\n" + " Age : " +age + "\n" + "Salary : " + salary + "\n";
    }


}
