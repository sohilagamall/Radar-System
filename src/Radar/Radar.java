package Radar;

public class Radar {
    private final ValidationService validationService;

    public Radar(ValidationService validationService){
        this.validationService = validationService;
    }

    public void observe(Car car){
        validationService.validateSpeed(car);
        validationService.validateSeatbelt(car);
    }

}
