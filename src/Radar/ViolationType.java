package Radar;

public enum ViolationType {
    SEATBELT(100),
    SPEED(300);
    private final int fineAmount;
    ViolationType(int fineAmount){
        this.fineAmount = fineAmount;
    }

    public int getFineAmount() {
        return fineAmount;
    }
}
