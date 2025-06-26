package tictactoe;

import tictactoe.board.Board;

import tictactoe.players.Player;
import tictactoe.players.concrete.HumanPlayer;
import tictactoe.symbols.Symbol;

public class Game {
    private Player player1, player2, curPlayer; 
    private int moveCounter; private Board board;

    public Game(String name1, String name2) {
        player1 = new HumanPlayer(name1, Symbol.X);
        player2 = new HumanPlayer(name2, Symbol.O);

        curPlayer = player1; board = new Board();
    }

    public void playGame() {
        board.displayBoard(); boolean anyWin = false;

        while (moveCounter < 9) {
            if (!curPlayer.makeMove(board)) continue;

            if (board.checkWinner()) { anyWin = true; break; }
            curPlayer = curPlayer == player1 ? player2 : player1;

            moveCounter++;
        }

        if (!anyWin) System.out.println("The Match is Draw");
        else System.out.println(curPlayer.getName() + " has Won.");
    }
}
