package case_study.view;

import case_study.controller.FuramaControllerMainMenu;
import case_study.model.facility.Room;

import static case_study.repository.facility.FacilityRepository.map;

public class Run {
    public static void main(String[] args) {
        FuramaControllerMainMenu furamaController = new FuramaControllerMainMenu();
        furamaController.displayMainMenu();
    }
}
