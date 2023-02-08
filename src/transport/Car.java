package transport;

import java.security.Key;

public class Car extends Transport {

    private double engineVolume;

    String gear;
    private final String typeOfBody;
    String regNumber;
    private final int capacity;
    private boolean summerTyres;
    private Key key;
    public static class Key {
        private boolean remoteRun;
        private boolean withoutAccess;

        public Key(boolean remoteRun, boolean withoutAccess) {
            this.remoteRun = remoteRun;
            this.withoutAccess = withoutAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithoutAccess() {
            return withoutAccess;
        }

        @Override
        public String toString() {
            return (remoteRun?" удаленный запуск" : ", без удаленный запуск") +
                    (withoutAccess?" безключевой достпуп " : ", безключевой достпуп отсутстуеет");
        }
    }


    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               int maxSpeed,
               String gear,
               String typeOfBody,
               int capacity,
               boolean summerTyres,
               String regNumber,
               Key key) {
        super(brand,model,year,country,color,maxSpeed);

        setEngineVolume(engineVolume);
        setGear(gear);
        if(typeOfBody==null || typeOfBody.isEmpty()){
            typeOfBody="джип";
        }
        this.typeOfBody=typeOfBody;
        setRegNumber(regNumber);
        if (capacity<=0) {
            capacity=5;

        }
        this.capacity=capacity;
        this.summerTyres=summerTyres;
        setKey(key);
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume<= 0){
            engineVolume=1.5;
        }
        this.engineVolume = engineVolume;
    }






    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        if(gear==null || gear.isEmpty()){
            gear= "механика";
        }
        this.gear = gear;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
    if(regNumber==null||regNumber.isEmpty()){
        regNumber="x777xx777";
    }
        this.regNumber = regNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if(key==null){
            key = new Key(false,false);
        }
        this.key = key;
    }

    public void changeTyres(int month){
        if ((month>=11 && month<=12) || (month>=1 && month<=5)){
            summerTyres=false;
        }
        if (month>=4 && month<=10) {
            summerTyres=true;
        }

    }

    @Override
    public String toString(){
        return super.toString()+ ","
                + "Обьем двигателя в литрах" + engineVolume + ", "
                + "коробка переддач " + gear + ", "
                + "тип кузова " + typeOfBody + ", "
                + "рег. номер " + regNumber + ", " + " " +
                (summerTyres?"летняя " : "зимняя") + "резина" + ", " + key ;
    }

}
