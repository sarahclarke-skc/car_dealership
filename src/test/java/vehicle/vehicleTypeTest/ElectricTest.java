package vehicle.vehicleTypeTest;

import org.junit.Before;
import org.junit.Test;
import vehicle.vehicleType.Electric;
import vehicle.vehicleType.TyreType;

import static org.junit.Assert.assertEquals;

public class ElectricTest {

    Electric electric;

    @Before
    public void before() {
        electric = new Electric("Tesla", "S", 2021, 75000.00, TyreType.SUMMER);
    }

    @Test
    public void hasMake() {
        assertEquals("Tesla", electric.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("S", electric.getModel());
    }

    @Test
    public void hasYear() {
        assertEquals(2021, electric.getYear());
    }

    @Test
    public void hasPrice() {
        assertEquals(75000.00, electric.getPrice(), 0.001);
    }

    @Test
    public void hasTyreType() {
        assertEquals(TyreType.SUMMER, electric.getTyreType());
    }

    @Test
    public void hasPetrolAndElectricEngine() {
        assertEquals("Electricity", electric.getFuelSource());
    }
}

