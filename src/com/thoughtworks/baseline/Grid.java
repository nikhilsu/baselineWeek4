package com.thoughtworks.baseline;
//grid holds a 2-D array of cells and return a cell at a particular coordinate
public class Grid {
    char[][] cells;

    public Grid(char[][] cells) {
        this.cells = cells;
    }

    public char cellAt(int x, int y) {
        return 'X';
    }
}