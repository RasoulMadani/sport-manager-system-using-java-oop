public class BaseballPlayer extends Player implements Defend {
    int atBats;
    int hist;

    public BaseballPlayer(String sport, String team, String position, String first, String last, int atBats, int hist) {
        super(sport, team, position, first, last);
        this.atBats = atBats;
        this.hist = hist;
    }

    public double battingAverage() {
        return (double) atBats /hist;
    }

    @Override
    public boolean canDefend() {
        return Math.random() > 0.5;
    }

    @Override
    public String toString() {
        return "BaseballPlayer{" +
                "atBats=" + atBats +
                ", hist=" + hist +
                ", sport='" + sport + '\'' +
                ", team='" + team + '\'' +
                ", position='" + position + '\'' +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", battingAverage='" + battingAverage() + '\'' +
                ", canDefend='" + canDefend() + '\'' +
                '}';
    }
}
