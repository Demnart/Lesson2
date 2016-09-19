package Static;

/**
 * Created by Артем on 19.09.2016.
 */
public class Main1 {
    public static void main(String[] args) {
//        Cat cat = new Cat("Cherry");
//        System.out.println(cat.numbersOfCats);Можно но не желательно
        System.out.println(Cat.numbersOfCats);// Можно вызывать даже без создания экземпляра класса
        Cat.staticShowCats();
//        cat.staticShowCats(); так делать не стоит так как статические переменные и методы
        // вызываються через класс пример  Cat.staticShowCats(); или Cat.staticShowCats()
    }
}
