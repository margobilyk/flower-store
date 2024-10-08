package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StoreTest {
    private Store store;

    @BeforeEach
    public void init() {
        store = new Store();
    }   

    @Test
    public void testSearch() {
        Flower flower = new Rose(0, null, 0);
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, 5);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
        store.addBucket(flowerBucket);
        
        Assertions.assertEquals(1, store.search(50).size());
        Assertions.assertEquals(0, store.search(30).size());

    
    }
}
