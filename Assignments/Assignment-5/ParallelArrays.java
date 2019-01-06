/**
 * @author  raul aguilar
 * @class   CSCI 114
 * @date    Wed Oct 11 2017
 */

import java.util.Scanner;

class Student{
    int iD;
    String lastName;
    double gpa;
    
    // Constructer
    public Student(int id, String ln, double gpa) {
        iD = id;
        lastName = ln;
        this.gpa = gpa;
    }
    // Setters
    public void setID(int id) {
        iD = id;
    }
    public void setLastName(String ln) {
        lastName = ln;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    // Getters
    public int getID() {
        return iD;
    }
    public String getLastName() {
        return lastName;
    }
    public double getGpa() {
        return gpa;
    }
    // toString
    public String toString() {
        return this.iD + " " + this.lastName + " " + this.gpa;
    }
}

public class ParallelArrays  {

    public static int findIndex(Student[] array) {
        Student[] csci114 = array;
        int findID;
        int index = 0;
        boolean foundIndex = false;
        
        Scanner in = new Scanner(System.in);
        do {
        System.out.print("\nID number to find: ");
        findID = in.nextInt();
        for(int i = 0; i < csci114.length; i++) {
            int iD = csci114[i].getID();
            if(findID == iD ) {
                index = i;
                foundIndex = true;
            }
        }
        if (foundIndex != true)
            System.out.println("Could not find ID. Please enter a new one.");
        } while (foundIndex != true);
        
        in.close();
        return index;
    }
    
    public static void main(String[] args) {
        Student[] csci114 = {new Student(121, "Able", 98.71), 
            new Student(122, "Boyle", 92.46), new Student(123, "Cruz", 72.33),
            new Student(124, "Domingo", 84.94), new Student(125, "Eliene", 90.76)
        };
        int index;
        
        for(Student students: csci114) {
            System.out.println(students);
        }
        
        index = findIndex(csci114);

        System.out.printf("%nFound in slot %d%n", index);
        System.out.printf("%s%n", csci114[index]);
    }// end Main
}// end Assingment5
