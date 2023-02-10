package Programmanija;

import java.util.ArrayList;


public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 2, 19, 8.3);
        Student st2 = new Student("Marija", 'f', 1, 18, 8.0);
        Student st3 = new Student("Petr", 'm', 3, 20, 7.9);
        Student st4 = new Student("Misha", 'm', 5, 22, 6.5);
        Student st5 = new Student("Vera", 'f', 4, 21, 8.7);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        info.printStudentGrade(students, 8);
        info.printStudentAge(students, 19);
        info.printStudentMix(students, 8.0, 19, 'm');
    }
    void printStudentGrade(ArrayList<Student> listStud, double grade) {
        for (Student s : listStud) {
            if(s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }
    void printStudentAge(ArrayList<Student> listStud, int grad) {
        for (Student s : listStud) {
            if(s.age < grad) {
                System.out.println(s);
            }
        }
    }
    void printStudentMix(ArrayList<Student> listStud, double grade, int grad, char sex) {
        for (Student s : listStud) {
            if(s.age > grad && s.avgGrade < grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }
}
