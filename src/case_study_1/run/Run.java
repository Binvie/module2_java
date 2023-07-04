package case_study_1.run;

import case_study_1.controller.PlayerController;
import case_study_1.player.Player;
import case_study_1.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;




public class Run {
    public static void main(String[] args) {
        PlayerController playerController = new PlayerController();
        playerController.showMenu();

    }
}
