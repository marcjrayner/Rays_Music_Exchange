package Items.instrument;

import Items.Item;
import Items.instrument.IPlay;

public abstract class Instrument extends Item implements IPlay {

    public Instrument(double boughtPrice, double sellPrice, String name) {
        super(boughtPrice, sellPrice, name);
    }

    public abstract String play();
}
