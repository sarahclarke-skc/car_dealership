import org.junit.Before;
import org.junit.Test;

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

}
