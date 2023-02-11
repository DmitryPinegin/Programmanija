package Raznovidnosti_perevennih_predeli_vidimosti;

public class ClassTest2 {
    int a = 1;
    static int b = 2;
    static void abc(final int a) {
        System.out.println(a);
        System.out.println(ClassTest2.b);
    }
    public static void main(String[] args) {
        abc(5);
    }
}
