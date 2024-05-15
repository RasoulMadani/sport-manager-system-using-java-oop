public class Player {
    String sport;
    String team;
    String position;
    String first;
    String last;

    public Player(String sport, String team, String position, String first, String last) {
        this.sport = sport;
        this.team = team;
        this.position = position;
        this.first = first;
        this.last = last;
    }

    @Override
    public String toString() {
        return "Player{" +
                "sport='" + sport + '\'' +
                ", team='" + team + '\'' +
                ", position='" + position + '\'' +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}
