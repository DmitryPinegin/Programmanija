package Encapsulation;

public class Pet extends Animal {
    Pet() {
        Pet.setEyes(2);
        System.out.println("I am pet");
    }
    String name;
    int tail = 1;
    int paw = 4;
    void run() {
        System.out.println("Pet runs");
    }
    void jump() {
        System.out.println("Pet jumps");
    }

}
