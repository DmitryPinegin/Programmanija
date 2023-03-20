package Polymorphism;

public class Lesson25 {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("M");
        Pingvin p = new Pingvin("P");
        Lev l = new Lev("L");
        Mammal ma = new Lev("La");
        Bird b = new Pingvin("B");
        Fish f = new Mechenosec("Me");
        Speakable s = new Pingvin("Sp");
        Speakable s1 = new Lev("L1");


     Speakable[] speakables = new Speakable[] {p, l, ma, b, s, s1};
     Animal[] animals = new Animal[] {m, p, l, ma, b, f, (Animal)s, (Animal)s1};
     for (Speakable s3 : speakables) {
         if (s3 instanceof Lev) {
             s3.speak();
             ((Animal) s3).eat();
             ((Animal) s3).getName();
             ((Animal) s3).sleep();
             ((Lev) s3).run();
             s3.speak();
         }
     }
     for (Animal a : animals) {
        if (a instanceof Pingvin) {
            a.eat();
            a.getName();
            ((Pingvin) a).fly();
            a.sleep();
            ((Pingvin) a).speak();
        }
     }

    }
}
abstract class Animal {
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

