package case_study_1.repository;

import case_study_1.player.Player;

import java.util.List;

public interface IPlayerRepository {
    List<Player> displayList();
    void addNewPlayer();
    void doPenalty();
}
