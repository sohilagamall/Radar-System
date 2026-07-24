package Radar;

public class SeatbeltFine extends Fine{

    public SeatbeltFine(){
        super(ViolationType.SEATBELT);
    }

    @Override
    public String getDescription(){
        return "Seatbelt not fastened: "
                + getViolationType().getFineAmount()
                + " EGP";
    }
}
