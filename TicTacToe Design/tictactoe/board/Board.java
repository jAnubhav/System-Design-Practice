package tictactoe.board;

import tictactoe.symbols.Symbol;

public class Board {
    Symbol[][] grid = new Symbol[3][3];

    public Board() {
        for (int i = 0; i < 9; i++) {
            grid[i / 3][i % 3] = Symbol.EMPTY;
        }
    }

    private boolean validMove(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        } return grid[x][y] == Symbol.EMPTY;
    }

    public boolean makeMove(int x, int y, Symbol symbol) {
        if (!validMove(x, y)) {
            System.out.println("Invalid Move");
            return false;
        }

        grid[x][y] = symbol; displayBoard();
        return true;
    }

    public void displayBoard() {
        System.out.println("\n\n");

        for (int row = 0; row < 3; row++) {
            System.out.println(" --- --- ---");

            for (int col = 0; col < 3; col++) {
                System.out.print("| " + grid[row][col].getCode() + " ");
            }

            System.out.println("|");
        }

        System.out.println(" --- --- ---\n\n");
    }

    public boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] != Symbol.EMPTY && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) return true;
            if (grid[0][i] != Symbol.EMPTY && grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) return true;
        }

        if (grid[0][0] != Symbol.EMPTY && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) return true;
        if (grid[0][2] != Symbol.EMPTY && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) return true;

        return false;
    }
}
