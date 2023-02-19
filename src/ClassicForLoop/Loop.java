package ClassicForLoop;

public class Loop {
    static void time() {
        PERVYI : for (int hour = 0; hour <= 6; hour++) {
            VTOROYI : for (int minuta = 0; minuta <= 59; minuta++){
                if(hour > 1 && minuta % 10 == 0){
                    break PERVYI;
                }
                TRETYI : for (int sekunda = 0; sekunda <= 59; sekunda++){
                    if(sekunda * hour > minuta) {
                        continue VTOROYI;
                    }
                    System.out.println(hour + ":" + minuta + ":" + sekunda);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
