package Methods_in_interface;

public abstract class Animal {
    Animal(String name){
        this.name = name;
    }
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();

}
abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
        this.name = name;
    }
    public void sleep() {
        System.out.println("Vsegda interesno nabludat, kak spjat ribi");
    }
    abstract void swim();
}
abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
        this.name = name;
    }
    abstract void fly();


    public void speak() {
        System.out.println(name + "sings");;
    }
}
abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
        this.name = name;
    }
    abstract void run();
}
interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}
class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
        this.name = name;
    }
    public void swim() {
        System.out.println("Mechenosec krasivaja riba, kotoraja bistro plavaet!");
    }
    public void eat() {
        System.out.println("Mechenosec ne xishnaja riba, i ona est obichniyu ribiy korm! ");
    }

}
class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
        this.name = name;
    }
    public void eat() {
        System.out.println("Pingvin lubit est ribu!");
    }
    public void sleep() {
        System.out.println("Pingvini spjat prigavshis drug k drugu!");
    }
    public void fly() {
        System.out.println("Pingvini ne umejut letat!");
    }

    public void speak() {
        System.out.println("Pingvini ne poyut kak solovyi");
    }
}
class Lev extends Mammal {
    Lev(String name) {
        super(name);
        this.name = name;
    }
    public void eat() {
        System.out.println("Lev, kak lyuboi hishnik, lyubit mjaso!");
    }
    public void sleep() {
        System.out.println("Boljshuyu chast dnja lev spit!");
    }
    public void run() {
        System.out.println("Lev eto ne samaja bistraja koshka!");
    }
}
