package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[]{new Student(11),new Student(5)};
        Arrays.sort(students,new MyComparator());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].age);
        }
    }

}

class Student{
    int age;

    Student(int age){
        this.age = age;
    }
}

class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}


