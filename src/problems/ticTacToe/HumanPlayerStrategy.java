package problems.ticTacToe;

import java.util.Scanner;

public class HumanPlayerStrategy implements PlayerStrategy{
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public Position makeMove(Player player){
        //move validation is something that I would like to do in the Board class itself, again that feels like a design
        //challenge like how do you fix that, but I think if I did move validation here, it will tightly couple a Player strategy
        //with Board which I don't want.
        int row, col;
        System.out.println("Enter the row and col of the cell that you want to fill: ");
        row = scanner.nextInt();
        col = scanner.nextInt();

        return new Position(row, col);
    }
}
