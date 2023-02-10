package Lesson5;

public class Employee {
    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;

    }
    public Employee(int id, String surname, int age) {
        this(id, surname, age,0 , null);
    }
    private Employee(String surname) {
        this(0, surname, 0, 0, null);
    }
    private int id;
    String surname;
    public int age;
    private double salary;
    String department;
     double salaryX2() {
        salary *= 2;
        return salary;
    }
    public void method1() {
         System.out.println(id + " " + age);
    }

    public void method2() {
        System.out.println(id + " " + salary);
    }
    public void method3() {
        System.out.println(id + surname + salary);
    }
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee rab1 = new Employee(1, "Petrov", 38, 3557.70, "Garage");
        Employee rab2 = new Employee(2, "Ivanov", 27, 2790.50, "Sklad");
        rab1.salaryX2();
        rab2.salaryX2();
//        System.out.println("Новая зарплата работника " + rab1.surname + " " + rab1.salary);
//        System.out.println("Новая зарплата работника " + rab2.surname + " " + rab2.salary);
    }
}
