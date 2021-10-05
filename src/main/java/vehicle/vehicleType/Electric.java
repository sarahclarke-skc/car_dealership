package vehicle.vehicleType;

import vehicle.Vehicle;

public class Electric extends Vehicle {

    private EngineType engineType;

    public Electric(String make, String model, int year, double price, TyreType tyreType) {
        super(make, model, year, price, tyreType);
        this.engineType = EngineType.ELECTRIC;
    }

    public String getFuelSource() {
        return engineType.getFuelSource();
    }
}
