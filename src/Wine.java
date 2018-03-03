public class Wine extends Beverage {

    public  int vintage;

    public Wine(int price, int alcoholStrength, int vintage) {
        super(price, alcoholStrength);
        this.vintage = vintage;
    }

    public int getVintage() {
        return vintage;
    }

    public void setVintage(int vintage) {
        this.vintage = vintage;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "vintage=" + vintage +
                '}';
    }
}
