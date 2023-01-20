import transport.Bus;
import transport.Car;

public class Main {

    public static void main(String[] args) {
        Car lada = new Car(" Lada ", " Granta ", 1.7, " Жёлтый ", 2015, " Россия ","Ручная", " Cедан ","a000a12",4,false,false,120);
        Car audi = new Car(" Audi ", " A8 50L TDI quattro ", 3.0, " Чёрный ", 2020, " Германия ","Автомат"," Cедан ","ab001aa11",5,true,false,220);
        Car bmw = new Car(" BMW ", " Z8 ", 3.0, " Чёрный ", 2021, " Германия ","Ручная"," Cедан ","b000aa12",5,true,true,170);
        Car kia = new Car(" Kia ", " Sportage 4-го поколения ", 2.4, " Красный ", 2018, " Южная  Корея "," Ручная ","Внедорожник","c123ab12",4,false,true,190);
        Car hyundai = new Car(" Hyundai ", " Avante ", 1.6, " Оранжевый " , 2016, " Южная Корея ","Ручная", " Cедан ","b020a17",4,false,false,150);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println(lada);
        Bus ladaB= new Bus("Lada","Bus",2002,"Россия","Беылй",120);
        Bus gazel = new Bus("Gazel","Bus",2000,"Россия","Красный",150);
        Bus fiat  = new Bus("fiat","Bus",1999,"Италия","Жёлтый",200);
        System.out.println(ladaB);
        System.out.println(gazel);
        System.out.println(fiat);

    }
}
