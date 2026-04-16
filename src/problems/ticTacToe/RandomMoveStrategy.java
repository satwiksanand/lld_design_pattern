package problems.ticTacToe;

import java.util.Random;

public class RandomMoveStrategy implements PlayerStrategy{
    private final Random rand = new Random();

    @Override
    public Position makeMove(Player player){
        return new Position(rand.nextInt(3), rand.nextInt(3));
    }
}
