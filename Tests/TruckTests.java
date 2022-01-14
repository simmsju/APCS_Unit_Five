import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class TruckTests {
    private static Truck truckOne = new Truck("Beest1961");
    private static Truck truckTwo = new Truck("APCSA2020", 2700, 17, 9);

    @Test
    @Order(1)
    public void truckTestConstructorID() {
        assertEquals("Beest1961", truckOne.getTruckID());
        assertEquals(0.0, truckOne.getFuel());
        assertEquals(0.0, truckOne.getMpg());
        assertEquals(0.0, truckOne.getOdometer());
    }

    @Test
    @Order(2)
    public void truckTestConstructorParameters() {
        assertEquals("APCSA2020", truckTwo.getTruckID());
        assertEquals(9.0, truckTwo.getFuel());
        assertEquals(17.0, truckTwo.getMpg());
        assertEquals(2700.0, truckTwo.getOdometer());
    }

    @Test
    @Order(3)
    public void truckTestSetMPG() {
        truckOne.setMpg(21.9);
        assertEquals(21.9, truckOne.getMpg());
    }

    @Test
    @Order(4)
    public void truckTestEnoughFuel() {
        assertTrue(truckTwo.enoughFuel(30));
        assertFalse(truckTwo.enoughFuel(250));
    }

    @Test
    @Order(5)
    public void truckTestDrive() {
        assertEquals(1, truckTwo.drive(100));
        assertEquals(0, truckTwo.drive(100));
    }

    @Test
    @Order(6)
    public void truckTestFill() {
        truckTwo.fill();
        assertEquals(20, truckTwo.getFuel());
        assertEquals(16.88235294117647, Truck.getTotalFuel());
    }

    @Test
    @Order(7)
    public void truckTestFillSpecifyGallons() {
        truckTwo.drive(300);
        assertEquals(0, truckTwo.fill(19.5));
        assertEquals(2.352941176470587, truckTwo.getFuel());
        assertEquals(1, truckTwo.fill(15));
        assertEquals(17.352941176470587, truckTwo.getFuel());
    }

    @Test
    @Order(8)
    public void truckTestTotalFuel() {
        assertEquals(31.88235294117647, Truck.getTotalFuel());
    }

    @Test
    @Order(9)
    public void truckTestToString() {
        String expected = "Truck: APCSA2020\nOdometer: 3100.0\nMiles Per Gallon: 17.0\nFuel: 17.352941176470587";
        String actual = truckTwo.toString();
        assertEquals(expected, actual);
    }
}
