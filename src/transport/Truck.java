package transport;

public class Truck extends Transport<DriverC> {

    public Truck(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
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
}

