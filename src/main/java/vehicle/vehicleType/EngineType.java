package vehicle.vehicleType;

public enum EngineType {

    PETROL("petrol"),
    DIESEL("diesel"),
    ELECTRIC("electricity"),
    HYBRID("petrol and electricity");

    private String fuelSource;

    EngineType(String fuelSource) {
        this.fuelSource = fuelSource;
    }

    public String getFuelSource() {
        return fuelSource;
    }
}
