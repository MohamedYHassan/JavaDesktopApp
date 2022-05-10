/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package source;

/**
 *
 * @author Mohamed Yousef
 */
public class MyDate {
    protected int month;
    protected int year;
    
    public MyDate(int month, int year) {
        this.month = month;
        this.year= year;
    }
    
    public String toString() {
        return month + "-" + year;
    }
    
}
