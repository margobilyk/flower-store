package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<FlowerBucket> allFlowerBucket;

    public Store() {
        allFlowerBucket = new ArrayList<>();
    }

    public void addBucket(FlowerBucket bucket) {
        allFlowerBucket.add(bucket);
    }

    public List<FlowerBucket> search(List<FlowerType> flowerTypes) {
        List<FlowerBucket> validBuckets = new ArrayList<>();
        for (FlowerBucket bucket : this.allFlowerBucket) {
            if (bucket.getFlowerTypes().equals(flowerTypes)) {
                validBuckets.add(bucket);
            }
        }
        return validBuckets;
    }
}
