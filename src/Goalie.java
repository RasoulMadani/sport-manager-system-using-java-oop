public class Goalie extends SoccerPlayer {
    int goalsAllowed;


    public Goalie(String sport, String team, String position, String first, String last, int minutes, int goals, int goalsAllowed) {
        super(sport, team, position, first, last, minutes, goals);
        this.goalsAllowed = goalsAllowed;
    }

    public double averageGoalsAllowed() {
        String s = String.format("%.3f",(double)(goals/minutes)*90);
        return Double.parseDouble(s);
    }

    @Override
    public String toString() {
        return "Goalie{" +
                "goalsAllowed=" + goalsAllowed +
                ", minutes=" + minutes +
                ", goals=" + goals +
                ", sport='" + sport + '\'' +
                ", team='" + team + '\'' +
                ", position='" + position + '\'' +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", averageGoalsAllowed='" + averageGoalsAllowed() + '\'' +
                '}';
    }
}
