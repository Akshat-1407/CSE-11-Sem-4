/*
Comparator Interface
    * The Comparator interface is used to define a custom sorting order for objects outside the class.
    * It is part of the java.util package and requires us to define the method: int compare(T o1, T o2)
    * It is useful when:
        * We cannot modify the original class.
        * We want to sort the same objects in different ways.
*/


import java.util.Comparator;
import java.util.TreeSet;

class Student {
    int rollNo;
    String name;
    int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "{Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks + "}";
    }
}

// class NameComparator implements Comparator<Student> {
//     public int compare(Student s1, Student s2) {
//         return s1.name.compareTo(s2.name); // alphabetical
//     }
// }

// class MarksComparator implements Comparator<Student> {
//     public int compare(Student s1, Student s2) {
//         return s1.marks - s2.marks;
//     }
// }

public class ComparatorInterface {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Anubhav", 86);
        Student student2 = new Student(2, "Anand", 89);

        /* We can make an object of an interface using an anonymous class */
        // Comparator<Student> MarksComparator = new Comparator<Student>() {
        //     public int compare(Student s1, Student s2) {
        //         return s1.marks - s2.marks;
        //     }
        // };

        /* Comparator is a functional interface hence we can use lambda expressions */
        // Comparator<Student> MarksComparator = (Student s1, Student s2) -> {
        //     return s1.marks - s2.marks;
        // };

        Comparator<Student> MarksComparator = (s1, s2) -> s1.marks - s2.marks;

        TreeSet<Student> students = new TreeSet<>(MarksComparator);
        students.add(student1);
        students.add(student2);
        System.out.println(students);

        // students = new TreeSet<>(new NameComparator());
        // students.add(student1);
        // students.add(student2);
        // System.out.println(students);
    }
}
