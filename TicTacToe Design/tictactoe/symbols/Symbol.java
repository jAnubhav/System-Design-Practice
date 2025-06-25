package tictactoe.symbols;

public enum Symbol {
    X('X'), O('O'), EMPTY(' ');
    private final char code;

    Symbol(char code) { this.code = code; }

    public char getCode() { return code; }
}