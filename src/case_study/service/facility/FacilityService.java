package case_study.service.facility;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repository.facility.FacilityRepository;
import case_study.utils.CheckFacilityValidate;

import java.util.List;
import java.util.Map;

import static case_study.controller.FuramaControllerMainMenu.scanner;

public class FacilityService implements IFacilityService {
    FacilityRepository facilityRepository = new FacilityRepository();
    CheckFacilityValidate checkFacilityValidate = new CheckFacilityValidate();

    @Override
    public void displayFacilityList() {
        Map<Facility, Integer> map = facilityRepository.displayFacilityList();
        for (Map.Entry<Facility, Integer> c : map.entrySet()) {
            System.out.println(c);
        }
    }

    @Override
    public void addNewHouse() {
        //house String serviceID, String serviceName, double usedArea, double rentingPrice, int numberPerson, String rentingType, String houseRoomStandard, int houseFloor
        String serviceID = checkFacilityValidate.checkID();
        String serviceName = checkFacilityValidate.checkName();
        System.out.println("Enter Service UsedArea");
        Double usedArea = Double.valueOf(scanner.nextLine());
        Double rentingPrice = checkFacilityValidate.checkRentingPrice();
        int numberPerson = checkFacilityValidate.checkNumberPerson();
        String rentingType = checkFacilityValidate.checkServiceType();
        System.out.println("Enter Service HouseRoom Standard");
        String houseRoomStandard = scanner.nextLine();
        int houseFloor = checkFacilityValidate.checkNumberFloor();
        House house = new House(serviceID, serviceName, usedArea, rentingPrice, numberPerson, rentingType, houseRoomStandard, houseFloor);
        facilityRepository.addNew(house);
    }

    @Override
    public void addNewVilla() {
        //roomString  serviceID, String serviceName, double usedArea, double rentingPrice, int numberPerson, String rentingType, String freeService
        String serviceID = checkFacilityValidate.checkID();
        String serviceName = checkFacilityValidate.checkName();
        System.out.println("Enter Service UsedArea");
        Double usedArea = Double.valueOf(scanner.nextLine());
        Double rentingPrice = checkFacilityValidate.checkRentingPrice();
        int numberPerson = checkFacilityValidate.checkNumberPerson();
        System.out.println("Enter Service Renting Type");
        String rentingType = scanner.nextLine();
        System.out.println("Enter Service Room Standard");
        String roomStandard = scanner.nextLine();
        double poolArea = checkFacilityValidate.checkPoolArea();
        int numberFloor = checkFacilityValidate.checkNumberFloor();
        Villa villa = new Villa(serviceID, serviceName, usedArea, rentingPrice, numberPerson, rentingType, roomStandard, poolArea, numberFloor);
        facilityRepository.addNew(villa);
    }

    @Override
    public void addNewRoom() {
//roomString  serviceID, String serviceName, double usedArea, double rentingPrice, int numberPerson, String rentingType, String freeService
        String serviceID = checkFacilityValidate.checkID();
        String serviceName = checkFacilityValidate.checkName();
        System.out.println("Enter Service UsedArea");
        Double usedArea = Double.valueOf(scanner.nextLine());
        Double rentingPrice = checkFacilityValidate.checkRentingPrice();
        int numberPerson = checkFacilityValidate.checkNumberPerson();
        System.out.println("Enter Service Renting Type");
        String rentingType = scanner.nextLine();
        System.out.println("Enter Service Free Service");
        String freeService = scanner.nextLine();
        Room room = new Room(serviceID, serviceName, usedArea, rentingPrice, numberPerson, rentingType, freeService);
        facilityRepository.addNew(room);
    }

    @Override
    public void displayMaintainList() {

    }
}
