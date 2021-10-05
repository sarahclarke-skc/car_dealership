package vehicle;

import vehicle.vehicleType.EngineType;
import vehicle.vehicleType.TyreType;

public abstract class Vehicle {

    private String make;
    private String model;
    private int year;
    private double price;
    private TyreType tyreType;

    public Vehicle(String make, String model, int year, double price, TyreType tyreType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.tyreType = tyreType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public TyreType getTyreType() {
        return tyreType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTyreType(TyreType tyreType) {
        this.tyreType = tyreType;
    }

    public abstract String getFuelSource();
}
