package vehicle.vehicleTypeTest;

import org.junit.Before;
import org.junit.Test;
import vehicle.vehicleType.Hybrid;
import vehicle.vehicleType.TyreType;

import static org.junit.Assert.assertEquals;

public class HybridTest {

    Hybrid hybrid;

    @Before
    public void before() {
        hybrid = new Hybrid("Toyota", "Prius", 2019, 16000.00, TyreType.SUMMER);
    }

    @Test
    public void hasMake() {
        assertEquals("Toyota", hybrid.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Prius", hybrid.getModel());
    }

    @Test
    public void hasYear() {
        assertEquals(2019, hybrid.getYear());
    }

    @Test
    public void hasPrice() {
        assertEquals(16000.00, hybrid.getPrice(), 0.001);
    }

    @Test
    public void hasTyreType() {
        assertEquals(TyreType.SUMMER, hybrid.getTyreType());
    }

    @Test
    public void hasPetrolAndElectricEngine() {
        assertEquals("Petrol and Electricity", hybrid.getFuelSource());
    }
}

