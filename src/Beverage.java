public class Beverage {

    private int price;
    private int alcoholStrength;

    public Beverage(int price, int alcoholStrength) {
        this.price = price;
        this.alcoholStrength = alcoholStrength;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAlcoholStrength() {
        return alcoholStrength;
    }

    public void setAlcoholStrength(int alcoholStrength) {
        this.alcoholStrength = alcoholStrength;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "price=" + price +
                ", alcoholStrength=" + alcoholStrength +
                '}';
    }
}
