package Collectionn.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}

public class SortingStudents {
    public static void main(String[] args) {

        Comparator<Student> comparator = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if (i.age > j.age)
                    return 1;
                else
                    return -1;

            }
        };

        // Comparator<Student> comparator = (i, j) -> i.age > j.age ? 1 : -1;

        List<Student> student = new ArrayList<>();
        student.add(new Student(23, "akshay"));
        student.add(new Student(21, "rohit"));
        student.add(new Student(24, "atharva"));
        student.add(new Student(22, "nikhil"));

        Collections.sort(student, comparator);
        // System.out.println(student);

        for (Student s : student)
            System.out.println(s);

    }
    //
    //
    //
    //
}
