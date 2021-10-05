import org.junit.Before;
import org.junit.Test;
import vehicle.Vehicle;
import vehicle.vehicleType.Electric;
import vehicle.vehicleType.TyreType;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    ArrayList<Vehicle> vehiclesArrayList;
    Vehicle vehicle;


    @Before
    public void before() {
        vehiclesArrayList = new ArrayList<>();
        customer = new Customer("Tom Smith", 250000.00, vehiclesArrayList);
    }

    @Test
    public void hasName() {
        assertEquals("Tom Smith", customer.getName());
    }

    @Test
    public void hasBudget() {
        assertEquals(250000.00, customer.getBudget(), 0.001);
    }

    @Test
    public void hasEmptyArrayList() {
        assertEquals(0, customer.getVehicles().size());
    }

    @Test
    public void canBuyCar() {
        vehicle = new Electric("Tesla", "S", 2021, 75000.00, TyreType.SUMMER);
        customer.buyVehicle(vehicle);
        assertEquals(1, customer.getVehicles().size());
        assertEquals(175000.00, customer.getBudget(), 0.001);
    }

    @Test
    public void cannotBuyCar() {
        vehicle = new Electric("Tesla", "S", 2021, 75000.00, TyreType.SUMMER);
        customer.buyVehicle(vehicle);
        customer.buyVehicle(vehicle);
        customer.buyVehicle(vehicle);
        customer.buyVehicle(vehicle);
        assertEquals(3, customer.getVehicles().size());
        assertEquals(25000.00, customer.getBudget(), 0.001);
    }

}
