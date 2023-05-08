package Tourist;

import Locations.Boracay;
import Locations.Sweden;
import Locations.Greece;
import Locations.Russia;
import Locations.Locations;
import Locations.Italy;
import Locations.Spain;

public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {

        if (budget < 100) {
            System.out.print("You have insufficient funds for this excursion.");
            System.exit(0);
        } else
            System.out.println("Enjoying my stay!");

    }

    public void visit(Boracay boracay) {

        System.out.println("The fare to Boracay costs $" + boracay.airFare + " dollars.");
        visit();
        budget -= boracay.airFare;
        checkBudget();

    }

    public void visit(Italy italy) {

        System.out.println("The fare to Italy costs $" + italy.airFare + " dollars.");
        visit();
        budget -= italy.airFare;
        checkBudget();

    }

    public void visit(Greece greece) {

        System.out.println("The fare to Greece costs $" + greece.airFare + " dollars.");
        visit();
        budget -= greece.airFare;
        checkBudget();

    }

    public void visit(Russia russia) {

        System.out.println("The fare to Russia costs $" + russia.airFare + " dollars.");
        visit();
        budget -= russia.airFare;
        checkBudget();

    }

    public void visit(Sweden sweden) {

        System.out.println("The fare to Sweden costs $" + sweden.airFare + " dollars.");
        visit();
        budget -= sweden.airFare;
        checkBudget();
    }

    public void visit(Spain spain) {

        System.out.println("The fare to Spain costs $" + spain.airFare + " dollars.");
        visit();
        budget -= spain.airFare;
        checkBudget();

    }

    public void checkBudget() {
        budget -= Locations.airFare;
        System.out.println("I have $" + budget + " dollars left.\n");
    }

}