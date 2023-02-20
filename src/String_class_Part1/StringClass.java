package String_class_Part1;

public class StringClass {

    static void email(String email) {
        String s1 = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        String s2 = email.substring(email.indexOf("@", email.indexOf(".")) + 1, email.indexOf(".", email.indexOf(";")));
        String s3 = email.substring(email.indexOf(" ") + 1);
        String s4 = s3.substring(s3.indexOf("@", s3.indexOf(" ")) + 1, s3.indexOf(".", s3.indexOf(";")));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s4);

    }

    public static void main(String[] args) {
        email("ya@yandex.com; on@mail.ru; ona@gmail.com");
    }
}
