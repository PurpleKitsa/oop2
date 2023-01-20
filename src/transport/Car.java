package transport;

import java.sql.SQLOutput;

public class Car extends Transport<DriverB> {


    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    public void startMoved() {
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }
    public void finishMoved() {
        System.out.println("Автомобиль " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у машины " + getBrand());


    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время круга у машины" + getBrand());

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у машины " + getBrand());

    }
}

