package vehicle.vehicleType;

public enum TyreType {

    SUMMER(200),
    WINTER(400);

    private int price;

    TyreType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
