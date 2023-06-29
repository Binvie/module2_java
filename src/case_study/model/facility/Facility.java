package case_study.model.facility;

public abstract class Facility {
    protected int serviceID;
    protected String serviceName;
    protected double usedArea;
    protected double rentingPrice;
    protected int numberPerson;
    protected String rentingType;

    public Facility() {
    }

    public Facility(int serviceID, String serviceName, double usedArea, double rentingPrice, int numberPerson, String rentingType) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.usedArea = usedArea;
        this.rentingPrice = rentingPrice;
        this.numberPerson = numberPerson;
        this.rentingType = rentingType;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(double usedArea) {
        this.usedArea = usedArea;
    }

    public double getRentingPrice() {
        return rentingPrice;
    }

    public void setRentingPrice(double rentingPrice) {
        this.rentingPrice = rentingPrice;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    public String getRentingType() {
        return rentingType;
    }

    public void setRentingType(String rentingType) {
        this.rentingType = rentingType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceID=" + serviceID +
                ", serviceName='" + serviceName + '\'' +
                ", usedArea=" + usedArea +
                ", rentingPrice=" + rentingPrice +
                ", numberPerson=" + numberPerson +
                ", rentingType='" + rentingType + '\'' +
                '}';
    }
}
