/**
 * @author raul aguilar
 */
package csci114_20171204code2;

import java.util.Arrays;
import java.util.Comparator;

class Student {
    String name;
    int age;
    double grade;
    
    public Student(String n, int a, double g) {
        this.name = n;
        this.age = a;
        this.grade = g;
    }
    /* GETTERS */
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public double getGrade() {
        return this.grade;
    }
    /* SETTERS */
    public void setName(String n) {
        this.name = n;
    }
    public void setAge(int a) {
        this.age = a;
    }
    public void setGrade(double g) {
        this.grade = g;
    }
    @Override
    public String toString(){
        return "Student {" + "name: " + name
                + ", age: " + age
                + ", grade: " + grade
                + "}";
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getAge() - o2.getAge());
    }
}

public class Csci114_20171204code2 {
    
    public static void main(String[] args) {
        Student[] s = new Student[5];
        s[0] = new Student("Alan", 21, 90);
        s[1] = new Student("Bob", 22, 89);
        s[2] = new Student("Charlie", 19, 78);
        s[3] = new Student("Diana", 18, 89);
        s[4] = new Student("Ellen", 20, 99);
        for (Student students : s) { System.out.println(students); }
        System.out.print("===");
        System.out.printf("%32s%n", "===");
        Arrays.sort(s, new NameComparator());
        for (Student students : s) { System.out.println(students); }
        System.out.print("===");
        System.out.printf("%16s%n", "===");
        Arrays.sort(s, new AgeComparator());
        for (Student students : s) { System.out.println(students); }
    }
}
