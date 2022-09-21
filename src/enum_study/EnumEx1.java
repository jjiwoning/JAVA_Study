package enum_study;

public class EnumEx1 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("(d1 == d2) = " + (d1 == d2));
        System.out.println("(d1 == d3) = " + (d1 == d3));
        System.out.println("d1.equals(d3) = " + d1.equals(d3));
        System.out.println("d1.compareTo(d3) = " + d1.compareTo(d3));
        System.out.println("d1.compareTo(d2) = " + d1.compareTo(d2));

        switch (d1) {
            case EAST:
                System.out.println("동쪽입니다.");
                break;
            case WEST:
                System.out.println("서쪽입니다.");
                break;
            case SOUTH:
                System.out.println("남쪽입니다.");
                break;
            case NORTH:
                System.out.println("북쪽입니다.");
                break;
        }

        Direction[] values = Direction.values();
        for (Direction value : values) {
            System.out.println("value = " + value + ", " + value.ordinal());
        }
    }
}
