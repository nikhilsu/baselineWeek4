package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CellTest {

    @Test
    public void shouldTrueOnIsNeighborCheckIfTheCellsAreHorizontallyNextToEachOther() {
        Cell cellOne = new Cell(0, 1);
        Cell cellTwo = new Cell(0, 2);

        assertTrue(cellOne.isNeighbour(cellTwo));
    }
}
