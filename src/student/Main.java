/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import data.Student;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] ds = initStudentList();
        printStudent(ds);
    }

    public static Student[] initStudentList() {

        Student ds[] = new Student[5];
        ds[0] = new Student("se01", "MOT", 1999, 2.0, "Tay Ninh");
        ds[1] = new Student("se03", "MOT", 1999, 3.0, "Tay Ninh");
        ds[2] = new Student("se01", "MOT", 1999, 2.0, "Tay Ninh");
        ds[3] = new Student("se02", "MOT", 1999, 2.0, "Tay Ninh");
        ds[4] = new Student("se01", "MOT", 1999, 8.0, "Tay Ninh");
        
        return ds;
    }

    public static void printStudent(Student ds[]) {
        if (ds.length == 0) {
            System.out.println("Nothing to print!!!");
            return;
        }
        System.out.println("the list of student: ");
        for (Student x : ds) {
            x.showProfile();
        }
    }
}
