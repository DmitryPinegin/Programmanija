package Lesson8;

public class TwoClass {
    public static void main(String[] args) {
        FirstClass.proizvedenie(2, 5,3);
        FirstClass.delenie(8, 2);
        FirstClass.delenie(FirstClass.proizvedenie(2, 1, 3), 7);
        FirstClass.proizvedenie(1, 4, 3);
        TwoClass t = new TwoClass();
        t.infoMethod(4.67);
        dlinaOkrugnosti(3);

    }
     double ploshadKruga(double radius) {
        double S = Lesson8.FirstClass.pi * radius * radius;
        return S;
    }
    static double dlinaOkrugnosti(double radius) {
        double S = 2 * Lesson8.FirstClass.pi * radius;
        return S;
    }
      void infoMethod(double radius) {
        System.out.println("Радиус окружности = " + radius);
        System.out.println("Площадь круга = " + ploshadKruga(radius));
        System.out.println("Длина окружности = " + dlinaOkrugnosti(radius));
    }
} // нельзя использовать не статичные методы в статичных
// не статичные методы можно вызывать только на объекте
// статичные методы можно вызывать сами по себе