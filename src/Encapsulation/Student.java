package Encapsulation;

public class Student {
    private StringBuilder name;
    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder();
        sb = name;
        return sb;
    }
    public void setName(StringBuilder sb) {
        if (sb.length() > 3) {
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
    public void showInfo(Student student) {
        System.out.println(student.getName());
        System.out.println(student.getCourse());
        System.out.println(student.getGrade());
    }


}
