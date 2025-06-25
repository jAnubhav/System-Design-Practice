package tictactoe.players.concrete;

import java.util.Scanner;

import tictactoe.board.Board;
import tictactoe.players.Player;
import tictactoe.symbols.Symbol;

import tictactoe.utils.InputScanner;

public class HumanPlayer extends Player {
    public HumanPlayer(String name, Symbol symbol) {
        super(name, symbol);
    }

    @Override public boolean makeMove(Board board) {
        Scanner scanner = InputScanner.getScanner();

        System.out.println(getName() + " is Making a move");
        int x = scanner.nextInt(), y = scanner.nextInt();

        return board.makeMove(x, y, getSymbol());
    }
}
