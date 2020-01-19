package Items.instrument;

public class Saxophone extends Instrument {

    public Saxophone(double boughtPrice, double sellPrice, String name) {
        super(boughtPrice, sellPrice, name);
    }

    public String play() {
        return "beebidydoobop";

    };

}
