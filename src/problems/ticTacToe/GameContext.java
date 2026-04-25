package problems.ticTacToe;

public class GameContext {
    private GameState state;
    private final Board board;

    public GameContext(GameState state, Board board) {
        this.state = state;
        this.board = board;
    }

    public void setState(GameState state) {
        this.state = state;
    }

    public Board getBoard() {
        return board;
    }

    public GameState getCurrentState() {
        return state;
    }
}
