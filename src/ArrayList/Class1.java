package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Class1 {
    public ArrayList<String> abc(String...text) {
        ArrayList<String> array1 = new ArrayList<>();

        for (String s : text) {
            if(!array1.contains(s)) {
                array1.add(s);
            }
        }
        Collections.sort(array1);
        System.out.println(array1);
        return array1;
    }

    public static void main(String[] args) {
        Class1 clas = new Class1();
        clas.abc("sss", "gggg", "eeeee", "dddd", "pppp", "dddd");
    }
}
