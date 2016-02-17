package dcll.mgri;

/**
 * Created by Mayeul on 2/17/2016.
 */
public class Item {
    private int value;

    Item(int value) {
        setValue(value);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
