import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle waterBottle;

    @Before
    public void setUp() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void StartVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void DrinkWorks() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void canEmptyValue() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }
}