package Encapsulation;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Ghulic");
        System.out.println(dog.paw);
        Cat cat = new Cat("Murka");
        cat.sleep();
    }
}
