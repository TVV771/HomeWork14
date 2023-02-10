import transport.*;

import javax.sound.midi.Track;

public class Main {
    public static void main(String[] args) {

        for (int i =1;i<=4;i++){
            DriverC driverC = new DriverC("Driver C" + i,true,10+i);
            Truck truck = new Truck(
                    "Truck brand N"+i,
                    "Truck model N"+i,
                    8.0,
                    driverC


            );
            DriverB driverB = new DriverB("Driver B" + i,true,5+i);
            Car car = new Car(
                    "Car brand N"+i,
                    "Car model N"+i,
                    1.7,
                    driverB
            );
            DriverD driverD = new DriverD("Driver D" + i,true,7+i);
            Bus bus = new Bus(
                    "Bus brand N"+i,
                    "Bus model N"+i,
                    4.0,
                    driverD


            );
            printInfo(car);
            printInfo(bus);
            printInfo(truck);



        };

    }
    private static void printInfo(Transport<?> transport){
        System.out.println("Водитель"+transport.getDriver().getName()+" А управляет автомобилем "+transport.getBrand()+" и будет учавствовать в заезде");
    }

}