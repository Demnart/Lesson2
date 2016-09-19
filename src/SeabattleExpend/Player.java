package SeabattleExpend;

import java.util.Scanner;

/**
 * Created by Артем on 19.09.2016.
 */
public class Player {

    public int doShoot(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite koordinati");
        String s = scanner.nextLine();
        System.out.println("Koordinati prinati");
        int shoot = Integer.parseInt(s);
        return shoot;
    }
}
