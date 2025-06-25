package tictactoe.board;

import tictactoe.symbols.Symbol;

public class Board {
    Symbol[][] grid = new Symbol[3][3];

    public Board() { for (int i = 0; i < 9; i++) {
        grid[i / 3][i % 3] = Symbol.EMPTY;
    }}

    private boolean validMove(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        } return grid[x][y] == Symbol.EMPTY;
    }
    
    public boolean makeMove(int x, int y, Symbol symbol) {
        if (!validMove(x, y)) return false;
        grid[x][y] = symbol; // DisplayBoard
        
        return true;
    }

    public boolean checkWinner() {
        return false;
    }
}
