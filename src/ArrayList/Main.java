package ArrayList;

import java.util.ArrayList;

/**
 * Created by Артем on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        char[] chars = new char[10];//Так обьявлялся массив до знания коллекций

        ArrayList list = new ArrayList();// Так обьявляеться коллекция(Обертка над массивом)
        list.add('%');
        list.add("hello");
        list.add(345);
        list.add(5678);
    //С помощью команды add в массив добавляються значения
        System.out.println(list);
        // С помощью команды remove из массива удаляються элементы
        list.remove("hello");
        System.out.println(list);
        // Почему в ArrayList возможно устанавливать любые значения?
        // Ответ достаточно прост. ArrayList  это массив Object[] именно поэтому мы можем установить
        //любые значения в него. Однако так делать категорически не рекомендуеться!!!!
    }
}
