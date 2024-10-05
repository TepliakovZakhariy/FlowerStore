package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerSpecTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final double MAX_LENGTH = 100;
    private FlowerSpec flowerSpec;

    @BeforeEach
    public void init() {
        flowerSpec = new FlowerSpec();
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flowerSpec.setColor(color);
        Assertions.assertEquals(FlowerColor.RED, 
        flowerSpec.getColor());
    }

    @Test
    public void testType() {
        FlowerType type = FlowerType.CHAMOMILE;
        flowerSpec.setFlowerType(type);
        Assertions.assertEquals(type, flowerSpec.getFlowerType());
    }
    
    @Test
    public void testSepalLength() {
        double sepalLength = RANDOM_GENERATOR.nextDouble(MAX_LENGTH);
        flowerSpec.setSepalLength(sepalLength);
        Assertions.assertEquals(sepalLength, flowerSpec.getSepalLength());


    }

    @Test
    public void testMatches() {
        double first = RANDOM_GENERATOR.nextDouble(MAX_LENGTH);
        double second = RANDOM_GENERATOR.nextDouble(MAX_LENGTH);
        FlowerSpec fSpec = new FlowerSpec(FlowerColor.RED, 
        first, FlowerType.CHAMOMILE);
        FlowerSpec sSpec = new FlowerSpec(FlowerColor.RED, 
        second, FlowerType.CHAMOMILE);
        Assertions.assertFalse(fSpec.matches(sSpec));
    }
}
