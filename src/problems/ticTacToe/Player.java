package problems.ticTacToe;

public class Player {
    private final PlayerStrategy playerStrategy;
    private final Symbol symbol;

    public Player(PlayerStrategy playerStrategy, Symbol symbol){
        this.playerStrategy = playerStrategy;
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public Position makeMove() {
        return playerStrategy.makeMove(this);//specifically for AIPlayerStrategy for making good moves.
    }
}
