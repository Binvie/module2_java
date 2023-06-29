package case_study.controller.childmenu;

import static case_study.controller.FuramaControllerMainMenu.scanner;

public class BookingManagement {
    public void BookingMenu(){
        boolean flag= true;
        do {
            try {
                System.out.println("-----------Booking Management------------\n" +
                        "1.Add new booking\n" +
                        "2.Display list booking\n" +
                        "3.Create new contracts\n" +
                        "4.Display list contracts\n" +
                        "5.Edit contracts\n" +
                        "6.Return main menu\n");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("---------Add new booking-----------");
                    case 2:
                        System.out.println("---------Display list bookin-----------");
                    case 3:
                        System.out.println("---------Create new contracts-----------");
                    case 4:
                        System.out.println("---------Display list contracts-----------");
                    case 5:
                        System.out.println("---------Edit contracts-----------");
                    case 6:
                        System.out.println("---------Return main menu-----------");
                        return;
                }
            }catch (NumberFormatException e){
                System.out.println("Try again");
            }
        }while (true);
    }
}
