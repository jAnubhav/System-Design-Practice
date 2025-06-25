package tictactoe.utils;

import java.util.Scanner;

public class InputScanner {
    private static Scanner scanner;

    public static Scanner getScanner() {
        if (scanner == null) synchronized (InputScanner.class) {
            if (scanner == null) scanner = new Scanner(System.in);
        }

        return scanner;
    }
}
