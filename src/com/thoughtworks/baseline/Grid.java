package com.thoughtworks.baseline;

import java.util.Arrays;

//grid holds a 2-D array of cells and return a cell at a particular coordinate
public class Grid {
    char[][] cells;

    public Grid(char[][] cells) {
        this.cells = cells;
    }

    public char cellAt(int x, int y) {
        if (x < 0 || x >= cells.length)
            return ' ';
        if (y < 0 || y >= cells.length)
            return ' ';
        return cells[x][y];
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Grid that = (Grid) obj;
        if (Arrays.deepEquals(that.cells, this.cells))
            return true;
        else
            return false;
    }
}
