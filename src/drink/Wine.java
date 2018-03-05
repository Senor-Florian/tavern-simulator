package drink;

public class Wine extends Beverage {

    /**
     * Class for Wine objects.
     */

    private int vintage;
    private String type;

    /**
     * Constructor of the Wine class.
     * @param price The price of the wine.
     * @param vintage The year which the wine is from.
     * @param type The type of the wine.
     */

    public Wine(int vintage, String type) {
        super(10, 10);
        this.vintage = vintage;
        this.type = type;
    }

    /**
     *
     * @return the wine's vintage
     */
    public int getVintage() {
        return vintage;
    }

    /**
     *
     * @param vintage set the wine's vintage
     */

    public void setVintage(int vintage) {
        if(vintage > 0) {
            this.vintage = vintage;
        } else {
            System.out.println("Vintage must be bigger than 0.");
        }

    }

    /**
     *
     * @return the type of the wine
     */

    public String getType() {
        return type;
    }

    /**
     *
     * @param type set the wine's type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return the stringified wine object
     */

    @Override
    public String toString() {
        return "drink.Wine{" +
                "vintage=" + vintage +
                ", type='" + type + '\'' +
                '}';
    }
}
