import java.util.Map;

public class Game {
    public static void game (Map<Player, Score> players){
        for(Map.Entry<Player, Score> player: players.entrySet()){
            Integer score1 = player.getValue().getScore();//turn into integer
            Score newScore = new Score(score1);
            Integer scored = 0;
            for(int i = 0; i<3; i++){

                scored = player.getValue().scoring("D10");
                System.out.println(scored);
                System.out.println(Score.scoringMap.get("D10"));


            }
            if(scored>=0){
                newScore = new Score(scored);
                player.setValue(newScore);
                
            } else {
                player.setValue(newScore);
                System.out.println("Busted: remain at " + player.getValue());
            }


            player.setValue(newScore);

            System.out.println(player);


        }

    }


}
