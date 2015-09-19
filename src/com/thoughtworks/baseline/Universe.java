package com.thoughtworks.baseline;

//Universe holds the grid of cells
public class Universe {
    private char [][] grid;

    public Universe(char[][] grid) {
        this.grid = grid;
    }

    public char[][] getGrid() {
        return grid;
    }
}
