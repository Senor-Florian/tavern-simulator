import drink.*;

public class Main {

    /**
     *
     * @param wine Prints out the wine objects.
     */

    public static void printWine (Wine wine){
        System.out.println(wine);
    }


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

        /**
         * Creates wine objects from the arguments.
         */

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("aszu")) {
                Aszu aszu = new Aszu(Integer.parseInt(args[i + 1]), Integer.parseInt(args[i + 2]));
                printWine(aszu);
                i += 2;
            } else {
                Wine wine = new Wine(Integer.parseInt(args[i + 1]), args[i]);
                printWine(wine);
                i += 1;
            }
        }
    }

}
