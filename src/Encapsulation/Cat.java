package Encapsulation;

public class Cat extends Pet {
    Cat(String name) {
        System.out.println("I am cat and my name is: " + name);
    }
    void sleep() {
        System.out.println("Cat sleeps");
    }
}
