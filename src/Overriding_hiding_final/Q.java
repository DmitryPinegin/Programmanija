package Overriding_hiding_final;

class Q {
    String s1 = "privet";
}
class W extends Q {
    boolean bool = false;
}
class Test {
    public static void main(String[] args) {
        Q q = new W();
  //      System.out.println(q.s1 + " " + q.bool);
    }
}
