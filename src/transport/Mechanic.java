package transport;

public class Mechanic {

    private String name;
    private String company;
    private String transportType;

    public Mechanic(String name, String company, String transportType) {
        this.name = name;
        this.company = company;
        this.transportType = transportType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }
    public void maintenance() {
        System.out.println(getName() + "из компании " + getCompany() + " проводит техобслуживание");
    }

    public void fixing() {
        System.out.println(getName() + "из компании " + getCompany() + " чинит автомобиль");
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", transportType='" + transportType + '\'' +
                '}';
    }
}
