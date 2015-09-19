package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniverseTest {
    @Test
    public void shouldReturnTheCurrentCellGrid() {
        char [][] cells = {{'X', 'X'}, {'X', 'X'} };
        Grid grid = new Grid(cells);
        Universe universe = new Universe(grid);

        assertEquals(grid.getClass(), universe.getGrid().getClass());
    }
}
