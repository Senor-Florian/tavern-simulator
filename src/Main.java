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
        Beverage whiskey = new Beverage(10, 25);
        aengus.drink(seamus, whiskey);
        fianna.drink(seamus, whiskey);
        System.out.println(aengus);
        System.out.println(fianna);
        System.out.println(seamus);
        System.out.println(Barkeep.dirtyGlasses);
        aengus.drink(seamus, whiskey);
        fianna.drink(seamus, whiskey);
        System.out.println(aengus);
        System.out.println(fianna);
        System.out.println(seamus);
        System.out.println(Barkeep.dirtyGlasses);
        seamus.cleanGlass();
        seamus.cleanGlass();
        seamus.cleanGlass();
        seamus.cleanGlass();
        System.out.println(Barkeep.dirtyGlasses);
        aengus.goHome();
        fianna.goHome();
        System.out.println(aengus);
        System.out.println(fianna);
    }
}
