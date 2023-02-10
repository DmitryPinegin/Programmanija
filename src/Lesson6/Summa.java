package Lesson6;

public class Summa {
    int summa() {
        this.summa(0, 0, 0, 0);
        return 0;
    }
    int summa(int a) {
        this.summa(a, 0, 0, 0);
        return a;
    }
    int summa(int a, int b) {
        this.summa(a, b, 0, 0);
        return a + b;
    }
    int summa(int a, int b, int c) {
        this.summa(a, b, c, 0);
        return a + b + c;
    }
    int summa(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
        return a + b + c + d;
    }
    public static void main(String[] args) {
        Summa s = new Summa();
        s.summa(2, 3);
    }
}
