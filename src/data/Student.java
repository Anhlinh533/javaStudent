/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Anh Linh
 */
public class Student {
    private String id;
    private String name;
    private int yob;
    private double gpa;
    private String address;

    public Student(String id, String name, int yob, double gpa, String address) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", yob=" + yob + ", gpa=" + gpa + ", address=" + address + '}';
    }
    
    public void showProfile(){
        System.out.printf("|%-8s|%-25s|%4d|%4.1f|%-25s|\n",
                id, name, yob, gpa, address);
    }
    
}
