import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AppleWarehouseTest {
    private static AppleWarehouse appleWarehouse;

    @BeforeClass
    public static void creteAppleWarehouse(){
        appleWarehouse = new AppleWarehouse();
    }

    @Test
    public void findGreenApples(){
        List<Apple> greenApples = appleWarehouse.findGreenApples();
        List<Integer> weightOfGreenApples = List.of(200, 90, 50);

        Assert.assertEquals(3, greenApples.size());

        for (Apple greenApple : greenApples) {
            assertEquals("green", greenApple.getColor());
        }

        for (Apple greenApple : greenApples) {
            assertTrue(weightOfGreenApples.contains(greenApple.getWeight()));
        }

    }
}