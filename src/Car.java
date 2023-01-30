public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if(brand == null || brand.isEmpty() ){
            brand = "default";
        }
        this.brand = brand;
        if(model == null || model.isEmpty() ){
            model = "default";
        }

        this.model = model;
        if (engineVolume<= 0){
            engineVolume=1.5;
        }
        this.engineVolume = engineVolume;
        if (color==null|| color.isEmpty() ) {
            color = "белый";
        }
        this.color = color;
        if (country==null|| country.isEmpty() ){
            country = "default";
        }
        this.year = year;
        this.country = country ;
    }

    @Override
    public String toString(){
        return  "Марка " + brand + ", " + " модель: " + model + ", " + "Обьем двигателя в литрах" + engineVolume + ", " +
        "цвет кузова:" + color + ", " + "год производства: " + year + ", " + "страна сборки " + country;
    }

}
