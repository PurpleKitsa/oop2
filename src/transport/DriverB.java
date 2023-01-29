package transport;

public class DriverB extends Driver{

    public DriverB(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории B " + getName()+ " начал движение");

    }

    @Override
    public void stopMove() {
        System.out.println("Водитель категории B " + getName()+ " закончил движение");

    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории B " + getName()+ " заправляется");

    }
}
