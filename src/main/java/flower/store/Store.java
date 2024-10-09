package flower.store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Store {
    private final List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void addBucket(FlowerBucket bucket) {
        flowerBuckets.add(bucket);
    }

    public List<FlowerBucket> search(double maxPrice) {
        return flowerBuckets.stream()
                .filter(bucket -> bucket.getPrice() <= maxPrice) 
                .collect(Collectors.toList());
    }

    public List<FlowerBucket> getFlowerBuckets() {
        return Collections.unmodifiableList(flowerBuckets);
    }
}
