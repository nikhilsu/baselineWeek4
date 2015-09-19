package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GridTest {

    @Test
    public void shouldReturnTheCellAtThePositionXY() {
        char[][] cells = {{'X', '-'}, {'X', 'X'}};
        Grid grid = new Grid(cells);

        assertEquals('X', grid.cellAt(1, 1));
    }

    @Test
    public void shouldReturnAnADeadCellWhenThePositionProbedIs0Comma1() {
        char[][] cells = {{'X', '-'}, {'X', 'X'}};
        Grid grid = new Grid(cells);

        assertEquals('-', grid.cellAt(0, 1));
    }

    @Test
    public void shouldReturnNoCellWhenTheProbedRowIndexIsLessThanZero() {
        char[][] cells = {{'X', '-'}, {'X', 'X'}};
        Grid grid = new Grid(cells);

        assertEquals(' ', grid.cellAt(-1, 1));
    }

    @Test
    public void shouldReturnNoCellWhenTheProbedRowIndexIsGreaterThanTheSizeOfThe2DArray() {
        char[][] cells = {{'X', '-'}, {'X', 'X'}};
        Grid grid = new Grid(cells);

        assertEquals(' ', grid.cellAt(2, 1));
    }

    @Test
    public void shouldReturnNoCellWhenTheProbedColumnIndexIsLessThanZero() {
        char[][] cells = {{'X', '-'}, {'X', 'X'}};
        Grid grid = new Grid(cells);

        assertEquals(' ', grid.cellAt(1, -1));
    }

    @Test
    public void shouldReturnNoCellWhenTheProbedColumnIsGreaterThanTheSizeOfThe2DArray() {
        char[][] cells = {{'X', '-'}, {'X', 'X'}};
        Grid grid = new Grid(cells);

        assertEquals(' ', grid.cellAt(1, 2));
    }

    @Test
    public void shouldReturnNoCellWhenTheProbedColumnAndRowIndicesAreLessThanZero() {
        char[][] cells = {{'X', '-'}, {'X', 'X'}};
        Grid grid = new Grid(cells);

        assertEquals(' ', grid.cellAt(-1, -1));
    }

    @Test
    public void shouldReturnNoCellWhenTheProbedColumnAndRowIndicesAreGreaterThanTheLengthOfThe2DArray() {
        char[][] cells = {{'X', '-'}, {'X', 'X'}};
        Grid grid = new Grid(cells);

        assertEquals(' ', grid.cellAt(2, 2));
    }

    @Test
    public void shouldReturnTrueWhenEqualsMethodIsCalledOnItself() {
        char[][] cells = {{'X', '-'}, {'X', 'X'}};
        Grid grid = new Grid(cells);

        assertTrue(grid.equals(grid));
    }
}
