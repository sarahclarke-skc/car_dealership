package vehicle;

import vehicle.vehicleType.EngineType;
import vehicle.vehicleType.TyreType;

public abstract class Vehicle {

    private String make;
    private String model;
    private int year;
    private double price;
    private TyreType tyreType;
    private double originalPrice;

    public Vehicle(String make, String model, int year, double price, TyreType tyreType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.tyreType = tyreType;
        this.originalPrice = originalPrice;
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

    public double getOriginalPrice() {
        return originalPrice;
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

    public void vehicleGetsDamaged(double damageCost) {
        this.originalPrice = this.price;
        this.price -= damageCost;
    }
}
