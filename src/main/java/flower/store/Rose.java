package flower.store;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @Setter
public class Rose extends Flower {
    public Rose(Flower flower) {
        super(flower);
        this.setFlowerType(FlowerType.ROSE);
    }
}
