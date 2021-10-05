package vehicle.vehicleType;

import vehicle.Vehicle;

public class Hybrid extends Vehicle {

    private EngineType engineType;

    public Hybrid(String make, String model, int year, double price, TyreType tyreType) {
        super(make, model, year, price, tyreType);
        this.engineType = EngineType.HYBRID;
    }

    public String getFuelSource() {
        return engineType.getFuelSource();
    }
}
