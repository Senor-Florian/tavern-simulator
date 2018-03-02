public class Barkeep extends Human {

    static int dirtyGlasses = 0;

    public Barkeep(String name, int age, boolean gender, int money) {
        super(name, age, gender, money);
    }

    public void cleanGlass() {
        if(dirtyGlasses > 0) {
            dirtyGlasses--;
            System.out.println("Cleaned a dirty glass.");
        } else {
            System.out.println("There are no dirty glasses.");
        }
    }
}
