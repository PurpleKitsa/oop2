package transport;

public class Bus extends Transport <DriverD> {
    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    public void startMoved() {
        System.out.println("Автобус " + getBrand() + " начал движение");
    }
    public void finishMoved() {
        System.out.println("Автобус " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса " + getBrand());

    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время круга у автобуса" + getBrand());

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у автобуса " + getBrand());

    }
}

