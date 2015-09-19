package com.thoughtworks.baseline;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldParseTheInputStringAndReturnAGridOfCells() {
        String[] userInput = {"X -", "X -"};
        Parser parser = new Parser(userInput);

        assertEquals(parser.parse().getClass(), Grid.class);
    }
}
