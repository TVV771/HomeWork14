import TransportTypeExeption.TransportTypeException;
import transport.*;

import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Mechanic mechanic1 = new Mechanic("Михаил", "Компания 1", "Автомобиль");
        Mechanic mechanic2 = new Mechanic("Иван", "Компания 2", "Автобус");
        Mechanic mechanic3 = new Mechanic("Игорь", "Компания 3", "Грузовик");

        Transport car1 = new Car("Бренд Автомобиля 1", "Модель Автомобиля 1", 3.2, null,BodyType.CROSSOVER,mechanic1);
        Transport car2 = new Car("Бренд Автомобиля 2", "Модель Автомобиля 2", 4.4, null, BodyType.COUPE,mechanic2);
        Transport bus1 = new Bus("Бренд Автобуса 3", "Модель Автобуса 2", 3.2, null,LoadCapacity.N1,mechanic3);
        Transport bus2 = new Bus("Бренд Автобуса 4", "Модель Автобуса 1", 4.4, null, LoadCapacity.N2,mechanic1);
        Transport truck1 = new Truck("Бренд Грузовика 5", "Модель Грузовика 1", 3.2, null,Size.XL,mechanic2);
        Transport truck2 = new Truck("Бренд Грузовика 6", "Модель Грузовика 2", 4.4, null,Size.XL,mechanic3);
        List<Mechanic> mechanic = new ArrayList<>();

        mechanic.add(mechanic1);
        mechanic.add(mechanic2);
        mechanic.add(mechanic3);

        for (Mechanic transport : mechanic) {
            System.out.println( transport+ " " + transport.getName() + transport.getCompany()  );
            System.out.println(Station.getQueue());
        }
        Map<Transport, Mechanic> map = new HashMap<>();

        for (Mechanic transport : mechanic) {
            map.put((Transport) mechanic, mechanic.get(Integer.parseInt("Povtor")));
        }



            try {
                checkTransport(car1,car2,bus1,bus2,truck1,truck2); }
            catch (TransportTypeException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }



        };



    public static void checkTransport(Transport... transports) throws TransportTypeException {
        int count = 0;
        for (Transport transport : transports) {
            try {
                if (transport.passDiagnostics()) {
                    count++;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Диагностику прошли " + count + " из " + transports.length + " автомобилей");
    }


}