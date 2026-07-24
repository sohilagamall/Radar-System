package Radar;

import java.time.LocalDate;
import java.util.List;

public abstract class Fine {
    private ViolationType violationType;
    private LocalDate date;

    public Fine(ViolationType violationType){
        this.violationType = violationType;
        this.date = LocalDate.now();
    }

    public abstract String getDescription();

    public ViolationType getViolationType() {
        return violationType;
    }

    public int getFineAmout(){
        return violationType.getFineAmount();
    }
}
