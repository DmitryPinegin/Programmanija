package StringBuilderClass;

public class StringBuilderClass {
    static boolean ravenstvo(StringBuilder s1, StringBuilder s2) {
        return (s1.equals(s2));
    }

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        StringBuilder s3 = s1;
        System.out.println(ravenstvo(s1, s3));
    }
}
