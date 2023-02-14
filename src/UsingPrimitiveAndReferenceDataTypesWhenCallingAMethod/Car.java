package UsingPrimitiveAndReferenceDataTypesWhenCallingAMethod;

public class Car {
    String color;
    String engine;
    public static int numberOfDoors;
    Car(String color, String engine, int numberOfDoors) {
        this.color = color;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }

}
class CarTest {
    public static void changingTheNumberOfDoors(Car car, int quantity) {
        car.numberOfDoors = quantity;
    }
    void colorReplacement(Car car1, Car car2) {
        Car car3 = new Car("Black", "V6", 3);
        car3.color = car1.color;
        car1.color = car2.color;
        car2.color = car3.color;
    }

    public static void main(String[] args) {
        Car car = new Car("Black", "V4", 3);
        System.out.println("Цвет машины : " + car.color);
        System.out.println("Мотор : " + car.engine);
        System.out.println("Количество дверей : " + car.numberOfDoors);

        changingTheNumberOfDoors(car,5);
        System.out.println("Количество дверей после замены : " + car.numberOfDoors);

    }
}
