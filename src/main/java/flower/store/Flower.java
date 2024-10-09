package flower.store;

import lombok.Setter;
import lombok.Getter;


@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(double sepalLength, FlowerColor color, double price) {
       this.sepalLength = sepalLength;
       this.price = price;
       this.color = color;
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
