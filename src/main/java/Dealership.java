import behaviours.IBuyable;
import vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership implements IBuyable {

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

    public void vehiclePurchase(Vehicle vehicle) {
        this.till -= vehicle.getPrice();
    }

    public void vehicleSale(int index) {
        till += vehicleArrayList.get(index).getPrice();
    }

    public void addVehiclesToArrayList(Vehicle vehicle) {
        this.vehicleArrayList.add(vehicle);
    }

    public void buyVehicle(Vehicle vehicle) {
        if (till >= vehicle.getPrice()) {
            vehiclePurchase(vehicle);
            addVehiclesToArrayList(vehicle);
        }
    }

    public void removeVehicleFromArrayList(int index) {
        vehicleArrayList.remove(index);
    }

    public void sellVehicle(int index) {
        vehicleSale(index);
        removeVehicleFromArrayList(index);
    }

    public void sellVehicleToCustomer(IBuyable customer, int index) {
        customer.buyVehicle(getVehicleArrayList().get(index));
        this.sellVehicle(index);
    }


}

