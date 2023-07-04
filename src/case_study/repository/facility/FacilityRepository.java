package case_study.repository.facility;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    public static Map<Facility, Integer> map = new LinkedHashMap<>();

    static {
        //String serviceID, String serviceName, double usedArea, double rentingPrice, int numberPerson, String rentingType
        //house String serviceID, String serviceName, double usedArea, double rentingPrice, int numberPerson, String rentingType, String houseRoomStandard, int houseFloor
        //villaString  serviceID, String serviceName, double usedArea, double rentingPrice, int numberPerson, String rentingType, String roomStandard, double poolArea, int numberFloor
        //roomString  serviceID, String serviceName, double usedArea, double rentingPrice, int numberPerson, String rentingType, String freeService

        map.put(new House("SVHO-0001", "Swimming Pool", 100000, 500000, 5, "week", "Vip", 3), 0);
        map.put(new House("SVHO-0002", "Double Room", 200000, 1000000, 6, "week", "Vip", 3), 0);
        map.put(new Villa("SVVL-0001", "Family Villa", 200000, 1000000, 10, "week", "Standard", 200, 3), 0);
        map.put(new Villa("SVVL-0002", "Family Villa", 100000, 1000000, 8, "week", "Standard", 100, 3), 0);
        map.put(new Room("SVRO-0001", "Family Room", 5000, 10000, 3, "day", "free water"), 0);
        map.put(new Room("SVRO-0002", "Family Room", 7000, 15000, 4, "day", "free water"), 0);
    }

    @Override
    public Map<Facility, Integer> displayFacilityList() {
        return map;
    }

    @Override
    public void addNew(Villa villa) {
        map.put(villa, 0);
    }

    @Override
    public void addNew(House house) {
        map.put(house, 0);
    }

    @Override
    public void addNew(Room room) {
        map.put(room, 0);
    }

    @Override
    public void displayMaintainList() {

    }
}
