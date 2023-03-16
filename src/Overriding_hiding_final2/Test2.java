package Overriding_hiding_final2;
import  Overriding_hiding_final.*;
public class Test2 extends Test1 {
    Test2() {}
    public void abc() {
        System.out.println("Y");
    }

    public static void main(String[] args) {
        Test2 y = new Test2();
        y.abc();
    }

}
