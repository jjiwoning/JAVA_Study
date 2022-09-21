package enum_study;

public class Unit {
    int x, y;
    Direction direction;

    void move() {
        switch (direction) {
            case EAST:
                x++;
                break;
            case WEST:
                x--;
                break;
            case SOUTH:
                y++;
                break;
            case NORTH:
                y--;
                break;
        }
    }

}

enum Direction {
    EAST(1), SOUTH(5), WEST(-1), NORTH(10);

    private final int value;

    Direction(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

