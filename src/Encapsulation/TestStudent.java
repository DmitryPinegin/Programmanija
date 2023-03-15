package Encapsulation;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Egor"));
        student.setCourse(4);
        student.setGrade(7);
        Student.showInfo(student);

    }

}
