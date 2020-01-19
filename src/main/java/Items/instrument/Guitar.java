package Items.instrument;

import Items.Accessory;

public class Guitar extends Instrument {

    private Accessory accessory;

    public Guitar(double boughtPrice, double sellPrice, String name) {
        super(boughtPrice, sellPrice, name);
    }

    public String play(Accessory accessory) {
        return "Beeeeewwwwdeeewww beeeeeewwwwdeewww dweee dweeeddeedoooo";
    }

}
