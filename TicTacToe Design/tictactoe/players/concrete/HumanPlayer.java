package tictactoe.players.concrete;

import tictactoe.board.Board;
import tictactoe.players.Player;
import tictactoe.symbols.Symbol;

import tictactoe.utils.InputScanner;

public class HumanPlayer extends Player {
    public HumanPlayer(String name, Symbol symbol) {
        super(name, symbol);
    }

    @Override public boolean makeMove(Board board) {
        System.out.println(getName() + " is Making a move");
        int v[] = InputScanner.getInput(), x = v[0], y = v[1];

        return board.makeMove(x, y, getSymbol());
    }
}
