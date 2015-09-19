package com.thoughtworks.baseline;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldParseTheInputStringAndReturnAGridOfCells() {
        String[] userInput = {"X-", "X-"};
        Parser parser = new Parser(userInput);

        assertEquals(parser.parse().getClass(), Grid.class);
    }

    @Test
    public void shouldReturnAnAppropriateGridObjectHaveCorrect2DArrayOfCells() {
        String[] userInput = {"X-", "X-"};
        Parser parser = new Parser(userInput);
        char[][] cells = {{'X', '-'}, {'X', '-'}};
        Grid grid = new Grid(cells);

        assertEquals(parser.parse(), grid);
    }
}
