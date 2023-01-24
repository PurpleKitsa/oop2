package transport;

public class Truck extends Transport<DriverC> {
    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, DriverC driver, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver);
        this.loadCapacity = loadCapacity;
    }

    public void startMoved() {
        System.out.println("Грузовик" + getBrand() + " начал движение");
    }

    public void finishMoved() {
        System.out.println("Грузовик " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузовика " + getBrand());

    }


    @Override
    public void bestTime() {
        System.out.println("Лучшее время кргуа у грузовика " + getBrand());

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у грузовика " + getBrand());

    }

    public enum LoadCapacity {
        N1(0, 3.5f),
        N2(3.5f, 12f),
        N3(12, 0);
        private final float lowerBound;
        private final float upperBound;

        LoadCapacity(float lowerBound, float upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public float getLowerBound() {
            return lowerBound;
        }

        public float getUpperBound() {
            return upperBound;
        }

        public String toString() {
            String low = " от " + lowerBound;
            if (lowerBound == 0) {
                low = "";
            }
            String upp = " до " + upperBound;
            if (upperBound == 0) {
                upp = "";
            }
            return "Грузоподъёмность -" + low + upp + " тонн.";
        }
    }
        public void printType() {
            if (loadCapacity == null) {
                System.out.println("Данных по транспортному средству недостаточно");
            }
            System.out.println("Грузоподъёмность: " + loadCapacity);
        }
        public LoadCapacity getLoadCapacity() {
            return loadCapacity;
        }
        public void setLoadCapacity(LoadCapacity loadCapacity) {
            if (loadCapacity == null) {
                loadCapacity = LoadCapacity.N1;
            }
        }
    @Override
    public boolean passDiagnostics() throws DiagnosticFailedException {
        if (getDriver() != null && getDriver().isDriverLicense()) {
            return true;
        }else {
            throw new DiagnosticFailedException();
        }
    }
}

