import Items.Accessory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AccessoryTest {

    private Accessory accessory;

    @Before
    public void before() {
        accessory = new Accessory(10.0, 15.50, "Drum Stick");
    }

    @Test

    public void canGetBoughtPrice() {
        assertEquals(10.0, accessory.getBoughtPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(15.50, accessory.getSellPrice(), 0.01);
    }

    @Test
    public void canGetItemName() {
        assertEquals("Drum Stick", accessory.getName());
    }

}
