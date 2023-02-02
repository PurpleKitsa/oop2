package transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport <D extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private D driver;
    private final List<Mechanic> mechanics = new ArrayList<>();



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

    public List<Mechanic> getMechanics() {
        return mechanics;
    }
    public void addMechanic(Mechanic mechanic) {
        mechanics.add(mechanic);
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


