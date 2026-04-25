package problems.ticTacToe;

public class PlayGame {
    private Player playerX;
    private Player playerY;
    private Player currentPlayer;
    private GameContext game;
    private Board board;

    PlayGame() {
        playerX = PlayerFactory.createHumanPlayer(Symbol.X);
        playerY = PlayerFactory.createHumanPlayer(Symbol.Y);
        currentPlayer = playerX;
        board = new Board();
        game = new GameContext(new XTurnState(), board);
    }

    void startGame() {
        while (!game.getCurrentState().hasCompleted()) {
            board.printBoard();
            game.getCurrentState().next(game, currentPlayer);
            if (currentPlayer == playerX) {
                currentPlayer = playerY;
            } else {
                currentPlayer = playerX;
            }
        }
        board.printBoard();
        System.out.println("Game Over!!!");
        if (game.getCurrentState() instanceof DrawState) {
            System.out.println("Game Ended in a Draw!");
        } else if (game.getCurrentState() instanceof XWonState) {
            System.out.println("X Wins!");
        } else {
            System.out.println("Y Wins!");
        }
    }
}
