package problems.ticTacToe;

public class Board {
    private final Symbol[][] mat = new Symbol[3][3];
    int n = 3;
    int totalMoves = 0;

    public Board() {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                mat[i][j] = Symbol.EMPTY;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] == Symbol.EMPTY ? "#" : mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isValidMove(Position pos) {
        return pos.getRow() >= 0
                && pos.getRow() < n
                && pos.getCol() >= 0
                && pos.getCol() < n
                && mat[pos.getRow()][pos.getCol()] == Symbol.EMPTY;
    }

    public boolean makeMove(Position pos, Symbol symbol) {
        // make the move only if it is valid:
        if (!isValidMove(pos)) {
            return false;
        }
        mat[pos.getRow()][pos.getCol()] = symbol;
        totalMoves += 1;
        return true;// we were able to make a move successfully.
    }

    public boolean isDraw() {
        return totalMoves == n * n;
    }

    // have to check if the game has ended in a draw, xwin or owin.
    // before implementing it though i need the state design pattern, because this
    // function will be changing the game states.

    public boolean hasWon(Symbol symbol) {
        // check rows.
        for (int i = 0; i < n; ++i) {
            boolean flag = true;
            for (int j = 0; j < n; ++j) {
                if (mat[i][j] != symbol) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        // check columns
        for (int j = 0; j < n; ++j) {
            boolean flag = true;
            for (int i = 0; i < n; ++i) {
                if (mat[i][j] != symbol) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        // check diagonals.
        // main diagonal:
        boolean flag = true;
        for (int i = 0; i < n; ++i) {
            if (mat[i][i] != symbol) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return true;
        }
        // anti-diagonal:
        flag = true;
        for (int i = 0; i < n; ++i) {
            if (mat[i][n - 1 - i] != symbol) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
