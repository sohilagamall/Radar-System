package Radar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Car {
    private String plateNumber;
    private CarType carType;
    private SeatbeltStatus seatbeltStatus;
    private double speed;
    private List<Fine> fines;


    public Car(String plateNumber, CarType carType, double speed, SeatbeltStatus seatbeltStatus) {
        this.plateNumber = plateNumber;
        this.carType = carType;
        this.speed = speed;
        this.fines = new ArrayList<>();
        this.seatbeltStatus = seatbeltStatus;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getSpeed() {
        return speed;
    }

    public SeatbeltStatus getSeatbeltStatus() {
        return seatbeltStatus;
    }

    public void addFine(Fine fine){
        fines.add(fine);
    }
    public List<Fine> getFines(){
        return fines;
    }

    public int getTotalFineAmount(){
        int total = 0;
        for(Fine f : fines){
            total+= f.getFineAmout();
        }
        return total;
    }
    public int getAllViolatedRules(){
        return fines.size();
    }
}
