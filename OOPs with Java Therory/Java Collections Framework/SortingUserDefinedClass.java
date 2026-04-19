import java.util.*;

class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student o) {
        return rollNo - o.rollNo;
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // alphabetical
    }
}

class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.marks - s2.marks;
    }
}

public class SortingUserDefinedClass {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Anubhav", 86);
        Student student2 = new Student(2, "Anand", 89);
        Student student3 = new Student(3, "Aabhas", 78);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println("Unsorted: " + students);
        
        Collections.sort(students);
        System.out.println("Sorted by Roll No (natural): " + students);

        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by Names: " + students);

        Collections.sort(students, new MarksComparator());
        System.out.println("Sorted by Marks: " + students);
    }
}