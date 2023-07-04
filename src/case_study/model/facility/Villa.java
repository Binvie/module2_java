package case_study.model.facility;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberFloor;

    public Villa() {
    }

    public Villa(String roomStandard, double poolArea, int numberFloor) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public Villa(String  serviceID, String serviceName, double usedArea, double rentingPrice, int numberPerson, String rentingType, String roomStandard, double poolArea, int numberFloor) {
        super(serviceID, serviceName, usedArea, rentingPrice, numberPerson, rentingType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "ID :" + serviceID +
                "| roomStandard :'" + roomStandard + '\'' +
                "| poolArea :" + poolArea +
                "| Floor :" + numberFloor +
                "| Name :'" + serviceName + '\'' +
                "| usedArea :" + usedArea +
                "| Price :" + rentingPrice +
                "| max people :" + numberPerson +
                "| Type :'" + rentingType + '\'' +
                '}';
    }
}
