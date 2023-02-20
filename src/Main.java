import TransportTypeExeption.TransportTypeException;
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
                    driverC,
                    Size.XL





            );
            DriverB driverB = new DriverB("Driver B" + i,true,5+i);
            Car car = new Car(
                    "Car brand N"+i,
                    "Car model N"+i,
                    1.4,driverB,
                    BodyType.SEDAN






            );
            DriverD driverD = new DriverD("Driver D" + i,true,7+i);
            Bus bus = new Bus(
                    "Bus brand N"+i,
                    "Bus model N"+i,
                    4.0,
                    driverD,
                    LoadCapacity.N1

            );





        };


    }
    public static void checkTransport(Transport... transports) throws TransportTypeException {
        int count = 0;
        for (Transport transport : transports) {
            try {
                if (transport.diagnostics()) {
                    count++;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Диагностику прошли " + count + " из " + transports.length + " автомобилей");
    }

    }




