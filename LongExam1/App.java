import Tourist.*;

import javax.tools.JavaFileManager.Location;

import Locations.*;

public class App {
    public static void main(String[] args) throws Exception {

        Tourist me = new Me();

        Locations boracay = new Boracay();
        Locations sweden = new Sweden();
        Locations greece = new Greece();
        Locations italy = new Italy();
        Locations russia = new Russia();
        Locations spain = new Spain();

        boracay.accept(me);
        russia.accept(me);
        sweden.accept(me);
        italy.accept(me);
        greece.accept(me);
        spain.accept(me);

    }
}

// 1. Add 5 new locations to visit
// 2. Each location should have an airFare.
// 3. Each time you visit a new location, your budget should decrease.
// 4. In the visit method, print a message if you can visit the new location and
// print another message if you cannot visit the location.
// 5. Each time you visit a location, call the checkBudgetMethod