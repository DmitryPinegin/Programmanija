package Methods_in_interface;

public class Lesson24 {
    public static void main(String[] args) {
        Mechenosec mech = new Mechenosec("Mech");
        mech.swim();
        mech.eat();
        mech.sleep();
        Speakable pingvi = new Pingvin("Pingvi");
        pingvi.speak();
        Animal lev = new Lev("Lev");
        System.out.println(lev.getName());
        lev.eat();
        lev.sleep();
        Mammal mammal = new Lev("Mama");
        System.out.println(mammal.getName());
        mammal.run();
        mammal.eat();
        mammal.sleep();
        mammal.speak();
    }
}
