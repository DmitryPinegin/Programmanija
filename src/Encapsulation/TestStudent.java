package Encapsulation;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Egor"));
        student.setCourse(2);
        student.setGrade(8);
        Student.showInfo(student);

    }

}
