package drink;

public class Aszu extends Wine {

    /**
     * Class for Aszu objects.
     */

    private int grapeBasket;

    /**
     *
     * @param vintage The year which the wine is from.
     * @param grapeBasket Determines the sugar level of the wine.
     */

    public Aszu(int vintage, int grapeBasket) {
        super(vintage, "aszú");
        this.grapeBasket = grapeBasket;
    }

    /**
     *
     * @return the grape basket count
     */

    public int getGrapeBasket() {
        return grapeBasket;
    }

    /**
     *
     * @param grapeBasket set the wine's basket count
     */

    public void setGrapeBasket(int grapeBasket) {
        if(3 <= grapeBasket && grapeBasket <= 6) {
            this.grapeBasket = grapeBasket;
        } else {
            System.out.println("The grape basket count must be between 3 and 6.");
        }
    }

    /**
     *
     * @return the stringified aszu object
     */

    @Override
    public String toString() {
        return "Aszu{" +
                "grapeBasket=" + grapeBasket +
                '}';
    }
}
