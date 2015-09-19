package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GridTest {

    @Test
    public void shouldReturnTheCellAtThePositionXY() {
        char[][] cells = {{'X', '-'}, {'X', 'X'}};
        Grid grid = new Grid(cells);

        assertEquals('X', grid.cellAt(2, 2));
    }
}
