package vehicle;

import org.junit.Before;
import org.junit.Test;
import vehicle.vehicleType.Petrol;
import vehicle.vehicleType.TyreType;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Vehicle vehicle;

    @Before
    public void before() {
        vehicle = new Petrol("VW", "Golf", 2015, 6000.00, TyreType.SUMMER);
    }

    @Test
    public void hasMake() {
        assertEquals("VW", vehicle.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Golf", vehicle.getModel());
    }

    @Test
    public void hasYear() {
        assertEquals(2015, vehicle.getYear());
    }

    @Test
    public void hasPrice() {
        assertEquals(6000.00, vehicle.getPrice(), 0.001);
    }

    @Test
    public void hasTyreType() {
        assertEquals(TyreType.SUMMER, vehicle.getTyreType());
    }

    @Test
    public void hasPetrolEngine() {
        assertEquals("Petrol", vehicle.getFuelSource());
    }

    @Test
    public void decreasesValueAfterDamage() {
        vehicle.vehicleGetsDamaged(500.00);
        assertEquals(5500.00, vehicle.getPrice(),0.001);
    }
}
