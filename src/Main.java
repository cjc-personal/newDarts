
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Player, Score> players = new HashMap<>();
        Score.setScoringMap();
//add player menu class to store and update hashmap
        Player newPlayer = new Player("Player1");
        Score newScore = new Score(50);
        Player newPlayer2 = new Player("Carol");
        Score newScore2 = new Score(50);

        players.put(newPlayer, newScore);
        players.put(newPlayer2, newScore2);

        System.out.println(players);

        Scanner input = new Scanner(System.in);

        Game.game(players);


        System.out.println(players);

    }

}
