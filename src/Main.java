import transport.*;

public class Main {

    public static void main(String[] args) {
            Car lada = new Car("lada ", "Vesta", 1.6, driverB);
            Car fiat = new Car("fiat", "turbo", 2.6, driverB2);
            Car porshe = new Car("porshe", "sport", 3.0, driverB3);
            Car audi = new Car("audi", "nitro", 3.1, driverB3);
            System.out.println(lada);
            System.out.println(fiat);
            System.out.println(porshe);
            System.out.println(audi);

            Bus ladaB = new Bus("lada", "Speed", 1.8, driverD);
            Bus mazda = new Bus("mazda", "GTR", 2.0, driverD2);
            Bus nissan = new Bus("nissan", "Sport 2.0", 2.2, driverD3);
            Bus mitshubishi = new Bus("mitshubishi", "drift", 2.0, driverD4);

            System.out.println(ladaB);
            System.out.println(mazda);
            System.out.println(nissan);
            System.out.println(mitshubishi);

            Truck toyota = new Truck("toyota", "cube", 3.7, driverC);
            Truck bmw = new Truck("bmw", "legacy", 4.0, driverC2);
            Truck jeep = new Truck("jeep", "ultra", 3.9, driverC3);
            Truck ferrari = new Truck("ferrari", "musctang", 4.2, driverC4);

            System.out.println(toyota);
            System.out.println(bmw);
            System.out.println(jeep);
            System.out.println(ferrari);
            printInfo(lada);
        }
        private static void printInfo (Transport < ? > transport){
            System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
        }
    }
}
