package Locations;

import Tourist.Tourist;

public class Sweden implements Locations {

    public int airFare = 250;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

}