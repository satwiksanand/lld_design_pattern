package problems.ticTacToe;

public class YTurnState implements GameState {
    @Override
    public void next(GameContext context, Player player) {
        // this is for y to play his turn.
        // here we will let the player make a move.
        while (true) {
            Position pos = player.makeMove();
            if (context.getBoard().isValidMove(pos)) {
                context.getBoard().makeMove(pos, Symbol.Y);
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        // now update the state of the game for now.
        if (context.getBoard().isDraw()) {
            context.setState(new DrawState());
        } else if (context.getBoard().hasWon(Symbol.Y)) {
            context.setState(new YWonState());
        } else {
            context.setState(new XTurnState());
        }
    }

    @Override
    public boolean hasCompleted() {
        return false;
    }
}
