package case_study_1.controller;

import case_study_1.service.PlayerService;

import java.util.Scanner;

public class PlayerController {

    public static Scanner scanner = new Scanner(System.in);
    public void showMenu(){
        PlayerService playerService = new PlayerService();
        boolean flag = true;
        do {
            System.out.println("-----Soccer Player Management-----" +
                    "\n1. Show Player List." +
                    "\n2. Add new player." +
                    "\n3. Do Penalty." +
                    "\n4. Exit.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("-----Show Player List-----");
                    playerService.displayList();
                    break;
                case 2:
                    System.out.println("-----Add new player-----");
                    playerService.addNewPlayer();
                    break;
                case 3:
                    System.out.println("-----Do Penalty-----");
                    playerService.doPenalty();
                    break;
                case 4:
                    System.exit(0);
            }
        }while (flag);
    }
}
