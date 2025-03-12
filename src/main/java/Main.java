import model.Garage;
import model.Vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Garage myGarage = new Garage();

        while (true) {
            System.out.println("What is your car vin?");
            String vin = sc.nextLine();
            if (vin.isEmpty()) {
                break;
            }
            Vehicle newVehicle = new Vehicle(vin);
            myGarage.addVehicle(newVehicle);
            System.out.println("Would you like to provide the make & model?");
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

        System.out.println();
        System.out.println(myGarage);
    }
}
