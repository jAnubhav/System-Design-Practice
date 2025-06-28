package game.pieces;

import game.board.Board;

import game.pieces.position.Position;
import game.pieces.strategies.Strategy;

public abstract class Piece {
    private State state;
    private Position position;

    private Strategy strategy;

    public Piece(int i, int j, Strategy strategy) {
        this.state = State.Active;
        this.position = new Position(i, j);

        this.strategy = strategy;
    }

    public State getState() {
        return this.state;
    }

    public Position getPosition() {
        return this.position;
    }

    public void declareDead() {
        this.state = State.Dead;
    }

    public boolean move(Board board) {
        return strategy.makeMove(board);
    }
}
