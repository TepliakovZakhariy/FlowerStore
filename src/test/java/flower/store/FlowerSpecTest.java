package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerSpecTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final double MAX_LENGTH = 100;

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
