package case_study.model.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String  serviceID, String serviceName, double usedArea, double rentingPrice, int numberPerson, String rentingType, String freeService) {
        super(serviceID, serviceName, usedArea, rentingPrice, numberPerson, rentingType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "ID :" + serviceID +
                "| freeService :'" + freeService + '\'' +
                "| serviceName :'" + serviceName + '\'' +
                "| usedArea :" + usedArea +
                "| Price :" + rentingPrice +
                "| max people :" + numberPerson +
                "| Type :'" + rentingType + '\'' +
                '}';
    }
}
