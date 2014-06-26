
public class TennisGame1 implements TennisGame {
    
    private Player player1;
    private Player player2;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (player1.getName() == playerName)
            player1.wonPoint();
        else
            player2.wonPoint();
    }

    public String getScore() {
        return new ScoreCalculator(player1, player2).getScore();
    }
}
