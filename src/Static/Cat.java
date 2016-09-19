package Static;

/**
 * Created by Артем on 19.09.2016.
 */
public class Cat {
    String name;
    //int numbersOfCats;Если переменная не статическая, то каждый раз когда мы будем создавать новый экземпляр класса
    // то наша переменная хранящяя кошек будет обнуляться
    static  int numbersOfCats; // Если же переменная обьявленна как стати она создаеться 1 раз за всю программу
    // и после этого может изменяться, однако она никогда не обнулится при вызове нового обьекта, она будет хранить те значения
    // которые были в нее помещены, Так же static переменная  не обрабатываеться GC!


    public Cat(String name) {
        this.name = name;
        numbersOfCats++;
    }
    public void show(){
        System.out.println(name);
    }
    void ShowCats(){
        System.out.println(numbersOfCats);
    }

}
