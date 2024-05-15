public class Pitcher extends BaseballPlayer{
    double innings;
    int earnedRuns;

    public Pitcher(String sport, String team, String position, String first, String last, int atBats, int hist, double innings, int earnedRuns) {
        super(sport, team, position, first, last, atBats, hist);
        this.innings = innings;
        this.earnedRuns = earnedRuns;
    }

    public double earnedRunAverage(){
        return earnedRuns / innings;
    }

    @Override
    public String toString() {
        return "Pitcher{" +
                "innings=" + innings +
                ", earnedRuns=" + earnedRuns +
                ", atBats=" + atBats +
                ", hist=" + hist +
                ", sport='" + sport + '\'' +
                ", team='" + team + '\'' +
                ", position='" + position + '\'' +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", earnedRunsAverage='" + earnedRunAverage() + '\'' +
                '}';
    }
}
