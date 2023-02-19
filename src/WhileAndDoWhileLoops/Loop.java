package WhileAndDoWhileLoops;

    public class Loop {
        static void time() {
            int hour = 0;
            PERVYI : while (hour <= 6) {
                int minuta = -1;
                VTOROYI:
                do {
                    minuta++;
                    if (hour > 1 && minuta % 10 == 0) {
                        break PERVYI;
                    }
                    int sekunda = 0;
                        while (sekunda <= 59) {
                            if (sekunda * hour > minuta) {
                                continue VTOROYI;
                            }
                            System.out.println(hour + ":" + minuta + ":" + sekunda);
                            sekunda++;
                    }
                } while(minuta < 59);
                hour++;
            }
                }

        public static void main(String[] args) {
            time();
        }
    }
