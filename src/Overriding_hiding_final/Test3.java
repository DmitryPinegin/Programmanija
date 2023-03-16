package Overriding_hiding_final;


class A {}
class B extends A {}
public class Test3 {
    public static void abc(A x, B y) {
        System.out.println("privet");
    }
    public static void abc(B y, A x) {
        System.out.println("poka");
    }

    public static void main(String[] args) {
        B a = new B();
  //      abc(a, a);
    }
}