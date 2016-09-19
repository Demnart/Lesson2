package SeabattleExpend;

import java.util.Random;

/**
 * Created by Артем on 19.09.2016.
 */
public class Ship {
    int size;
    int firstShipCoordinate;
    int endShipCoordinate;

    void setRandomShiAndSize(){
        Random random = new Random();
        size = 1 + random.nextInt(3);
        firstShipCoordinate = random.nextInt(Field.SIZE - size + 1);
        endShipCoordinate = firstShipCoordinate + size;
    }

    boolean isShipsAreIntersect(Ship ship){
        if (firstShipCoordinate > ship.endShipCoordinate +1) {
            return false;
        }
        if (endShipCoordinate + 1 < ship.firstShipCoordinate) {
            return false;
        }
        return true;
    }
}
