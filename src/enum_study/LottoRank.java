package enum_study;

public enum LottoRank {
    FIRST(2000000000L),
    SECOND(30000000L),
    THIRD(1500000L),
    FOURTH(50000L),
    FIFTH(5000L),
    NONE(0L);

    // 값
    private final long price;

    // 생성자
    LottoRank(long price) {
        this.price = price;
    }

    // getter
    public long getPrice() {
        return price;
    }
}
