package Radar;

public class ValidationService {
    double allowedSpeed;
    public void validateSpeed(Car vehicle) {

        if(vehicle.getCarType() == CarType.PRIVATE){
            allowedSpeed = 80;
        }
        else if (vehicle.getCarType() == CarType.TRUCK) {
            allowedSpeed = 60;
        }
        if(vehicle.getSpeed() > allowedSpeed){
            SpeedFine speedFine = new SpeedFine(vehicle.getSpeed(), allowedSpeed);
            vehicle.addFine(speedFine);
        }
    }


    public void validateSeatbelt (Car vehicle){
        if (vehicle.getSeatbeltStatus() == SeatbeltStatus.NOT_FASTENED) {
            SeatbeltFine seatbeltFine = new SeatbeltFine();
            vehicle.addFine(seatbeltFine);
        }
    }
}
