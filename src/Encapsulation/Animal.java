package Encapsulation;

public class Animal {
    Animal(){
        System.out.println("I am animal");
    }
    private static int eyes;
    public int getEyes() {
        return eyes;
    }
    public static void setEyes(int i) {
        if(i > 0 && i < 3) {
            eyes = i;
        }
    }
    public void eat() {
        System.out.println("Animal eats");
    }
    public void drink() {
        System.out.println("Animal drinks");
    }
}
