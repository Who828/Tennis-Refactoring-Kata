import java.util.HashMap;

/**
 * Created by who on 26/06/14.
 */
public class ScoreCalculator {
    Player player1, player2;

    public ScoreCalculator(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getScore() {
        if (isScoreTied()) return tiedScore();
        else if(hasAdvantage())  return advantageScore();
        else return onGoingScore();
    }

    private String onGoingScore() {
        return player1.currentScore() + "-" + player2.currentScore();
    }

    private String tiedScore() {
        int score = player1.getScore();

        // We can push this to a hashmap to reduce if/else
        if (score == 0) return "Love-All";
        else if(score == 1) return "Fifteen-All";
        else if(score == 2) return "Thirty-All";
        else return "Deuce";
    }

    private String advantageScore() {
        int scoreDifference = player1.getScore() - player2.getScore();

        if (scoreDifference==1) return "Advantage " + player1.getName();
        else if (scoreDifference ==-1) return "Advantage " + player2.getName();
        else if (scoreDifference>=2) return "Win for " + player1.getName();
        else return "Win for " + player2.getName();
    }

    public boolean isScoreTied() {
        return player1.getScore() == player2.getScore();
    }

    public boolean hasAdvantage() {
        return player1.getScore() >= 4 || player2.getScore() >= 4;
    }
}
