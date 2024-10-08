package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void addBucket(FlowerBucket bucket) {
        flowerBuckets.add(bucket);
    }

    public List<FlowerBucket> search(double maxPrice){
        return flowerBuckets.stream()
                .filter(bucket -> bucket.getPrice() <= maxPrice)
                .toList();
    }

    public List<FlowerBucket> getFlowerBuckets() {
        return flowerBuckets;
    }

}
