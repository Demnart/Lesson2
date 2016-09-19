package ex5_oop;

/**
 * Created by Артем on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.age = 1;
        animal.about();
        Cat cat = new Cat();
        cat.about();

        Animal[] animal1 = new Animal[3];
        animal1[0] = cat;
        animal1[1] = new Dog();
        animal1[2] = new Croco();


        for (Animal an : animal1) {// полиморфизм
            an.about();
        }

    }
}
