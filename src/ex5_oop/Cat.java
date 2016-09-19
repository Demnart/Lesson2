package ex5_oop;

/**
 * Created by Артем on 19.09.2016.
 */
public class Cat extends Animal {
    String home;
    String murrString;

    @Override
    void about() {
        System.out.println("Лениво");
    }
}
