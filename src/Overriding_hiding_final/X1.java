package Overriding_hiding_final;

public class X1 {
    public X1() {
        System.out.println("X");
    }
    public X1(int i) {
        System.out.println("X" + i);
    }
    private boolean abc() {
        return false;
    }

    public static void main(String[] args) {
        X1 x = new Y1(18);
        System.out.println(x.abc());
    }
}

class Y1 extends X1 {
    public Y1(int i) {
        System.out.println("Y");
    }
    public boolean abc() {
        return true;
    }
}
