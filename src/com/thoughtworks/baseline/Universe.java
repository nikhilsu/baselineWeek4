package com.thoughtworks.baseline;

//Universe holds the grid of cells
public class Universe {
    private Grid grid;

    public Universe(Grid grid) {
        this.grid = grid;
    }

    public Grid getGrid() {
        return grid;
    }
}
