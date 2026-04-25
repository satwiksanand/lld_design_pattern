package problems.ticTacToe;

public class XTurnState implements GameState {

    @Override
    public void next(GameContext context, Player player) {
        // this is for player x to play his turn.
        // here we will let the player make a move.
        while (true) {
            Position pos = player.makeMove();
            if (context.getBoard().isValidMove(pos)) {
                context.getBoard().makeMove(pos, Symbol.X);
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        // now update the state of the game for now.
        if (context.getBoard().isDraw()) {
            context.setState(new DrawState());
        } else if (context.getBoard().hasWon(Symbol.X)) {
            context.setState(new XWonState());
        } else {
            context.setState(new YTurnState());
        }
    }

    @Override
    public boolean hasCompleted() {
        return false;
    }
}
