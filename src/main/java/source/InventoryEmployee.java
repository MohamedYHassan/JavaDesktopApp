package source;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static source.Order.Orders;

public class InventoryEmployee extends Staff {

    private final String InventoryFileName = "InventoryEmployee.txt";
    public static ArrayList<InventoryEmployee> InventoryEmps = new ArrayList<InventoryEmployee>();

    public InventoryEmployee() {
    }

    public InventoryEmployee(int id, String userName, String pass, String fname, String lname, int age, double salary) {
        super(id, userName, pass, fname, lname, age, salary);
    }

    public boolean addInventoryEmp() {
        if (FManager.write(getInventoryEmpData(),InventoryFileName , true)) {
     
            return true;
        } else {
            return false;
        }
    }
    private String getInventoryEmpData() {
        return this.id + "-" + this.userName + "-" + this.pass + "-" + this.fname + "-" + this.lname + "-" + this.age + "-" + this.salary;
    }

    private void commitToFile() throws IOException {
        if(InventoryEmps.isEmpty()) {
             new FileWriter(InventoryFileName, false).close();
        } else {
        FManager.write(InventoryEmps.get(0).getInventoryEmpData(), InventoryFileName, false);
        for (int i = 1; i < InventoryEmps.size(); i++) {
            FManager.write(InventoryEmps.get(i).getInventoryEmpData(), InventoryFileName, true);
        }
        }
    }

    private void loadFromFile() {
        try {
            InventoryEmps = (ArrayList<InventoryEmployee>) (Object) FManager.read(InventoryFileName);
        } catch (ParseException ex) {
            Logger.getLogger(InventoryEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private int getInventroyEmpIndex(int id){
        for (int i = 0; i < InventoryEmps.size(); i++)
            if(InventoryEmps.get(i).getId() == id)
                return i;

        return -1;
    }
    
      private int getInventroyEmpIndex(String username){
        for (int i = 0; i < InventoryEmps.size(); i++)
            if(InventoryEmps.get(i).getUserName().equals(username))
                return i;

        return -1;
    }
    public InventoryEmployee searchInventory(int id){
        loadFromFile();
        int index = getInventroyEmpIndex(id);
        if(index != -1)
            return  InventoryEmps.get(index);
        else
            return null;
    }
    public InventoryEmployee searchInventory(String username){
        loadFromFile();
        int index = getInventroyEmpIndex(username);
        if(index != -1)
            return  InventoryEmps.get(index);
        else
            return null;
    }

    public String displayAllInventory() {
        loadFromFile();
        String S = "\nAll Inventory Emps Data:\n";
        for (InventoryEmployee x : InventoryEmps) {
            S = S + x.toString();
        }
        return S;
    }

    public boolean updateInventory(int oldID, InventoryEmployee x) throws IOException{
        loadFromFile();
        int index = getInventroyEmpIndex(oldID);
        InventoryEmps.set(index, x);
        commitToFile();
        return true;
    }
    public ArrayList<InventoryEmployee> listInventory() {
        loadFromFile();
        return InventoryEmps;
    }

    public boolean deleteInventory(int id) throws IOException{
        loadFromFile();
        int index = getInventroyEmpIndex(id);
        InventoryEmps.remove(index);
        commitToFile();
        return true;
    }


    @Override
    public String toString() {
        return "\nI'm : " + fname + " " + lname + "\n" + "ID : " + id +  "\nUserName: " + userName + "\t Password: " + pass + "\n" + " Age : " +age + "\n" + "Salary : " + salary + "\n";
    }
}
