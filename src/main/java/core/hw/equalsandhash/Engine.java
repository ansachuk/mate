package core.hw.equalsandhash;

public class Engine implements Cloneable {
    public String engineName;
    public String engineType;
    public String engineVolume;
    public int engineQuantity;
    public boolean engineExist;

    public Engine() {}

    public Engine(String engineName, String engineType, String engineVolume, int engineQuantity, boolean engineExist) {
        this.engineName = engineName;
        this.engineType = engineType;
        this.engineVolume = engineVolume;
        this.engineQuantity = engineQuantity;
        this.engineExist = engineExist;
    }

    @Override
    protected Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

