package Tourist;

import Locations.Boracay;
import Locations.Sweden;
import Locations.Greece;
import Locations.Russia;
import Locations.Italy;
import Locations.Spain;
import Locations.Locations;

public interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Boracay boracay);

    void visit(Sweden sweden);

    void visit(Greece greece);

    void visit(Russia russia);

    void visit(Italy italy);

    void visit(Spain spain);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location! Unpacking your luggage bags.");
    };

    void checkBudget();
}