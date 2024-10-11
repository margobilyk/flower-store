package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @NoArgsConstructor @AllArgsConstructor
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.flowerType = flower.flowerType;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.price = flower.price;
    }

    public String getColor() {
        return color.toString();
    }

    public double getPrice() {
        return price;
    }

    public FlowerType getFlowerType() {
        return flowerType;
    }

}
