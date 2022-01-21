import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SquareAndItemTests {
    @Test
    @Order(1)
    public void squareAreaTest() {
        Square s = new Square(3.5);
        double expected = 12.25;
        double actual = s.calculateArea();
        assertEquals(expected, actual);
    }

    /*

        @Test
    @Order(2)
    public void itemTestPositivePrice() {
        Item i = new Item("3456", "Gizmo", 3.75);
        double expected = 37.5;
        double actual = i.getTotalPrice(10);
        assertEquals(expected, actual);
    }

    @Test
    @Order(3)
    public void itemTestNegativePrice() {
        Item i = new Item("3456", "Gizmo", -3.75);
        double expected = 0;
        double actual = i.getTotalPrice(10);
        assertEquals(expected, actual);
    }

    @Test
    @Order(4)
    public void itemTestNegativeQuantity() {
        Item i = new Item("3456", "Gizmo", 3.75);
        double expected = 0;
        double actual = i.getTotalPrice(-4);
        assertEquals(expected, actual);
    }

     */
}
