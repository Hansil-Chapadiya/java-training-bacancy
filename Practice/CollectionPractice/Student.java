package Practice.CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {

//    private static Comparator<? super Student> ComparatorDemo;
    long enrollment;
    String name;
    double marks;

    public Student(long enrollment, String name, double marks) {
        this.enrollment = enrollment;
        this.name = name;
        this.marks = marks;
    }

    public Student() {
    }

    public long getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(long enrollment) {
        this.enrollment = enrollment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {

        ArrayList<Student> A = new ArrayList<>();

        A.add(new Student(5, "Hansil", 100));
        A.add(new Student(6, "Hansil1", 90));
        A.add(new Student(7, "Hansil2", 80));
        A.add(new Student(8, "Hansil3", 95));

//        A.sort((a,b)->(int)(a.marks-b.marks));

        A.sort(new ComparatorDemo());


        System.out.println(A);
    }

}
