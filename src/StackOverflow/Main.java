package StackOverflow;

/**
 * Created by Артем on 19.09.2016.
 */
public class Main {
   static private int i = 0;

    public static void main(String[] args) {
        test();
        }
   private static void test(){
        System.out.println("test" + i ++);
        test();
    }
    }

