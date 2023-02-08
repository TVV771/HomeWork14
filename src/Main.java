import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(
                null,
                "Granta",
                -1.7,
                "желтый",
                2015,
                "Россия",
                120,
                "автомат",
                "седан",
                5,
                true,
                "x788x789",
                new Car.Key(true,false)
        );
        System.out.println(lada);

        Car audi = new Car(
                "Audi",
                "A 8 50L TDI quattro",
                -3.0,
                "черный",
                2020,
                "Германия",
                200,
                "автомат",
                "седан",
                5,
                true,
                "x788x789",
                new Car.Key(true,false)
        );

        System.out.println(audi);

        Car bmw = new Car(
                "BMW",
                "Z8",
                -3.0,
                "черный",
                2021,
                "Германия",
                220,
                "автомат",
                "седан",
                6,
                true,
                "x788x789",
                new Car.Key(true,false)
        );

        System.out.println(bmw);

        Car kia = new Car("Kia",
                "Sportage 4-го поколения",
                -2.4,
                "красный",
                2018,
                "Корея",
                160,
                "автомат",
                "седан",
                5,
                true,
                "x788x789",
                new Car.Key(true,false)

        );

        System.out.println(kia);

        Car hyundai = new Car(
                null,
                "Avante",
                -1.6,
                "оранжевый",
                2016,
                "Корея",
                110,
                "автомат",
                "седан",
                5,
                true,
                "x788x789",
                new Car.Key(true,false)
        );

        System.out.println(hyundai);

        for (int i =1;i<=3;i++){
            Bus bus = new Bus(
                    "Bus brand N"+i,
                    "Bus model N"+i,
                    2015+i,
                    "Китай",
                    "Синий",
                    150

            );
            System.out.println(bus);

        }

    }

}