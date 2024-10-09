package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;
import java.util.List;

public class StoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final double MAX_PRICE = 100.0;
    private Store store;

    @BeforeEach
    public void init() {
        store = new Store();
    }

    @Test
    public void testSearch() {
        Flower flower = new Rose(1, FlowerColor.RED, 
                                RANDOM_GENERATOR.nextDouble() * MAX_PRICE);
        FlowerPack flowerPack = new FlowerPack(flower, 1);
        FlowerBucket bucket = new FlowerBucket();
        bucket.add(flowerPack);
        store.addBucket(bucket);

        List<FlowerBucket> result = store.search(MAX_PRICE);
        
        Assertions.assertFalse(result.isEmpty());
        Assertions.assertTrue(result.contains(bucket));
    }
}
