package tictactoe;

import static tictactoe.GridState.state;
import static tictactoe.Print.printGrid;
import static tictactoe.Move.move;

public class Fight {
    static void startFight() {
        Grid grid = new Grid();
        printGrid(grid);
        OuterFor: for (int i = 0; i < 9; i++) {
            switch (state(grid)) {
                case "X wins":
                    System.out.println("X wins");
                    break OuterFor;
                case "O wins":
                    System.out.println("O wins");
                    break OuterFor;
                case "Draw":
                    System.out.println("Draw");
                    break OuterFor;
                default:
                    char XO = ' ';
                    if (i % 2 == 0) {
                        XO = 'X';
                    } else {
                        XO = 'O';
                    }
                    while (move(grid, XO));
                    printGrid(grid);
            }
        }
        System.out.println(state(grid));
    }
}
