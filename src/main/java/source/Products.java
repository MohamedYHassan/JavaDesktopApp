package source;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import static source.Order.Orders;
import source.User;

public class Products {
    
    private final String ProductsFileName = "Products.txt";
    public static ArrayList<Products> ProductsList = new ArrayList<Products>();
    public static ArrayList<Products> Expired = new ArrayList<Products>();
    protected int id;
    protected String name;
    protected String description;
    protected int quantity;
    protected double price;
    protected int month;
    protected int year;
    protected MyDate expiryDate;
    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    FileManage FManager = new FileManage();

    public Products() {
        
    }

    public Products(int id,String name,String description,int quantity,double price,int month, int year)  {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.month = month;
        this.year = year;
       // this.expiryDate = (Date) formatter.parse(expiryDate);
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setMonth(int month) {
        this.month = month;
    }
    
    public int getMonth() {
        return this.month;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public String getExpiry() {
        return this.month + "/" + this.year;
    }

  
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public boolean checkExpiry(Products x) {
        GregorianCalendar calendar = new GregorianCalendar();
        if(x.getYear() < calendar.get(GregorianCalendar.YEAR) || (x.getYear() == calendar.get(GregorianCalendar.YEAR) && x.getMonth() <= (calendar.get(GregorianCalendar.MONTH)+1) )) {
            x.addDamaged();
            x.deleteProducts(x.getId());
            return true;
        }
        return false;
    
    }
   
    
    
    public boolean addProduct() {
        if (FManager.write(getProductsData(), ProductsFileName, true)) {
            return true;
        } else {
            return false;
        }
    }
    
    public void addDamaged() {
        FManager.write(getProductsData(),"Damages.txt",true);
    }
    private String getProductsData() {
        return this.id + "-" + this.name + "-" + this.description + "-" + this.quantity + "-" + this.price + "-" + this.month + "-" + this.year;
    }

    private void commitToFile() {
        if(ProductsList.isEmpty()) {
            try {
                new FileWriter(ProductsFileName, false).close();
            } catch (IOException ex) {
                Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
        FManager.write(ProductsList.get(0).getProductsData(), ProductsFileName, false);
        for (int i = 1; i < ProductsList.size(); i++) {
            FManager.write(ProductsList.get(i).getProductsData(), ProductsFileName, true);
        }
        }
    }

    private void loadFromFile()  {
        
        try {
            ProductsList = (ArrayList<Products>) (Object) FManager.read(ProductsFileName);
        } catch (ParseException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
        } 
    
    private void loadFromDamagesFile()  {
        
        
        try {
            Expired = (ArrayList<Products>) (Object) FManager.read("Damages.txt");
        } catch (ParseException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private int getProductsIndex(int id){
        for (int i = 0; i < ProductsList.size(); i++)
            if(ProductsList.get(i).getId() == id)
                return i;

        return -1;
    }
    public Products searchProducts(int id){
        loadFromFile();
        int index = getProductsIndex(id);
        if(index != -1)
            return  ProductsList.get(index);
        else
            return null;
    }

    public String displayAllProducts() {
        loadFromFile();
        String S = "\nAll Products Data:\n";
        for (Products x : ProductsList) {
            S = S + x.toString();
        }
        return S;
    }

    public boolean updateProducts(int oldID, Products x){
        loadFromFile();
        int index = getProductsIndex(oldID);
        ProductsList.set(index, x);
        commitToFile();
        return true;
    }
      public ArrayList<Products> listExpired() {
        loadFromDamagesFile();
        return Expired;
    }
    
    public ArrayList<Products> listProducts() {
        loadFromFile();
        return ProductsList;
    }

    public boolean deleteProducts(int id){
        loadFromFile();
        int index = getProductsIndex(id);
        ProductsList.remove(index);
        commitToFile();
        return true;
    }


   
}



