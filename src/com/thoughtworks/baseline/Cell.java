package com.thoughtworks.baseline;

public class Cell {
    private int rowPosition;
    private int columnPosition;

    public Cell(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    public boolean isNeighbour(Cell that) {
            return true;
    }
}
