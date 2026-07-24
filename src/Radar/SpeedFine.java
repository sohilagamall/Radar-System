package Radar;

public class SpeedFine extends Fine{
    private double actualSpeed;
    private double allowedSpeed;

    public SpeedFine(double actualSpeed, double allowedSpeed){
        super(ViolationType.SPEED);
        this.actualSpeed = actualSpeed;
        this.allowedSpeed = allowedSpeed;
    }

    @Override
    public String getDescription(){
        return "speed of "
                + (int)actualSpeed
                + " exceeded max allowed "
                + (int)allowedSpeed
                + ": " + getViolationType().getFineAmount()
                + " EGP";

    }

}
