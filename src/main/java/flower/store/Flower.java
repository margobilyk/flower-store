package flower.store;

import lombok.Getter;
import lombok.Setter;


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
       this.color = color;
       this.price = price;
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
