package core.hw.equalsandhash;

public class Engine implements Cloneable {
    private String engineName;
    private String engineType;
    private String engineVolume;
    private int engineQuantity;
    private boolean engineExist;

    private Engine() {

    }

    public Engine(String engineName, String engineType,
                  String engineVolume, int engineQuantity,
                  boolean engineExist) {
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

