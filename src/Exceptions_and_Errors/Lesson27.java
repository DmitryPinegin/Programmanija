package Exceptions_and_Errors;

public class Lesson27 {

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
    void drink(String s) {
        try {
            s.equals("voda");
            System.out.println("Tigr pjet vodu");
        }
        catch (Exception e){
            System.out.println("Tigr ne pjet " + s);
        }
    }

}
