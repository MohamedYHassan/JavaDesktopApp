package source;
import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FileManage {
    public  boolean write(String Query, String FilePath, boolean appendType) {

        PrintWriter writer = null;
        try {
            System.out.print("\nwriting in  " + FilePath);
            writer = new PrintWriter(new FileWriter(new File(FilePath), appendType));
            writer.println(Query);

            System.out.println(" ... Done ! ");
            return true;
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            assert writer != null;
            writer.close();
        }
        return false;
    }
    public ArrayList<Object> read(String FilePath) throws ParseException {

        Scanner reader = null;
        try {
            System.out.println("Reading From " + FilePath);

            reader = new Scanner(new File(FilePath));

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        if (FilePath.equals("Admin.txt")) {

            ArrayList<Admin> Admins = new ArrayList<Admin>();
            Admin x;

            while (reader.hasNext()) {

                x = new Admin();
                String line = reader.nextLine();
                String[] separated = line.split("-");

                x.setId(Integer.parseInt(separated[0]));
                x.setUserName(separated[1]);
                x.setPass(separated[2]);
                x.setFname(separated[3]);
                x.setLname(separated[4]);
                x.setAge(Integer.parseInt(separated[5]));
                x.setSalary(Double.parseDouble(separated[6]));
                Admins.add(x);
            }

            return (ArrayList<Object>) (Object) Admins;

        } else if (FilePath.equals("InventoryEmployee.txt")) {

            ArrayList<InventoryEmployee> InventoryEmps = new ArrayList<InventoryEmployee>();
            InventoryEmployee x;

            while (reader.hasNext()) {

                x = new InventoryEmployee();
                String line = reader.nextLine();
                String[] separated = line.split("-");

                x.setId(Integer.parseInt(separated[0]));
                x.setUserName(separated[1]);
                x.setPass(separated[2]);
                x.setFname(separated[3]);
                x.setLname(separated[4]);
                x.setAge(Integer.parseInt(separated[5]));
                x.setSalary(Double.parseDouble(separated[6]));

                InventoryEmps.add(x);
            }

            return (ArrayList<Object>) (Object) InventoryEmps;

        } else if (FilePath.equals("MarketingEmployee.txt")) {

            ArrayList<MarketingEmployee> MarketingEmps = new ArrayList<MarketingEmployee>();
            MarketingEmployee x;

            while (reader.hasNext()) {

                x = new MarketingEmployee();
                String line = reader.nextLine();
                String[] separated = line.split("-");

                x.setId(Integer.parseInt(separated[0]));
                x.setUserName(separated[1]);
                x.setPass(separated[2]);
                x.setFname(separated[3]);
                x.setLname(separated[4]);
                x.setAge(Integer.parseInt(separated[5]));
                x.setSalary(Double.parseDouble(separated[6]));
                MarketingEmps.add(x);
            }

            return (ArrayList<Object>) (Object) MarketingEmps;

        } else if (FilePath.equals("Seller.txt")) {

            ArrayList<Seller> Sellers = new ArrayList<Seller>();
            Seller x;

            while (reader.hasNext()) {

                x = new Seller();
                String line = reader.nextLine();
                String[] separated = line.split("-");

                x.setId(Integer.parseInt(separated[0]));
                x.setUserName(separated[1]);
                x.setPass(separated[2]);
                x.setFname(separated[3]);
                x.setLname(separated[4]);
                x.setAge(Integer.parseInt(separated[5]));
                x.setSalary(Double.parseDouble(separated[6]));
                Sellers.add(x);
            }

            return (ArrayList<Object>) (Object) Sellers;

        } else if(FilePath.equals("Products.txt")) {
            ArrayList<Products> ProductsList = new ArrayList<Products>();
            Products x;

            while (reader.hasNext()) {

                x = new Products();
                String line = reader.nextLine();
                String[] separated = line.split("-");

                x.setId(Integer.parseInt(separated[0]));
                x.setName(separated[1]);
                x.setDescription(separated[2]);
                x.setQuantity(Integer.parseInt(separated[3]));
                x.setPrice(Double.parseDouble(separated[4]));
                x.setMonth(Integer.parseInt(separated[5]));
                x.setYear(Integer.parseInt(separated[6]));
                
                
                ProductsList.add(x);
        }
            return (ArrayList<Object>) (Object) ProductsList;
        } else if(FilePath.equals("Reports.txt")) {
            ArrayList<Report> Reports = new ArrayList<Report>();
            Report x;

            while (reader.hasNext()) {

                x = new Report();
                String line = reader.nextLine();
                String[] separated = line.split("-");

                x.setReportID(Integer.parseInt(separated[0]));
                x.setProductID(Integer.parseInt(separated[1]));
                x.setMarketingID(Integer.parseInt(separated[2]));
                x.setReport(separated[3]);
                
                
                
                Reports.add(x);
        }
            return (ArrayList<Object>) (Object) Reports;
        } else if(FilePath.equals("Offers.txt")) {
            ArrayList<Offer> Offers = new ArrayList<Offer>();
            Offer x;

            while (reader.hasNext()) {

                x = new Offer();
                String line = reader.nextLine();
                String[] separated = line.split("-");

                x.setOfferID(Integer.parseInt(separated[0]));
                x.setProductID(Integer.parseInt(separated[1]));
                x.setOffer(separated[2]);
                
                
                
                Offers.add(x);
        }
            return (ArrayList<Object>) (Object) Offers;
        } else if(FilePath.equals("Orders.txt")) {
            ArrayList<Order> Orders = new ArrayList<Order>();
            Order x;

            while (reader.hasNext()) {

                x = new Order();
                String line = reader.nextLine();
                String[] separated = line.split("-");

                x.setOrderID(Integer.parseInt(separated[0]));
                x.setProductID(Integer.parseInt(separated[1]));
                x.setQuantity(Integer.parseInt(separated[2]));
               
                Orders.add(x);
        }
            return (ArrayList<Object>) (Object) Orders;
        } else if(FilePath.equals("Damages.txt")) {
            ArrayList<Products> products = new ArrayList<Products>();
            Products x;

            while (reader.hasNext()) {

                x = new Products();
                String line = reader.nextLine();
                String[] separated = line.split("-");

                x.setId(Integer.parseInt(separated[0]));
                x.setName(separated[1]);
                x.setDescription(separated[2]);
                x.setQuantity(Integer.parseInt(separated[3]));
               
                products.add(x);
        }
            return (ArrayList<Object>) (Object) products;
        } else if(FilePath.equals("Returns.txt")) {
            ArrayList<Order> Orders = new ArrayList<Order>();
            Order x;

            while (reader.hasNext()) {

                x = new Order();
                String line = reader.nextLine();
                String[] separated = line.split("-");

                x.setOrderID(Integer.parseInt(separated[0]));
                x.setProductID(Integer.parseInt(separated[1]));
                x.setQuantity(Integer.parseInt(separated[2]));
                
               
                Orders.add(x);
        }
            return (ArrayList<Object>) (Object) Orders;
        }
         else {
            return null;
        }

    }

}

