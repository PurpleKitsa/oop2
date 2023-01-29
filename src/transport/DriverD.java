package transport;

public class DriverD extends Driver{
    public DriverD(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории D " + getName()+ " начал движение");

    }

    @Override
    public void stopMove() {
        System.out.println("Водитель категории D " + getName()+ " закончил движение");

    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории D " + getName()+ " заправляется");

    }
}
