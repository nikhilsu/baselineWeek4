package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniverseTest {
    @Test
    public void shouldReturnTheCurrentCellGrid() {
        char [][] grid = {{'X', 'X'}, {'X', 'X'} };
        Universe universe = new Universe(grid);

        assertEquals(grid.getClass(), universe.getGrid().getClass());
    }
}
