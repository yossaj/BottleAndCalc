import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle(100, 100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void isFull(){
        assertEquals(100, bottle.waterLevel());
    }

    @Test
    public void canTakeSip(){
        bottle.takeSip();
        assertEquals(90, bottle.waterLevel());
    }

    @Test
    public void canEmpty(){
        bottle.empty();
        assertEquals(0, bottle.waterLevel());
    }

    @Test
    public void canFill(){

        bottle.empty();
        bottle.fill();
        assertEquals(100, bottle.waterLevel());
    }

}
