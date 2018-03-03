public class Student extends Human{

    private int scholarShip;

    public Student(String name, int age, boolean gender, int money, int scholarShip) {
        super(name, age, gender, money);
        this.scholarShip = scholarShip;
    }

    public void study() {
        setMoney(getMoney() + scholarShip);
    }

    public void study(int howMuch) {
        setMoney(getMoney() + scholarShip * howMuch);
    }

    public int getScholarShip() {
        return scholarShip;
    }

    public void setScholarShip(int scholarShip) {
        this.scholarShip = scholarShip;
    }

    @Override
    public String toString() {
        return "Student{" +
                "scholarShip=" + scholarShip +
                '}';
    }
}
