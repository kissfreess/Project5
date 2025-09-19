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
        List<Apple> greenApples = appleWarehouse.findApplesByColor("green");
        List<Integer> weightOfGreenApples = List.of(200, 90, 50);

        Assert.assertEquals(3, greenApples.size());

        for (Apple greenApple : greenApples) {
            assertEquals("green", greenApple.getColor());
        }

        for (Apple greenApple : greenApples) {
            assertTrue(weightOfGreenApples.contains(greenApple.getWeight()));
        }
    }

    @Test
    public void findRedApples(){
        List<Apple> redApples = appleWarehouse.findApplesByColor("red");
        List<Integer> weightOfRedApples = List.of(100, 160, 200);

        assertEquals(3, redApples.size());

        for (Apple redApple : redApples) {
            assertEquals("red", redApple.getColor());
        }

        for (Apple redApple : redApples) {
            assertTrue(weightOfRedApples.contains(redApple.getWeight()));
        }
    }

    @Test
    public void findYellowApples(){
        List<Apple> yellowApples = appleWarehouse.findApplesByColor("yellow");
        List<Integer> weightOfYellowApples = List.of(50, 170);

        assertEquals(2, yellowApples.size());

        for (Apple yellowApple : yellowApples) {
            assertEquals("yellow", yellowApple.getColor());
        }

        for (Apple yellowApple : yellowApples) {
            assertTrue(weightOfYellowApples.contains(yellowApple.getWeight()));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrongColor(){
        appleWarehouse.findApplesByColor("blue");
        appleWarehouse.findApplesByWeight("medium");
    }

}