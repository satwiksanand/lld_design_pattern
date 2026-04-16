package problems.ticTacToe;

public class PlayGame {
    private Player player1;
    private Player player2;

    void registerUser(){
        // by default the first player will be symbolled x.
        player1 = PlayerFactory.createHumanPlayer(Symbol.X);
        player2 = PlayerFactory.createHumanPlayer(Symbol.Y);
    }


}
