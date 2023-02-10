package Lesson8;


public class FirstClass {
    static final double pi = 3.14;
    static int proizvedenie(int a, int b, int c) {
        return a * b * c;
    }
    static void delenie(int a, int b) {
        System.out.println("Целое частное двух чисел : " + (a/b));
        System.out.println("Остаток от деления : " + a % b);
    }
}
