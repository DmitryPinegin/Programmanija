package UsingPrimitiveAndReferenceDataTypesWhenCallingAMethod;

public class Car {
    String color;
    String engine;
    int numberOfDoors;
    Car(String color, String engine, int numberOfDoors) {
        this.color = color;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }

}
class CarTest {
     static void changingTheNumberOfDoors(Car car, int quantity) {
        car.numberOfDoors = quantity;
    }
     static void colorReplacement(Car car1, Car car2) {
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
        Car car1 = new Car("Red", "V6", 5);
        Car car2 = new Car("Blue", "V8", 3);
        System.out.println("Цвет машины №1 изначальный : " + car1.color);
        System.out.println("Цвет машины №2 изначальный : " + car2.color);
        colorReplacement(car1, car2);
        System.out.println("Цвет машины №1 после покраски : " + car1.color);
        System.out.println("Цвет машины №2 после покраски : " + car2.color);

    }
}
