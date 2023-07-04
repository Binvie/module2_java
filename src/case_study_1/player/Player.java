package case_study_1.player;

public class Player {
    int id;
    String name;
    String date;
    String address;
    String club;

    public Player(String s, String name, String date, String address, String club) {
    }

    public Player(int id, String name, String date, String address, String club) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.address = address;
        this.club = club;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", address='" + address + '\'' +
                ", club='" + club + '\'' +
                '}';
    }

    public String convertToString() {
        return id + "," + name + "," + date + "," + address + "," + club;
    }
}
