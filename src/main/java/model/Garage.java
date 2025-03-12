package model;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicle> garage;

    public Garage() {
        this.garage = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicles in garage: \n");
        for (Vehicle vehicle : garage) {
            sb.append(vehicle.toString() + "\n");
        }
        return sb.toString();
    }
}
