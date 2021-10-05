package vehicle.vehicleType;

public enum EngineType {

    PETROL("Petrol"),
    DIESEL("Diesel"),
    ELECTRIC("Electricity"),
    HYBRID("Petrol and Electricity");

    private String fuelSource;

    EngineType(String fuelSource) {
        this.fuelSource = fuelSource;
    }

    public String getFuelSource() {
        return fuelSource;
    }
}
