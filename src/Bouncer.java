import drink.Beverage;

public class Bouncer extends Human{

    private boolean isWorking;
    static int workingBouncers = 0;

    public Bouncer(String name, int age, boolean gender, int money, boolean isWorking) {
        super(name, age, gender, money);
        this.isWorking = isWorking;
        workingBouncers++;
    }

    public void startWork() {
        if(isWorking) {
            System.out.println(getName() + " is already working.");
        } else {
            isWorking = true;
            System.out.println(getName() + " started working.");
        }
    }

    public void leaveWork() {
        if(!isWorking) {
            System.out.println(getName() + " is already not working.");
        } else {
            isWorking = false;
            System.out.println(getName() + " is not working anymore.");
        }
    }

    public void drink(Barkeep barkeep) {
        if(isWorking) {
            System.out.println(getName() + " is working, he cannot drink.");
        } else {
            super.drink(barkeep);
        }
    }

    public void drink(Barkeep barkeep, Beverage beverage) {
        if(isWorking && beverage.getAlcoholStrength() == 0) {
            super.drink(barkeep, beverage);
        } else if(!isWorking) {
            super.drink(barkeep, beverage);
        } else {
            System.out.println(getName() + " is working, he cannot drink.");
        }
    }


    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public static int getWorkingBouncers() {
        return workingBouncers;
    }

    public static void setWorkingBouncers(int workingBouncers) {
        Bouncer.workingBouncers = workingBouncers;
    }
}
