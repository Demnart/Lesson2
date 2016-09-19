package ex3_equals;

/**
 * Created by Артем on 19.09.2016.
 */
public class Cat {
    String name;
    int age;
    //int numbersOfCats;Если переменная не статическая, то каждый раз когда мы будем создавать новый экземпляр класса
    // то наша переменная хранящяя кошек будет обнуляться
    static int numbersOfCats; // Если же переменная обьявленна как стати она создаеться 1 раз за всю программу
    // и после этого может изменяться, однако она никогда не обнулится при вызове нового обьекта, она будет хранить те значения
    // которые были в нее помещены, Так же static переменная  не обрабатываеться GC!

    static {
//        age = 2; Нельзя вызвать так как метод статический,а переменная не статическая
        //
        numbersOfCats = 88;
    }

    {// Блок инициализации
        age = 10;
        numbersOfCats = 100;
    }

    public Cat(String name) {
        this.name = name;
        numbersOfCats++;
    }

    public void show() {
        System.out.println(name);
    }

    void ShowCats() {
        System.out.println(numbersOfCats);
    }

    public static void staticShowCats() {
        System.out.println(numbersOfCats);
//        show(); Так сделать не получится так как метод не статический!
    }
// Данный метод создаеться через генератор кода и небоходим для сравнения двух обьектов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return age == cat.age;

    }

    @Override
    public int hashCode() {
        return age;
    }
}
