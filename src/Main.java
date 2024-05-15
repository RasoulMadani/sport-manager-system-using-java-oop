import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        read_file(players);
        write_file(players);


    }

    private static void write_file(ArrayList<Player> players) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
            for (Player p : players) {
                writer.append(p.toString());
                writer.append("\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void read_file(ArrayList<Player> players) {
        try {
            Scanner scanner = new Scanner(new File("Players.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] s = line.split("\\s+");
                if (s[0].equals("Soccer")) {
                    if (s.length == 7) { // soc
                        SoccerPlayer soccerPlayer = new SoccerPlayer(s[0], s[1], s[2], s[3], s[4],
                                Integer.parseInt(s[5]), Integer.parseInt(s[6]));
                        players.add(soccerPlayer);
                    } else if (s.length == 8) { // go
                        Goalie goalie = new Goalie(s[0], s[1], s[2], s[3], s[4],
                                Integer.parseInt(s[5]), Integer.parseInt(s[6]), Integer.parseInt(s[7]));
                        players.add(goalie);
                    }
                } else if (s[0].equals("Baseball")) {
                    if (s.length == 7) { // bas
                        BaseballPlayer baseballPlayer = new BaseballPlayer(s[0], s[1], s[2], s[3], s[4],
                                Integer.parseInt(s[5]), Integer.parseInt(s[6]));
                        players.add(baseballPlayer);
                    } else if (s.length == 8) { // pi
                        Pitcher pitcher = new Pitcher(s[0], s[1], s[2], s[3], s[4],
                                Integer.parseInt(s[5]), Integer.parseInt(s[6]), Double.parseDouble(s[7]), Integer.parseInt(s[8]));
                        players.add(pitcher);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Player p : players) {
            System.out.println(p);
        }
    }
}
