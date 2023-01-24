package transport;

import java.sql.SQLOutput;

public class Car extends Transport <DriverB> {
private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, DriverB driver,BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        this.bodyType = bodyType;
    }

    public void startMoved() {
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }

    public void finishMoved() {
        System.out.println("Автомобиль " + getBrand() + " закончил движение");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println("Кузов: " + bodyType);
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



    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        OFF_ROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивен");
        private final String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
            if (bodyType == null) {
                bodyType = "Неизвестно";
            }
        }
        @Override
        public String toString() {
            return "Тип кузова - " + getBodyType();
        }
        public String getBodyType() {
            return bodyType;
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



