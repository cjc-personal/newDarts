import java.util.Map;
import java.util.Scanner;

public class Game {
    public static void game (Map<Player, Score> players){
        for(Map.Entry<Player, Score> player: players.entrySet()){
            Integer score1 = player.getValue().getScore();//turn into integer
            Score newScore = new Score(score1);
            Integer scored = 0;
            System.out.println(player.getKey() + ": " + player.getValue() + "\n");
            for(int i = 1; i<4; i++){
                System.out.println("Please enter score for dart " + i);
                Scanner input = new Scanner(System.in);
                String scoreDart = input.nextLine();
                String dartLocation = scoreDart.toUpperCase();
                scored = player.getValue().scoring(dartLocation);
                System.out.println(player.getKey()+"\nThrow Score: "+Score.scoringMap.get(dartLocation));
                if(scored<=0){
                    break;
                }
                System.out.println("Remaining Score: "+scored + "\n");



            }

            if(scored > 0){
                newScore = new Score(scored);
                player.setValue(newScore);
            } else if(scored == 0){
                newScore = new Score(scored);
                player.setValue(newScore);
                System.out.println(player.getKey() + ": You Win!!!");
                break;
            } else {
                player.setValue(newScore);
                System.out.println("Busted: remain at " + player.getValue() + "\n");
            }




            System.out.println(player.getKey() + ": " + player.getValue());


        }

    }


}
