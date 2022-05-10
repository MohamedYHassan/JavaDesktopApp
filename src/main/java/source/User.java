package source;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class User {

    protected int id;
    protected String userName;
    protected String pass;
    protected String fname;
    protected String lname;
    protected int age;
    protected ArrayList<User>  user =  new ArrayList<User>();
    FileManage FManager = new FileManage();
    protected final String AdminFileName = "Admin.txt";
    
    protected final String AdminLoginFile = "Admin.txt";
    protected final String MarketingLoginFile = "MarketingEmployee.txt";
    protected final String InventoryLoginFile = "InventoryEmployee.txt";
    protected final String SalesLoginFile = "Seller.txt";
    private static Scanner x;
    private static PrintWriter y;

    public User() {
    }

    public User(int id, String userName, String pass, String fname, String lname, int age) {
        this.id = id;
        this.userName = userName;
        this.pass = pass;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean verifyAdminLogin(String userName, String Pass) throws ParseException  {

        String tmpUser = "";
        String tmpPass = "";
        int i = 0;

            
            user = (ArrayList<User>) (Object) FManager.read(AdminLoginFile);

            while (user.size() > i) {
                tmpUser = user.get(i).userName;
                tmpPass = user.get(i).pass;
                i++;

                if (tmpUser.trim().equals(userName.trim()) && tmpPass.trim().equals(Pass.trim())) {
                    return true;
                }
            }

       
        return false;
    }

    public boolean verifyMarketingLogin(String userName, String Pass) throws ParseException, FileNotFoundException {

        String tmpUser = "";
        String tmpPass = "";
        int i = 0;

            
            user = (ArrayList<User>) (Object) FManager.read(MarketingLoginFile);

            while (user.size() > i) {
                tmpUser = user.get(i).userName;
                tmpPass = user.get(i).pass;
                i++;

                if (tmpUser.trim().equals(userName.trim()) && tmpPass.trim().equals(Pass.trim())) {
                    return true;
                }
            }

       
        return false;
    }

    public boolean verifyInventoryLogin(String userName, String Pass) throws ParseException {

        String tmpUser = "";
        String tmpPass = "";
        int i = 0;

            
            user = (ArrayList<User>) (Object) FManager.read(InventoryLoginFile);

            while (user.size() > i) {
                tmpUser = user.get(i).userName;
                tmpPass = user.get(i).pass;
                i++;

                if (tmpUser.trim().equals(userName.trim()) && tmpPass.trim().equals(Pass.trim())) {
                    return true;
                }
            }

       
        return false;
    }

    public boolean verifySalesLogin(String userName, String Pass) throws ParseException {

        String tmpUser = "";
        String tmpPass = "";
        int i = 0;

            
            user = (ArrayList<User>) (Object) FManager.read(SalesLoginFile);

            while (user.size() > i) {
                tmpUser = user.get(i).userName;
                tmpPass = user.get(i).pass;
                i++;

                if (tmpUser.trim().equals(userName.trim()) && tmpPass.trim().equals(Pass.trim())) {
                    return true;
                }
            }

       
        return false;
    }
}
