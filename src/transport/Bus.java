package transport;

public class Bus extends Transport <DriverD> {
    private static Capacity capacity;

    public Bus(String brand, String model, double engineVolume, DriverD driver, Capacity capacity) {
        super(brand, model, engineVolume, driver);
        this.capacity = capacity;
    }

    public void startMoved() {
        System.out.println("Автобус " + getBrand() + " начал движение");
    }

    public void finishMoved() {
        System.out.println("Автобус " + getBrand() + " закончил движение");
    }


    public enum Capacity {
        VERY_SMALL(0, 10),
        SMALL(0, 25),
        AVERAGE(40, 50),
        BIG(60, 80),
        VERY_BIG(100, 120);
        private final int minPlaces;
        private final int maxPlaces;

        Capacity(int minPlaces, int maxPlaces) {
            this.minPlaces = minPlaces;
            this.maxPlaces = maxPlaces;
        }

        public int getMinPlaces() {
            return minPlaces;
        }

        public int getMaxPlaces() {
            return maxPlaces;
        }

        @Override
        public String toString() {
            String low = " от " + minPlaces;
            if (minPlaces == 0) {
                low = "";
            }
            String upp = " до " + maxPlaces;
            if (maxPlaces == 0) {
                upp = "";
            }
            return "Вместительность -" + low + upp + " мест.";
        }
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
    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println("Мест: " + capacity);
    }
}

