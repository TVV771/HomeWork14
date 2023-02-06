import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(
                null,"Granta",-1.7, "желтый",2015,"Россия","автомат","седан",5,true,"x788x789",   new Car.Key(true,false)
        );
        System.out.println(lada);

        Car audi = new Car(
                "Audi","A 8 50L TDI quattro",-3.0,"черный",2020,"Германия","автомат","седан",5,true,"x788x789",   new Car.Key(true,false)
        );

        System.out.println(audi);

        Car bmw = new Car(
                "BMW","Z8",-3.0,"черный",2021,"Германия","автомат","седан",5,true,"x788x789",   new Car.Key(true,false)
        );

        System.out.println(bmw);

        Car kia = new Car("Kia","Sportage 4-го поколения",-2.4,"красный",2018,"Корея","автомат","седан",5,true,"x788x789",new Car.Key(true,false)

        );

        System.out.println(kia);

        Car hyundai = new Car(
                null,  "Avante",-1.6,"оранжевый",2016,"Корея","автомат","седан",5,true,"x788x789", new Car.Key(true,false)
        );

        System.out.println(hyundai);



    }
}