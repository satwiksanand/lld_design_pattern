package problems.ticTacToe;

public class Position {
    private final int row, col;

    public Position(int row, int col){
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Position other)){
            return false;
        }
        return this.row == other.getRow() && this.col == other.getCol();
    }
}
