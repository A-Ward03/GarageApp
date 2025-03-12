package model;

import java.util.Date;

public class Vehicle {
    private final String vin;   // Vehicle Identification Number
    private String currentRegistration; // Current registration number
    private String Make;    // Make of the vehicle
    private String model;   // Model of the vehicle
    private String colour;  // Colour of the vehicle
    private Date manufactureYear;   // Date of manufacture

    public Vehicle(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    public String getCurrentRegistration() {
        return currentRegistration;
    }

    public void setCurrentRegistration(String currentRegistration) {
        this.currentRegistration = currentRegistration;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Date getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(Date manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    @Override
    public String toString() {
        return "Vehicle - {" + this.getMake() + " " + this.getModel() + "}" +
                " VIN: " + this.getVin() +
                " Registration: " + this.getCurrentRegistration() +
                " Colour: " + this.getColour() +
                " Manufacture Year: " + this.getManufactureYear();
    }
}
