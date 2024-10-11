package flower.store;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @Setter
public class Chamomile extends Flower {
    public Chamomile(Flower flower) {
        super(flower);
        this.setFlowerType(FlowerType.CHAMOMILE);
    }
}
