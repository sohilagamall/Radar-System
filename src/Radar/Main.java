package Radar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ValidationService validationService = new ValidationService();
        Radar radar = new Radar(validationService);
        List<Car> vehicles = new ArrayList<>();

        vehicles.add(new Car("ABC123", CarType.PRIVATE, 94, SeatbeltStatus.NOT_FASTENED));
        vehicles.add(new Car( "XYZ789", CarType.PRIVATE, 75, SeatbeltStatus.FASTENED));
        vehicles.add(new Car("DEF456", CarType.PRIVATE, 85, SeatbeltStatus.FASTENED));
        vehicles.add(new Car("TRK111", CarType.TRUCK, 58, SeatbeltStatus.NOT_FASTENED));
        vehicles.add(new Car("TRK222", CarType.TRUCK, 72, SeatbeltStatus.FASTENED));

        System.out.println("\n---- Traffic Fines ----");
        for(Car c: vehicles) {
            radar.observe(c);
            System.out.println("Traffic fine for car " + c.getPlateNumber());
            System.out.println("Total amount: " + c.getTotalFineAmount() + " EGP");
            System.out.println("Violations: ");
            if (c.getFines().isEmpty()) {
                System.out.println("- No Violations");
            } else {
                for (Fine f : c.getFines()) {
                    System.out.println("- " + f.getDescription());
                }
            }
            System.out.println("\t\t-----------");
        }



        System.out.println("\nPlate number - total amount\n");
        for(Car c: vehicles){
            System.out.println("\t"+ c.getPlateNumber()+ " -> " + c.getTotalFineAmount()+ " EGP\t");
        }
        System.out.println("-----------------------------------");



        System.out.println("\tViolation Statistics\t\n");
        int speedCount = 0;
        int seatbeltCount = 0;
        for(Car c : vehicles){
            for(Fine f : c.getFines()){
                if(f.getViolationType() == ViolationType.SPEED){
                    speedCount++;
                }
                else if(f.getViolationType()== ViolationType.SEATBELT){
                    seatbeltCount++;
                }
            }
        }
        System.out.println("Speed violations\t: " + speedCount);
        System.out.println("Seatbelt violations\t: " + seatbeltCount);
        System.out.println("------------------------------------");
    }
}
