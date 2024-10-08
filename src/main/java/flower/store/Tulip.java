package flower.store;

public class Tulip extends Flower {
    public Tulip(double sepalLength, FlowerColor color, double price) {
        super(sepalLength, color, price);
    }

    @Override
    public FlowerType getFlowerType() {
        return FlowerType.TULIP;
    }
}
