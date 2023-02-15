package The_if_and_if_else_constructs_ternary_operator;

public class Student {
    int course;
    String name;
    double srednjayaOcenka;

    Student(int course, String name, double srednjayaOcenka) {
        this.course = course;
        this.name = name;
        this.srednjayaOcenka = srednjayaOcenka;
    }
}
class StudentTest {
    static void sravnenie1(Student st1, Student st2) {
   //     st1 = st2;
        if (st1.equals(st2)) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты не равны");
        }
    }

    static void sravnenie2(Student st1, Student st2) {
        if (st1.name == st2.name) {
            if (st1.course == st2.course) {
                if (st1.srednjayaOcenka == st2.srednjayaOcenka) {
                } else {
                    System.out.println("Средние оценки студентов не равны");
                }
            } else {
                System.out.println("Студенты учатся на разных курсах");
            }
        } else {
            System.out.println("У студентов разные имена");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student(1, "Ivan", 4.5);
        Student st2 = new Student(1, "Ivan", 4.5);
        sravnenie1(st1, st2);
        sravnenie2(st1, st2);
    }
}
