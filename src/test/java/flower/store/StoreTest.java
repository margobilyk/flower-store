package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        Flower flower = new Rose();
        FlowerPack flowerPack = new FlowerPack(flower, 1);
        FlowerBucket bucket = new FlowerBucket();
        bucket.add(flowerPack);
        store.addBucket(bucket);

        List<FlowerType> searchTypes = new ArrayList<>();
        searchTypes.add(flower.getFlowerType());

        List<FlowerBucket> result = store.search(searchTypes);
        
        Assertions.assertFalse(result.isEmpty());
        Assertions.assertTrue(result.contains(bucket));
    }
}
