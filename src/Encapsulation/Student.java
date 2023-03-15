package Encapsulation;

public class Student {
    private StringBuilder name;
    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder();
        sb = name;
        return sb;
    }
    public void setName(StringBuilder sb) {
        name = sb;
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
        grade = i;
    }


}
