package Raznovidnosti_perevennih_predeli_vidimosti;

public class ClassTest1 {
    int a =1;
//    static  int a = 2; // одинаковое имя переменной не может быть
    void abc(int a) {
        System.out.println(a);
        System.out.println(this.a);
    }
    public static void main(String[] args) {
        ClassTest1 t = new ClassTest1();
        t.abc(3);
    }

}
