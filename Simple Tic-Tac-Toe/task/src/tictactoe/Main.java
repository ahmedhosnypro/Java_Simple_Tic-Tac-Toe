package tictactoe;

import java.util.Scanner;

import static tictactoe.GridState.state;
import static tictactoe.Move.move;
import static tictactoe.Print.printGrid;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Grid grid = new Grid();
            printGrid(grid);
            while (move(grid)) ;
            printGrid(grid);
        }
    }
}

