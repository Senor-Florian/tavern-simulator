import drink.Beverage;

public class Human {

    private String name;
    private int age;
    private boolean gender;
    private int money;
    private int drunkenness;
    private boolean inTavern;
    public static int humanCount = 0;

    Human(String name, int age, boolean gender, int money) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.money = money;
        drunkenness = 0;
        inTavern = false;
        humanCount++;
    }

    public void drink(Barkeep barkeep) {
        if(inTavern) {
            money--;
            drunkenness++;
            Barkeep.dirtyGlasses++;
            barkeep.setMoney(barkeep.getMoney() + 1);
        } else {
            System.out.println(name + " not in the tavern yet.");
        }
        if(drunkenness >= 40) {
            sleep();
        }
    }

    public void drink(Barkeep barkeep, Beverage beverage) {
        if(inTavern) {
            money -= beverage.getPrice();
            drunkenness += beverage.getAlcoholStrength();
            Barkeep.dirtyGlasses++;
            barkeep.setMoney(barkeep.getMoney() + beverage.getPrice());
        } else {
            System.out.println(name + " not in the tavern yet.");
        }
        if(drunkenness >= 40) {
            sleep();
        }
    }

    public void sleep() {
        drunkenness = 0;
        System.out.println(name + " went to sleep.");
    }

    public void goToTavern() {
        if(inTavern) {
            System.out.println(name + " is already at the tavern.");
        } else {
            inTavern = true;
            System.out.println(name + " went to the tavern.");
        }
    }

    public void goHome() {
        if(!inTavern) {
            System.out.println(name + " is already at home.");
        } else {
            inTavern = false;
            System.out.println(name + " went home.");
        }
    }

    public void banter(Human human) {
        if(Bouncer.workingBouncers > 0) {
            System.out.println(name + " was thrown out for bantering.");
            goHome();
        } else {
            System.out.println("Your mother sucks dwarf cock, " + human.getName() + " - said " + name + ".");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDrunkenness() {
        return drunkenness;
    }

    public void setDrunkenness(int drunkenness) {
        this.drunkenness = drunkenness;
    }

    public boolean isInTavern() {
        return inTavern;
    }

    public void setInTavern(boolean inTavern) {
        this.inTavern = inTavern;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + (gender ? "male" : "female") +
                ", money=" + money +
                ", drunkenness=" + drunkenness +
                ", inTavern=" + inTavern +
                '}';
    }
}
