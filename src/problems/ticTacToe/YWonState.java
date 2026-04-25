package problems.ticTacToe;

public class YWonState implements GameState {
    @Override
    public void next(GameContext context, Player player) {
        // this state also doesn't have a next state;
        return;
    }

    @Override
    public boolean hasCompleted() {
        return true;
    }
}
