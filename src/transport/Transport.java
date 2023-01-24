package transport;

public abstract class Transport <D extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private D driver;



    public Transport(String brand, String model, double engineVolume, D driver) {
        this.brand = brand;
        if (brand == null) {
            brand = "default";
        }
        this.model = model;
        if (model == null) {
            model = "default";
        }
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
            return engineVolume;
        }

        public void setEngineVolume(double engineVolume) {
            if (engineVolume <= 0) {
                engineVolume = 1.5;
            }
            this.engineVolume = engineVolume;
        }

    public D getDriver() {
        return driver;
    }

    public void setDriver(D driver) {
        this.driver = driver;
    }

    public String toString() {
        return
                " Марка, " + brand +
                " Модель, " + model +
                " Мощность двигателя, " + engineVolume;
    }

    public abstract void startMoved();
    public abstract void finishMoved();
    public abstract void printType();
    public abstract boolean passDiagnostics() throws  DiagnosticFailedException;

}


