package com.thoughtworks.baseline;

import java.util.Scanner;
//Takes input from the user and returns a grid of cells
public class InputReader {
    private Scanner scanner;

    public InputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public char [][] takeInputFromUser() {
        int size = scanner.nextInt();
        scanner.nextLine();
        char [][] grid = new char[size][size];
        for (int i = 0; i < size ; i++) {
                grid[i] = scanner.nextLine().toCharArray();
        }
        return grid;
    }
}
