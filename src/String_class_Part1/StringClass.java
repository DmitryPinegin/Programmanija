package String_class_Part1;

public class StringClass {
  //  public static String email = "ya@yandex.com; on@mail.ru; ona@gmail.com";
  static int a = 0;
    static int b = 0;
 static void email(String email) {
//        String s1 = email.substring(0, email.indexOf(" "));
//        String s2 = email.substring(email.indexOf(" "), email.indexOf(" "));
      //  String s3 = email.substring()
  //          System.out.println(s2);
//           int a = 0;
//        int b = 0;
            for (int i = 0; i < email.length(); i++) {

                if (i == email.indexOf("@")) {
                    a = i + 1;
                }
                else if (i == email.indexOf(".")) {
                    b = i;
                    System.out.println(email.substring(a, b));
                }
            }
    }

    public static void main(String[] args) {
        email("ya@yandex.com; on@mail.ru; ona@gmail.com");
    }
}
