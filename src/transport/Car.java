package transport;

import TransportTypeExeption.TransportTypeException;

import java.util.List;

public class Car extends Transport<DriverB> {

    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, DriverB driver, Type type, List<Mechanic> mechanicList, BodyType bodyType) {
        super(brand, model, engineVolume, driver, type, mechanicList);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }




    @Override
    public boolean passDiagnostics() throws TransportTypeException {
        return false;
    }

    @Override
    public Type getType() {
        return Type.CAR;
    }



    @Override
    public void startMove() {
        System.out.println("Автомобиль марки " + getBrand() + " начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Автомобиль марки " + getBrand() + " закончил движение");

    }


    @Override
    public void pitStop() {
        System.out.println("Пит стоп у автомобиля");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 70;
        int maxBound = 120;

        int theBestTimeInMins = (int) (minBound + (maxBound- minBound)*Math.random());

        System.out.println("Лучшее время круга для автомобиля в минутах" + theBestTimeInMins);

    }


    @Override
    public void maxSpeed() {
        int minBound = 100;
        int maxBound = 170;

        int maxSpeed = (int) (minBound + (maxBound- minBound)*Math.random());

        System.out.println("Максимальная скорость для автомобиля" + maxSpeed);

    }
    @Override
    public void printType() {
        if(getBodyType() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getBodyType());
        }
    }


    @Override
    public String toString() {
        return "Car{" +
                "bodyType=" + bodyType +
                '}';
    }
}