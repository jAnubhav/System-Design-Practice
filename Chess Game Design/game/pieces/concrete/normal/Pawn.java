package game.pieces.concrete.normal;

import game.pieces.Piece;
import game.pieces.strategies.Strategy;

public class Pawn extends Piece {
    public Pawn(int i, int j, Strategy strategy) {
        super(i, j, strategy);
    }
}
