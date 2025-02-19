package Chapter_13_Abstraction.Interfaces;

public class ACController {
    private Temp_down_button tdb;
    private Temp_up_button tub;

    ACController(Temp_down_button tdb, Temp_up_button tub) {
        this.tdb = tdb;
        this.tub = tub;
    }

    public void onPressedTDButton() {
        tdb.onPressed();
    }

    public void onDownedTDButton() {
        tdb.onDown();
    }

    public void onPressedTUButton() {
        tub.onPressed();
    }

    public void onUppedTUButton() {
        tub.onUp();
    }
}
