package ex3_equals;

/**
 * Created by Артем on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "hello";
//        String s2 = "hello";
        String s2 = new String("hello");

        s1 = s2;

        if (s1 == s2) {
            System.out.println("equals");

        } else {
            System.out.println("not equals");
        }


        if (s1.equals(s2)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }
}
