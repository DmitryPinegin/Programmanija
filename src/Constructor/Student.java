package Constructor;

public class Student {
    Student(int studentIDТumber2, String name2, String surname2, int yearOfStudy2) {
        this(studentIDТumber2, name2, surname2,yearOfStudy2, 0.0,0.0, 0.0);

    }
    Student(){
        this(0, null,  null, 0,  0.0,  0.0, 0.0);
    }
    Student(int studentIDТumber1, String name1, String surname1, int yearOfStudy1, double mathAverage1, double averageScoreInEconomics1,double averageGradeInAForeignLanguage1) {
        name = name1;
        studentIDТumber = studentIDТumber1;
        surname = surname1;
        yearOfStudy = yearOfStudy1;
        averageScoreInEconomics = averageScoreInEconomics1;
        averageGradeInAForeignLanguage = averageGradeInAForeignLanguage1;
        mathAverage = mathAverage1;
    }
    int studentIDТumber;
    String name;
    String surname;
    int yearOfStudy;
    double mathAverage;
    double averageScoreInEconomics;
    double averageGradeInAForeignLanguage;

}
class StudentTest1 {
    Student st1 = new Student();
    Student st2 = new Student(1, "Ivan", "Petrov", 2021);
    Student st3 = new Student(2, "Vera", "Ivanova", 2018, 3.4, 4.5, 2.3);

}
