package ex3_equals;

/**
 * Created by Артем on 19.09.2016.
 */
public class Main1 {
    public static void main(String[] args) {
        Cat cat = new Cat("tom");
        Cat cat1 = new Cat("tom");

        if (cat == cat1) {
            System.out.println("equals");

        } else {
            System.out.println("not equals");
        }


        if (cat.equals(cat1)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }


    }
}