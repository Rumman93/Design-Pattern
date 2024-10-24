package prototype;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 24 Oct 2024
 */
public class TwoWheelerVehicle extends Vehicle {
    private boolean isElectric;


    public TwoWheelerVehicle(String engine, String model, long price, boolean isElectric) {
        super(engine, model, price);
        this.isElectric = isElectric;
    }
}
