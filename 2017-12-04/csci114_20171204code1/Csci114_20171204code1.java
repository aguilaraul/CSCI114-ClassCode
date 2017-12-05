/**
 * @author raul aguilar
 */
package csci114_20171204code1;

import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int age;
    
    public Student(String n, int a) {
        this.name = n;
        this.age = a;
    }
    @Override
    public String toString(){
        return name + ", " + age;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age == o.age) return 0;
        else
            return (this.age < o.age) ? -1:1;
    }
}

public class Csci114_20171204code1 {

    public static void main(String[] args) {
        Student[] s = new Student[5];
        s[0] = new Student("Alan", 21);
        s[1] = new Student("Bob", 22);
        s[2] = new Student("Charlie", 19);
        s[3] = new Student("Diana", 18);
        s[4] = new Student("Ellen", 20);
        System.out.println("Before:");
        for(Student students : s){ System.out.println(students); }
        Arrays.sort(s);
        System.out.println("===");
        System.out.println("After:");
        for(Student students : s){ System.out.println(students); }
    }
    
}
