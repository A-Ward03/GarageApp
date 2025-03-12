package services;

import model.Garage;
import model.Vehicle;

import java.util.Scanner;

public class GarageManager {
    private Garage myGarage;

    public  GarageManager() {
        this.myGarage = new Garage();
    }

    public Garage getMyGarage() {
        return myGarage;
    }

    public void setMyGarage(Garage myGarage) {
        this.myGarage = myGarage;
    }

    public void addToGarage() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("What is your car vin?");
            String vin = sc.nextLine();
            if (vin.isEmpty()) {
                break;
            }
            Vehicle newVehicle = new Vehicle(vin);
            myGarage.addVehicle(newVehicle);
            System.out.println("Would you like to provide the make & model? (yes/no)");
            String answer = sc.nextLine();
            if (answer.toLowerCase().equals("yes")) {
                getMakeAndModel(newVehicle);
            }
            System.out.println("Vehicle added to garage!");
        }
        System.out.println(myGarage);
    }

    public void getMakeAndModel(Vehicle vehicle) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the make & model of your vehicle?");
        String makeAndModel = sc.nextLine();

        String[] split = makeAndModel.split(" ", 2);
        String make = split[0];
        String model = split[1];

        vehicle.setMake(make);
        vehicle.setModel(model);
    }

}
