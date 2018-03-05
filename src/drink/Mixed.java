package drink;

public class Mixed extends Beverage {

    public Mixed(Beverage b1, Beverage b2) {
        super((b1.getPrice() + b2.getPrice()) / 2,
                (b1.getAlcoholStrength() + b2. getAlcoholStrength()) / 2);
    }

    public Mixed(Beverage b1, Beverage b2, Beverage b3) {
        super((b1.getPrice() + b2.getPrice() + b3.getPrice()) / 3,
                (b1.getAlcoholStrength() + b2. getAlcoholStrength() + b3.getAlcoholStrength()) / 3);
    }

    public Mixed(Beverage b1, Beverage b2, Beverage b3, Beverage b4) {
        super((b1.getPrice() + b2.getPrice() + b3.getPrice() + b4.getPrice()) / 4,
                (b1.getAlcoholStrength() + b2. getAlcoholStrength() + b3.getAlcoholStrength() + b4.getAlcoholStrength()) / 4);
    }
}
