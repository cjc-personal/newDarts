
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Player, Score> players = new HashMap<>();
        Score.setScoringMap();

        Player newPlayer = new Player("Player1");
        Score newScore = new Score(50);

        players.put(newPlayer, newScore);

        System.out.println(players);



        Game.game(players);


        System.out.println(players);

    }

}
