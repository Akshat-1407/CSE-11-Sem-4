/*
Comparable Interface
    * The Comparable interface is used to define the default ordering of objects.
    * A class that implements Comparable must define the compareTo() method: int compareTo(T o)
    * It is part of the java.lang package.
    * The compareTo() method compares the current object with another object of the same type.
*/

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student s) {
        return this.marks - s.marks; // Default order: ascending by marks
    }
}

public class ComparableInterface {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Anubhav", 86);
        Student student2 = new Student(2, "Anand", 86);

        if (student1.compareTo(student2) > 0)
            System.out.println(student1.name + " has more marks than " + student2.name);
        else if (student1.compareTo(student2) < 0)
            System.out.println(student1.name + " has less marks than " + student2.name);
        else
            System.out.println(student1.name + " has same marks as " + student2.name);
    }
}
