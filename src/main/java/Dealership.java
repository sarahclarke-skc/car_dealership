import vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private Double till;
    private ArrayList<Vehicle> vehicleArrayList;

    public Dealership(String name, Double till, ArrayList<Vehicle> vehicleArrayList) {
        this.name = name;
        this.till = till;
        this.vehicleArrayList = vehicleArrayList;
    }

    public String getName() {
        return name;
    }

    public Double getTill() {
        return till;
    }

    public ArrayList<Vehicle> getVehicleArrayList() {
        return vehicleArrayList;
    }

    public void setTill(Double till) {
        this.till = till;
    }

    public void setVehicleArrayList(ArrayList<Vehicle> vehicleArrayList) {
        this.vehicleArrayList = vehicleArrayList;
    }
}

