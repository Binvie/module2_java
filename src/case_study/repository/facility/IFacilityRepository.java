package case_study.repository.facility;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;

import java.util.List;
import java.util.Map;

public interface IFacilityRepository {
    Map<Facility, Integer> displayFacilityList();
    void addNew(Villa villa);
    void addNew(House house);
    void addNew(Room room);
    void displayMaintainList();
}
