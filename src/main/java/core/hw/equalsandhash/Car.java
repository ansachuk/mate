package core.hw.equalsandhash;

public class Car implements Cloneable {
    private String carName;
    private String carType;
    private String carVolume;
    private int carQuantity;
    private boolean carExist;

    private Engine engine;

    public Car() {

    }

    public Car(String carName, String carType, String carVolume,
               int carQuantity, boolean carExist) {
        this.carName = carName;
        this.carType = carType;
        this.carVolume = carVolume;
        this.carQuantity = carQuantity;
        this.carExist = carExist;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() {
        Car cloned = new Car();
        return cloned;
    }
}
