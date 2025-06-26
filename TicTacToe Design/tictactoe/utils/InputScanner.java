package tictactoe.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputScanner {
    private static Scanner scanner;

    public static int[] getInput() {
        if (scanner == null) synchronized (InputScanner.class) {
            if (scanner == null) scanner = new Scanner(System.in);
        }

        int input_x = -1, input_y = -1; try {
            input_x = scanner.nextInt(); input_y = scanner.nextInt();
        } catch (InputMismatchException e) {  }

        return new int[]{ input_x, input_y };
    }
}
