package Static;

/**
 * Created by Артем on 19.09.2016.
 */
public class Main1 {
    public static void main(String[] args) {
        Cat cat = new Cat("Cherry");
//        System.out.println(cat.numbersOfCats);Можно но не желательно
        System.out.println(Cat.numbersOfCats);
    }
}
