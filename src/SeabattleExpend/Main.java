package SeabattleExpend;

/**
 * Created by Артем on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Ship ship = new Ship();
        Field field = new Field();

        field.initArr();
        field.mainGameCircle();


        do {
            field.show();
            int shoot = player.doShoot();
            field.doShoot(shoot);
        } while (field.isGameNotOver());
    }
}
