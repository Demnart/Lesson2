package GettersSetters;

/**
 * Created by Артем on 19.09.2016.
 */
public class Date {// Принцип инкапсуляции
   private int day;
   private int month;
   private int year;

    // JavaBean подход когда есть приватные переменные
    // и у них есть геттеры и сеттеры
    //Геттеры и сеттеры необходимы для того,чтобы не дать возможность напрямую установить значения это пункт 1, а во вторых
    // осуществит проверку если такая необходима

    public void setMonth(int month) {

        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDay(int day) {
        if (day > 0 && day < 32) {
        this.day = day;  // Наша проверка котороя не позволит установить ноль дней или более 31 дня
        }
    }

    public int getYear() {

        return year;
    }

    public int getMonth() {

        return month;
    }

    public int getDay() {

        return day;
    }
}
