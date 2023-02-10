package Lesson5;

public class BankAccount {
    static double balans = 20.4;
    static double popolnenieScheta(double summaPopolnenija) {
        double result = balans + summaPopolnenija;
        return result;
    }
    static double snyatieSoScheta(double summaSnyatiya) {
        double result = balans - summaSnyatiya;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(BankAccount.popolnenieScheta(10.3));
        balans = popolnenieScheta(10.3);
        System.out.println(BankAccount.snyatieSoScheta(7.5));
    }

}
