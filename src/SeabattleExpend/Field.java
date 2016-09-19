package SeabattleExpend;

/**
 * Created by Артем on 19.09.2016.
 */
public class Field {
    public static int SIZE = 20;
    char[] cells = new char[SIZE];
    Ship[] ships = new Ship[4];

    void initArr() {
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
    }

    void mainGameCircle() {
        for (int i = 0; i < ships.length; i++) {
            Ship tempShip = new Ship();
            boolean isIntersect;
            do {
                isIntersect = false;
                tempShip.setRandomShiAndSize();
                for (int j = 0; j < i; j++) {
                    if (tempShip.isShipsAreIntersect(ships[j])) {
                        isIntersect = true;
                    }
                }
            } while (isIntersect);
            draw(tempShip);
            ships[i] = tempShip;
        }
    }

    private void draw(Ship tempShip) {
        for (int i = 0; i < tempShip.size; i++) {
            cells[tempShip.firstShipCoordinate + i] = 'X';
        }
    }
    void show(){
        System.out.println(cells);
    }

    void doShoot(int shoot){
        switch (cells[shoot]) {
            case '.':
                System.out.println("");
                cells[shoot] = '@';
                show();
                break;
            case 'X':
                System.out.println("");
                cells[shoot] = '!';
                show();
                break;
            case '@':
                System.out.println("");
                break;
            default:
                System.out.println("");
        }

    }

        boolean isGameNotOver(){
            for (char cell : cells) {
                if (cell == 'X') {
                    return true;
                }
            }
            return false;
        }




}


