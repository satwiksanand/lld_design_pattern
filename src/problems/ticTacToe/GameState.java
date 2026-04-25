package problems.ticTacToe;

public interface GameState {
    void next(GameContext context, Player player);
    boolean hasCompleted();
}
