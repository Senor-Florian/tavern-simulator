public class Main {

    public static void main(String[] args) {

        Human aengus = new Human("Aengus", 27, true, 25);
        Human fianna = new Human("Fianna", 25, false, 20);
        Barkeep seamus = new Barkeep("Séamus", 33, true, 50);

        System.out.println(aengus);
        System.out.println(fianna);
        System.out.println(seamus);

        aengus.goToTavern();
        fianna.goToTavern();
        seamus.goToTavern();

        Beverage coffee = new Beverage(2, 0);
        Beverage whiskey = new Beverage(10, 25);
        Mixed mixed1 = new Mixed(coffee, whiskey);

        aengus.drink(seamus, whiskey);
        fianna.drink(seamus, mixed1);

        System.out.println(aengus);
        System.out.println(fianna);
        System.out.println(seamus);
        Barkeep.getDirtyGlasses();

        aengus.drink(seamus, whiskey);
        fianna.drink(seamus, whiskey);
        fianna.banter(seamus);

        Bouncer ciaran = new Bouncer("Ciaran", 29, true, 50, true);

        ciaran.drink(seamus, whiskey);

        System.out.println(aengus);
        System.out.println(fianna);
        System.out.println(seamus);
        System.out.println(ciaran);
        Barkeep.getDirtyGlasses();

        seamus.cleanGlass();
        seamus.cleanGlass();
        seamus.cleanGlass();
        seamus.cleanGlass();

        Barkeep.getDirtyGlasses();

        fianna.banter(seamus);
        aengus.goHome();

        System.out.println(aengus);
        System.out.println(fianna);
    }
}
