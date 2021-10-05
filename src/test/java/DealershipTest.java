import org.junit.Before;
import org.junit.Test;
import vehicle.Vehicle;
import vehicle.vehicleType.Electric;
import vehicle.vehicleType.Petrol;
import vehicle.vehicleType.TyreType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    ArrayList<Vehicle> vehicleArrayList;
    ArrayList<Vehicle> customerVehicleArrayList;
    Vehicle vehicle;
    Vehicle vehicle2;
    Customer customer;


    @Before
    public void before() {
        vehicleArrayList = new ArrayList<>();
        customerVehicleArrayList = new ArrayList<>();
        vehicle = new Electric("Tesla", "S", 2021, 75000.00, TyreType.SUMMER);
        vehicle2 = new Petrol("VW", "Golf", 2015, 6000.00, TyreType.SUMMER);
        dealership = new Dealership("Arnold CodeClan", 100000.00, vehicleArrayList);
        customer = new Customer("Tom Smith", 250000.00, customerVehicleArrayList);
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

    @Test
    public void canBuyCar() {
        dealership.buyVehicle(vehicle);
        assertEquals(1, dealership.getVehicleArrayList().size());
        assertEquals(25000.00, dealership.getTill(), 0.001);
    }

    @Test
    public void cannotBuyCar() {
        dealership.buyVehicle(vehicle);
        dealership.buyVehicle(vehicle);
        assertEquals(1, dealership.getVehicleArrayList().size());
        assertEquals(25000.00, dealership.getTill(), 0.001);
    }

    @Test
    public void canSellVehicleToCustomer() {
        dealership.addVehiclesToArrayList(vehicle);
        dealership.addVehiclesToArrayList(vehicle2);
        dealership.sellVehicleToCustomer(customer, 0);
        assertEquals(1, dealership.getVehicleArrayList().size());
        assertEquals(1, customer.getVehicles().size());
        assertEquals(175000.00, customer.getBudget(), 0.001);
        assertEquals(175000.00, dealership.getTill(), 0.001);
    }

    @Test
    public void dealershipRepairsVehicle
}
