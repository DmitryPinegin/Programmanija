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
