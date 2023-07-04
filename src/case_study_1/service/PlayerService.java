package case_study_1.service;

import case_study_1.player.Player;
import case_study_1.repository.IPlayerRepository;
import case_study_1.repository.PlayerRepository;

import java.util.List;

public class PlayerService implements IPlayerService {
    PlayerRepository playerRepository = new PlayerRepository();

    @Override
    public void displayList() {
        System.out.println("-----Player List-----");
//        List<Player> list = playerRepository.displayList();
//        for (Player c: list) {
//            System.out.println(c);
        List<Player> list = playerRepository.displayList();
        for (Player c : list) {
            System.out.println(c);
        }
    }

    @Override
    public void addNewPlayer() {

    }

    @Override
    public void doPenalty() {

    }
}
