package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StoreTest {
    private static final double TEST_NUMBER = 10;
    private Store store;
    private FlowerBucket flowerBucket;
    private FlowerSpec flowerSpec;
    private Flower flower;
    private FlowerPack flowerPack;

    @BeforeEach
    public void setUp() {
        flowerSpec = new FlowerSpec(FlowerColor.RED, 
        TEST_NUMBER, FlowerType.ROSE);
        flower = new Flower(0, flowerSpec);
        flowerPack = new FlowerPack(flower, (int) TEST_NUMBER);
        flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
        store = new Store(flowerBucket);
    }

    @Test
    public void testSearchFlowerFound() {
        FlowerSpec searchSpec = new FlowerSpec(FlowerColor.RED, 
        TEST_NUMBER, FlowerType.ROSE);
        FlowerPack[] result = store.search(searchSpec);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(1, result.length);
        Assertions.assertEquals(flowerPack, result[0]);
    }

    @Test
    public void testSearchFlowerNotFound() {
        FlowerSpec searchSpec = new FlowerSpec(FlowerColor.BLUE, 
        TEST_NUMBER, FlowerType.ROSE);
        FlowerPack[] result = store.search(searchSpec);
        Assertions.assertNotEquals(flowerPack, result[0]);
    }
}
