import org.junit.Before;
import org.junit.Test;
import vehicle.Vehicle;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    ArrayList<Vehicle> vehiclesArrayList;


    @Before
    public void before() {
        vehiclesArrayList = new ArrayList<>();
        customer = new Customer("Tom Smith", 25000.00, vehiclesArrayList);
    }

    @Test
    public void hasName() {
        assertEquals("Tom Smith", customer.getName());
    }

    @Test
    public void hasBudget() {
        assertEquals(25000.00, customer.getBudget(), 0.001);
    }

    @Test
    public void hasEmptyArrayList() {
        assertEquals(0, customer.getVehicles().size());
    }

}
