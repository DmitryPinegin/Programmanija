package Encapsulation;

public class Student {
    private StringBuilder name;
    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder();
        sb = name;
        return sb;
    }
    public void setName(StringBuilder sb) {
        if (sb.length() > 2) {
            name = sb;
        }
    }
    private int course;
    public int getCourse() {
        return course;
    }
    public void setCourse(int i) {
        if(i > 0 && i < 5) {
            course = i;
        }
    }
    private int grade;
    public int getGrade() {
        return grade;
    }
    public void setGrade(int i) {
        if(i > 0 && i < 11) {
            grade = i;
        }
    }
    public static void showInfo(Student student) {
        System.out.println("Имя студента : " + student.getName());
        System.out.println("Курс : " + student.getCourse());
        System.out.println("Оценка : " + student.getGrade());
    }


}
