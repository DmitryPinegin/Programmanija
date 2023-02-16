package Switch_design;

public class Month {
    static void month(int serialNumberOfTheMonth) {
        switch (serialNumberOfTheMonth) {
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("Количество дней в месяце - 31");
                break;
            case 2 :
                System.out.println("Количество дней в месяце - 28");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("Количество дней в месяце - 30");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

    public static void main(String[] args) {

        month(9);
    }
}
