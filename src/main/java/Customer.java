import vehicle.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private Double budget;
    private ArrayList<Vehicle> vehicles;


    public Customer(String name, Double budget, ArrayList<Vehicle> vehicles) {
        this.name = name;
        this.budget = budget;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public Double getBudget() {
        return budget;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public void addVehicles(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}
