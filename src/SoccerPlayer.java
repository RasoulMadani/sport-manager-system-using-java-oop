public class SoccerPlayer extends Player implements Shoot {
    int minutes;
    int goals;

    public SoccerPlayer(String sport, String team, String position, String first, String last, int minutes, int goals) {
        super(sport, team, position, first, last);
        this.minutes = minutes;
        this.goals = goals;
    }

    public double goalsPerGame() {
        String s = String.format("%.3f",(double)(goals/minutes)*90);
        return Double.parseDouble(s);
    }

    @Override
    public boolean canShoot() {
        return Math.random() > 0.5;
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "minutes=" + minutes +
                ", goals=" + goals +
                ", sport='" + sport + '\'' +
                ", team='" + team + '\'' +
                ", position='" + position + '\'' +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", canShoot='" + canShoot() + '\'' +
                ", goalPerGame='" + goalsPerGame() + '\'' +
                '}';
    }
}
