package case_study.model.facility;

public class House extends Facility {
    private String houseRoomStandard;
    private int houseFloor;

    public House() {
    }

    public House(String houseRoomStandard, int houseFloor) {
        this.houseRoomStandard = houseRoomStandard;
        this.houseFloor = houseFloor;
    }

    public House(String serviceID, String serviceName, double usedArea, double rentingPrice, int numberPerson, String rentingType, String houseRoomStandard, int houseFloor) {
        super(serviceID, serviceName, usedArea, rentingPrice, numberPerson, rentingType);
        this.houseRoomStandard = houseRoomStandard;
        this.houseFloor = houseFloor;
    }

    public String getHouseRoomStandard() {
        return houseRoomStandard;
    }

    public void setHouseRoomStandard(String houseRoomStandard) {
        this.houseRoomStandard = houseRoomStandard;
    }

    public int getHouseFloor() {
        return houseFloor;
    }

    public void setHouseFloor(int houseFloor) {
        this.houseFloor = houseFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "ID : " + serviceID +
                "| Room Standard :'" + houseRoomStandard + '\'' +
                "| Floor :" + houseFloor +
                "| service :'" + serviceName + '\'' +
                "| usedArea :" + usedArea +
                "| Price :" + rentingPrice +
                "| max people :" + numberPerson +
                "| Type :'" + rentingType + '\'' +
                '}';
    }
}
