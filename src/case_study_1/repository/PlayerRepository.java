package case_study_1.repository;

import case_study_1.player.Player;
import case_study_1.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepository implements IPlayerRepository {
    ReadAndWrite readAndWrite = new ReadAndWrite();
   public static List<Player> playerList = new ArrayList<>();

    static {
        ReadAndWrite readAndWrite = new ReadAndWrite();
        //String id, String name, String date, String address, String club)
        playerList.add(new Player(1, "sang", "20/10/1978", "Hue", "team"));
        playerList.add(new Player(2, "thien", "20/10/1978", "Hue", "team1"));
        playerList.add(new Player(3, "thoi", "20/10/1978", "Hue", "team2"));
        playerList.add(new Player(4, "nguyen", "20/10/1978", "Hue", "team3"));
        List<String> list = new ArrayList<>();
        for (Player c : playerList) {
            list.add(c.convertToString());
        }
        readAndWrite.writeFile(ReadAndWrite.PLAYER_DATA, list);
    }

    public static void main(String[] args) {
        System.out.println("l");
    }
    @Override
    public List<Player> displayList() {
        List<String> list = readAndWrite.readFile(ReadAndWrite.PLAYER_DATA);
        String[] info = null;
        for (String c : list) {
            info = c.split(",");
            playerList.add(new Player(info[0], info[1], info[2], info[3], info[5]));
        }
        return playerList;
    }

    public List<String> convertToStringList(List<Player> playerList) {
        List<String> list = new ArrayList<>();
        for (Player e : playerList) {
            list.add(e.convertToString());
        }
        return list;
    }

    @Override
    public void addNewPlayer() {

    }

    @Override
    public void doPenalty() {

    }
}
