package flower.store;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @Setter
public class Tulip extends Flower {
    public Tulip(Flower flower) {
        super(flower);
        this.setFlowerType(FlowerType.TULIP);
    }
}
