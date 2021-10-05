import behaviours.IBuyable;
import vehicle.Vehicle;

import java.util.ArrayList;

public class Customer implements IBuyable {

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

    public void setBudget(Vehicle vehicle) {
        this.budget -= vehicle.getPrice();
    }

    public void addVehicles(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void buyVehicle(Vehicle vehicle) {
        if(this.budget >= vehicle.getPrice()) {
            addVehicles(vehicle);
            setBudget(vehicle);
        }
    }
}
