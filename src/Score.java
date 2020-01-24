import java.util.HashMap;
import java.util.Map;

public class Score {
    private Integer score;
    public static Map<String, Integer> scoringMap = new HashMap<>();


    public Score(Integer num){
        this.score = num;
    }

    public static void setScoringMap() {
        scoringMap.put("MISS", 0);
        scoringMap.put("S1", 1);
        scoringMap.put("S2", 2);
        scoringMap.put("S3", 3);
        scoringMap.put("S4", 4);
        scoringMap.put("S5", 5);
        scoringMap.put("S6", 6);
        scoringMap.put("S7", 7);
        scoringMap.put("S8", 8);
        scoringMap.put("S9", 9);
        scoringMap.put("S10", 10);
        scoringMap.put("S11", 11);
        scoringMap.put("S12", 12);
        scoringMap.put("S13", 13);
        scoringMap.put("S14", 14);
        scoringMap.put("S15", 15);
        scoringMap.put("S16", 16);
        scoringMap.put("S17", 17);
        scoringMap.put("S18", 18);
        scoringMap.put("S19", 19);
        scoringMap.put("S20", 20);
        scoringMap.put("D1", 2);
        scoringMap.put("D2", 4);
        scoringMap.put("D3", 6);
        scoringMap.put("D4", 8);
        scoringMap.put("D5", 10);
        scoringMap.put("D6", 12);
        scoringMap.put("D7", 14);
        scoringMap.put("D8", 16);
        scoringMap.put("D9", 18);
        scoringMap.put("D10", 20);
        scoringMap.put("D11", 22);
        scoringMap.put("D12", 24);
        scoringMap.put("D13", 26);
        scoringMap.put("D14", 28);
        scoringMap.put("D15", 30);
        scoringMap.put("D16", 32);
        scoringMap.put("D17", 34);
        scoringMap.put("D18", 36);
        scoringMap.put("D19", 38);
        scoringMap.put("D20", 40);
        scoringMap.put("T1", 3);
        scoringMap.put("T2", 6);
        scoringMap.put("T3", 9);
        scoringMap.put("T4", 12);
        scoringMap.put("T5", 15);
        scoringMap.put("T6", 18);
        scoringMap.put("T7", 21);
        scoringMap.put("T8", 24);
        scoringMap.put("T9", 27);
        scoringMap.put("T10", 30);
        scoringMap.put("T11", 33);
        scoringMap.put("T12", 36);
        scoringMap.put("T13", 39);
        scoringMap.put("T14", 42);
        scoringMap.put("T15", 45);
        scoringMap.put("T16", 48);
        scoringMap.put("T17", 51);
        scoringMap.put("T18", 54);
        scoringMap.put("T19", 57);
        scoringMap.put("T20", 60);
        scoringMap.put("BULLSEYE", 25); //outter bullseye
        scoringMap.put("DBULLSEYE", 50); //inner bullseye
    }
    public Integer scoring(String locationOfDart){
        score -= scoringMap.get(locationOfDart);
        return score;
    }



    @Override
    public boolean equals(Object toBeCompared){
        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared== null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Score theScore = (Score) toBeCompared;
        return (theScore.getScore() == getScore());
    }

    @Override
    public String toString(){
        String scoreString = score.toString();
        return scoreString;
    }

    //getters
    public Integer getScore() {
        return score;
    }
    //setters
    public void setScore(Integer score) {
        this.score = score;
    }
}
