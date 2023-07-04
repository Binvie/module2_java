package case_study_1.utils;

import case_study_1.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static final String LINK = "D:\\Codegym_source\\module2\\module2_java\\src\\case_study_1\\utils\\test.csv";
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
        readAndWrite.writeFile(LINK,list);
    }
    public static void main(String[] args) {
        System.out.println("l");
    }
}
