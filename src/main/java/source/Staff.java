package source;
public class Staff extends User {
    protected double salary;


    public Staff() {
    }

    public Staff(int id, String userName, String pass, String fname, String lname, int age, double salary) {
        super(id, userName, pass, fname, lname, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
