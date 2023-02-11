package Raznovidnosti_perevennih_predeli_vidimosti;

public class ClassA {

    public static void main(String [] args) {
        ClassA n1 = new ClassA();
        ClassA n2 = new ClassA();
        ClassA n3 = new ClassA();
        ClassA n4 = new ClassA();
        ClassA n5 = new ClassA();
        ClassA n6 = new ClassA();
        ClassA n7 = new ClassA();
        ClassA n8 = new ClassA();
        n1 = null;
        n2 = n1;
        n3 = null;
        n4 = null;
        n5 = n2;
        n6 = n4;
    }

}
