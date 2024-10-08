package flower.store;

public class Chamomile extends Flower {
    public Chamomile(double sepalLength, FlowerColor color, double price) {
        super(sepalLength, color, price);
    }

    @Override
    public FlowerType getFlowerType() {
        return FlowerType.CHAMOMILE;
    }
}
