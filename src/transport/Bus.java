package transport;

public class Bus extends Transport<DriverD> {
    public Bus(String brand, String model, double engineVolume, DriverD driver, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + " начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение");

    }

    @Override
    public void printType() {

            if(getLoadCapacity() == null) {
                System.out.println("Данных по транспортному средству недостаточно");
            } else {
                System.out.println(getLoadCapacity());
            }
        }



    @Override
    public void pitStop() {
        System.out.println("Пит стоп у Автобуса");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 100;
        int maxBound = 150;

        int theBestTimeInMins = (int) (minBound + (maxBound- minBound)*Math.random());

        System.out.println("Лучшее время круга для автобуса в минутах" + theBestTimeInMins);

    }


    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;

        int maxSpeed = (int) (minBound + (maxBound- minBound)*Math.random());

        System.out.println("Максимальная скорость для автобуса" + maxSpeed);

    }
}

