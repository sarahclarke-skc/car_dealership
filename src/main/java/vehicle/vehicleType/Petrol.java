package vehicle.vehicleType;

import vehicle.Vehicle;

public class Petrol extends Vehicle {

    private EngineType engineType;

    public Petrol(String make, String model, int year, double price, TyreType tyreType) {
        super(make, model, year, price, tyreType);
        this.engineType = EngineType.PETROL;
    }

    public String getFuelSource() {
        return engineType.getFuelSource();
    }

}
