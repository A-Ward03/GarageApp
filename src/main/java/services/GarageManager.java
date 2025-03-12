package services;

import model.Garage;
import model.Vehicle;

import java.util.Scanner;

public class GarageManager {
    private Garage myGarage;
    private Scanner sc;

    public GarageManager() {
        this.myGarage = new Garage();
        this.sc = new Scanner(System.in);
    }

    public Garage getMyGarage() {
        return myGarage;
    }

    public void setMyGarage(Garage myGarage) {
        this.myGarage = myGarage;
    }

    public void addToGarage() {
        while (true) {
            System.out.println("What is your car vin?");
            String vin = sc.nextLine();
            if (vin.isEmpty()) {
                break;
            }
            addVehicleToGarage(vin);
        }
        System.out.println(myGarage);
    }

    private void addVehicleToGarage(String vin) {
        Vehicle newVehicle = new Vehicle(vin);
        myGarage.addVehicle(newVehicle);
        System.out.println("Would you like to provide the make & model? (yes/no)");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            getMakeAndModel(newVehicle);
        }
        System.out.println("Vehicle added to garage!");
    }

    private void getMakeAndModel(Vehicle vehicle) {
        System.out.println("What is the make & model of your vehicle?");
        String makeAndModel = sc.nextLine();
        if (makeAndModel.isEmpty() || !makeAndModel.contains(" ")) {
            System.out.println("Invalid input. Please provide both make and model.");
            return;
        }

        String[] split = makeAndModel.split(" ", 2);
        String make = split[0];
        String model = split[1];

        vehicle.setMake(make);
        vehicle.setModel(model);
    }

    public Scanner getScanner() {
        return sc;
    }
}
