import TransportTypeExeption.TransportTypeException;
import transport.*;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Mechanic mechanic1 = new Mechanic("Михаил", "Компания 1", "Автомобиль");
        Mechanic mechanic2 = new Mechanic("Иван", "Компания 2", "Автобус");
        Mechanic mechanic3 = new Mechanic("Игорь", "Компания 3", "Грузовик");


        Transport car1 = new Car("Бренд Автомобиля 1", "Модель Автомобиля 1", 3.2, null, Type.CAR,null,BodyType.COUPE);
        Transport car2 = new Car("Бренд Автомобиля 2", "Модель Автомобиля 2", 4.4, null,Type.CAR,null,BodyType.COUPE );
        Transport bus1 = new Bus("Бренд Автобуса 3", "Модель Автобуса 2", 3.2, null,Type.BUS,null,BodyType.MINIVAN,LoadCapacity.N2,Size.XL);
        Transport bus2 = new Bus("Бренд Автобуса 4", "Модель Автобуса 1", 4.4, null,Type.BUS,null,BodyType.MINIVAN,LoadCapacity.N2,Size.XL);
        Transport truck1 = new Truck("Бренд Грузовика 5", "Модель Грузовика 1", 3.2, null,Type.TRUCK,null,BodyType.FAN,LoadCapacity.N3);
        Transport truck2 = new Truck("Бренд Грузовика 6", "Модель Грузовика 2", 4.4, null,Type.TRUCK,null,BodyType.FAN,LoadCapacity.N3);

        Driver driverB1 = new DriverB("Имя 1", true, 12);
        Driver driverB2 = new DriverB("Имя 2", true, 6);
        Driver driverC1 = new DriverB("Имя 3", true, 7);
        Driver driverC2 = new DriverB("Имя 4", true, 9);
        Driver driverD1 = new DriverB("Имя 5", true, 5);
        Driver driverD2 = new DriverB("Имя 6", true, 7);
        List<Driver> drivers = new ArrayList<>();

        drivers.add(driverB1);
        drivers.add(driverB2);
        drivers.add(driverC1);
        drivers.add(driverC2);
        drivers.add(driverD1);
        drivers.add(driverD2);

        List<Mechanic> mechanic = new ArrayList<>();

        mechanic.add(mechanic1);
        mechanic.add(mechanic2);
        mechanic.add(mechanic3);


        for (Mechanic transport : mechanic) {
            System.out.println( transport + " " + transport.getName() + transport.getCompany() + transport.getTransportType()    );
            System.out.println(Station.getQueue());

        }
        Map<Transport, Mechanic> map = new HashMap<>();

        Set<Driver> driverSet = new HashSet<>();

        for (Driver driver : drivers) {
            driverSet.add(driver);
        }

        Iterator<Driver> iterator = driverSet.iterator();

        while (iterator.hasNext()) {
            Driver driver = iterator.next();
            System.out.println(driver);
        }



        for (Mechanic transport : mechanic) {
            map.put((Transport) mechanic, mechanic.get(Integer.parseInt("Povtor")));
        }



            try {
                checkTransport(car1,car2,bus1,bus2,truck1,truck2); }
            catch (TransportTypeException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }

        Station station = new Station();
        station.addCarYoQueue(bus2);
        Transport Transport = null;
        Transport transport1 = Transport;
        transport1.setMechanicList(null);

    }








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
        System.out.println("Диагностику прошли " + count + " из " + transports.length + " автомобилей" );
    }
  
  



}