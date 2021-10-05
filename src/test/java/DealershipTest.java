import org.junit.Before;
import org.junit.Test;
import vehicle.Vehicle;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    ArrayList<Vehicle> vehicleArrayList;

    @Before
    public void before() {
        vehicleArrayList = new ArrayList<>();
        dealership = new Dealership("Arnold CodeClan", 100000.00, vehicleArrayList);
    }

    @Test
    public void hasName() {
        assertEquals("Arnold CodeClan", dealership.getName());
    }

    @Test
    public void hasTill() {
        assertEquals(100000.00, dealership.getTill(), 0.001);
    }

    @Test
    public void hasEmptyVehicleList() {
        assertEquals(0, dealership.getVehicleArrayList().size());
    }
}
