package transport;

import java.sql.SQLOutput;

public class Car extends Transport {

    private double engineVolume;
    private String gear;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerOrWinter;
    private Key key;

    public Car(String brand, String model, double engineVolume, String color, int year, String country,String gear, String bodyType,String registrationNumber,int numberOfSeats, boolean summerOrWinter, boolean key, int maxSpeed) {
        super(brand, model, year, color, country, maxSpeed);


        setEngineVolume(engineVolume);
        setGear(gear);
        if (bodyType == null) {
            bodyType = "default";
        }
        this.bodyType = bodyType;
        setRegistrationNumber(registrationNumber);
        if (numberOfSeats <= 0){
            numberOfSeats = 4;
        }
        this.numberOfSeats= numberOfSeats;
        this.summerOrWinter = summerOrWinter;
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

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        if (gear == null) {
            gear = "default";
            this.gear = gear;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber== null) {
            registrationNumber = "a000aa00";
            this.registrationNumber = registrationNumber;
        }
    }

    public boolean isSummerOrWinter() {
        return summerOrWinter;
    }

    public void setSummerOrWinter(boolean summerOrWinter) {
        this.summerOrWinter = summerOrWinter;
    }
public void changeSummerOrWinter(int month) {
        if ((month >=11 && month <= 12) || (month >= 1 && month <=3)) {
          summerOrWinter = true;
    }
        if(month >= 4 && month <= 10) {
            summerOrWinter = false;
        }
        if (summerOrWinter = true){
            System.out.println("Зимняя резина");
        }else{
            System.out.println("Летняя резина");
        }
}
    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void changeTypeTire() {
        summerOrWinter = ! summerOrWinter;
    }


    public static class Key {
        public Key(boolean changeEngine, boolean wirelessKey) {
            this.changeEngine = changeEngine;
            if(changeEngine = true){
                System.out.println("Есть удалённый запуск двигателя");
            }else{
                System.out.println("Нет удалённый запуск двигателя");
            }

            this.wirelessKey = wirelessKey;
            if(wirelessKey = true){
                System.out.println("Есть бесключевой доступ");
            }else{
                System.out.println("Нет бесключевого доступа");
            }

        }

        private final boolean changeEngine;
        private final boolean wirelessKey;

    }
    public String toString() {
        return super.toString() + " , " + " Мощность двигателя " + engineVolume + "Коробка передач" + gear + " Тип кузова " + bodyType  + " Регистрационный номер " + registrationNumber  + " Количество мест " +numberOfSeats +
                " Резина " + summerOrWinter + " Доступ " + key;
    }
}

