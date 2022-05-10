package source;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import static source.Order.Orders;


public class MarketingEmployee extends Staff {


    private final String MarketingFileName = "MarketingEmployee.txt";
    public static ArrayList<MarketingEmployee> MarketingEmps = new ArrayList<MarketingEmployee>();

    public MarketingEmployee() {
    }

    public MarketingEmployee(int id, String userName, String pass, String fname, String lname, int age, double salary) {
        super(id, userName, pass, fname, lname, age, salary);
    }

    public boolean addMarketingEmp() {
        if (FManager.write(getMarketingEmpData(), MarketingFileName, true)) {
            return true;
        } else {
            return false;
        }
    }
    private String getMarketingEmpData() {
        return this.id + "-" + this.userName + "-" + this.pass + "-" + this.fname + "-" + this.lname + "-" + this.age + "-" + this.salary;
    }

    private void commitToFile() throws IOException {
        if(MarketingEmps.isEmpty()) {
             new FileWriter(MarketingFileName, false).close();
        }
        else {
        FManager.write(MarketingEmps.get(0).getMarketingEmpData(), MarketingFileName, false);
        for (int i = 1; i < MarketingEmps.size(); i++) {
            FManager.write(MarketingEmps.get(i).getMarketingEmpData(), MarketingFileName, true);
        }
        }

    }

    private void loadFromFile() throws ParseException {
        MarketingEmps = (ArrayList<MarketingEmployee>) (Object) FManager.read(MarketingFileName);
    }

    private int getMarketingEmpIndex(int id){
        for (int i = 0; i < MarketingEmps.size(); i++)
            if(MarketingEmps.get(i).getId() == id)
                return i;

        return -1;
    }
     private int getMarketingEmpIndex(String username){
        for (int i = 0; i < MarketingEmps.size(); i++)
            if(MarketingEmps.get(i).getUserName().equals(username))
                return i;

        return -1;
    }
    public MarketingEmployee searchMarketing(int id) throws ParseException{
        loadFromFile();
        int index = getMarketingEmpIndex(id);
        if(index != -1)
            return  MarketingEmps.get(index);
        else
            return null;
    }
    public MarketingEmployee searchMarketing(String username) throws ParseException{
        loadFromFile();
        int index = getMarketingEmpIndex(username);
        if(index != -1)
            return  MarketingEmps.get(index);
        else
            return null;
    }

    public String displayAllMarketing() throws ParseException {
        loadFromFile();
        String S = "\nAll Marketing Emps Data:\n";
        for (MarketingEmployee x : MarketingEmps) {
            S = S + x.toString();
        }
        return S;
    }

    public boolean updateMarketing(int oldID, MarketingEmployee x) throws ParseException, IOException{
        loadFromFile();
        int index = getMarketingEmpIndex(oldID);
        MarketingEmps.set(index, x);
        commitToFile();
        return true;
    }
    
    public ArrayList<MarketingEmployee> listMarketing() throws ParseException {
        loadFromFile();
        return MarketingEmps;
    }

    public boolean deleteMarketing(int id) throws ParseException, IOException{
        loadFromFile();
        int index = getMarketingEmpIndex(id);
        MarketingEmps.remove(index);
        commitToFile();
        
        return true;
    }


    @Override
    public String toString() {
        return "\nI'm : " + fname + " " + lname + "\n" + "ID : " + id +  "\nUserName: " + userName + "\t Password: " + pass + "\n" + "Age : " +age + "\n" + "Salary : " + salary + "\n";
    }
}
