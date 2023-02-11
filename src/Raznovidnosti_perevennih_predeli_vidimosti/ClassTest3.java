package Raznovidnosti_perevennih_predeli_vidimosti;

public class ClassTest3 {
    int a = 1;
    static int b =2;
    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(ClassTest3.b);
    }
    public static void main(String[] args) {
        ClassTest3 t = new ClassTest3();
        t.abc(4);
    }
}
