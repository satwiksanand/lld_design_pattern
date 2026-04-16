package problems.ticTacToe;

public class PlayerFactory {
    public static Player createHumanPlayer(Symbol symbol) {
        return new Player(new HumanPlayerStrategy(), symbol);
    }

    public static Player createRandomPlayer(Symbol symbol){
        return new Player(new RandomMoveStrategy(), symbol);
    }
}
