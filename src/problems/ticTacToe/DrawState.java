package problems.ticTacToe;

public class DrawState implements GameState {
    @Override
    public void next(GameContext context, Player player) {
        // this state cannot move forward.
        return;
    }

    @Override
    public boolean hasCompleted() {
        return true;
    }
}
