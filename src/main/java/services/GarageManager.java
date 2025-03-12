package services;

import model.Garage;
import model.Vehicle;

import java.util.Scanner;

public class GarageManager {
    private Garage myGarage;
    private Scanner sc;

    public  GarageManager() {
        this.myGarage = new Garage();
        this.sc = new Scanner(System.in);
    }

    public Garage getMyGarage() {
        return myGarage;
    }

    public void setMyGarage(Garage myGarage) {
        this.myGarage = myGarage;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public void addToGarage() {
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
                System.out.println("What is the make & model of your vehicle?");
                String makeAndModel = sc.nextLine();
                String[] split = makeAndModel.split(" ", 2);
                String make = split[0];
                String model = split[1];
                newVehicle.setMake(make);
                newVehicle.setModel(model);
            }
            System.out.println("Vehicle added to garage!");
        }
        System.out.println(myGarage);
    }

}
