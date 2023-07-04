package case_study.controller.childmenu;

import case_study.service.facility.FacilityService;

import static case_study.controller.FuramaControllerMainMenu.scanner;

public class NewFacility {
    public void menuChild() {
        FacilityService facilityService = new FacilityService();
        boolean flag = true;
        do {
            System.out.println("1. Add New Villa." +
                    "\n2. Add New House." +
                    "\n3. Add New Room." +
                    "\n4. Back to menu.");
            try {
                int choice1 = Integer.parseInt(scanner.nextLine());
                switch (choice1) {
                    case 1:
                        System.out.println(" Add New Villa.");
                        facilityService.addNewVilla();
                        break;
                    case 2:
                        System.out.println(" Add New House.");
                        facilityService.addNewHouse();
                        break;
                    case 3:
                        System.out.println(" Add New Room.");
                        facilityService.addNewRoom();
                        break;
                    case 4:
                        System.out.println(" Back to menu.");
                        return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number.");
            }
        } while (flag);
    }
}
