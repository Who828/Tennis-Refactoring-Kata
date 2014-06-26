/**
 * Created by who on 26/06/14.
 */
public class Player {
    int score;
    String name;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void wonPoint() {
       score++;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
       return name;
    }

    public String currentScore() {
       if (score == 0) return "Love";
       else if (score == 1) return "Fifteen";
       else if (score == 2) return "Thirty";
       else return "Forty";
    }

}
