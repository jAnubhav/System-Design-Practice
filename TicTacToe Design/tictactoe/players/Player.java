package tictactoe.players;

import tictactoe.board.Board;
import tictactoe.symbols.Symbol;

public abstract class Player {
    private String name; private Symbol symbol;

    protected Player(String name, Symbol symbol) {
        this.name = name; this.symbol = symbol;
    }
    
    public abstract boolean makeMove(Board board);

    public String getName() { return name; }
    public Symbol getSymbol() { return symbol; }
}