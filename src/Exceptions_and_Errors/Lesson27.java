package Exceptions_and_Errors;

public class Lesson27 {
    public static void main(String[] args) throws Exception {
        Tiger tigr = new Tiger();
        tigr.eat("mjaso");
        try {
            tigr.drink("voda");
            try {
                tigr.drink("pivo");
            } catch (NeVodaExeption e) {

            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Eto inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
class NeMjasoExeption extends RuntimeException {
    NeMjasoExeption (String s) {
        super(s);
    }
}
class NeVodaExeption extends Exception {
    NeVodaExeption (String s) {
        super(s);
    }
}
class Tiger {
    void eat(String s) {
        if (s.equals("mjaso")) {
            System.out.println("Tigr est mjaso");
        } else {
            throw new NeMjasoExeption("Tigr ne est " + s);
        }

    }
    void drink(String s) throws NeVodaExeption {
            if (s.equals("voda")) {
                System.out.println("Tigr pjet vodu");
            } else {
                    throw new NeVodaExeption("Tigr ne pjet " + s);
                }

    }

}
