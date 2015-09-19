package com.thoughtworks.baseline;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class InputReaderTest {

    ByteArrayInputStream inputStream = new ByteArrayInputStream("2\nX-\nX-\n".getBytes());

    @Before
    public void setIn() {
        System.setIn(inputStream);
    }

    @After
    public void reset() {
        System.setIn(System.in);
    }

    @Test
    public void shouldTakeInAnInputFromTheUserAndReturnTheAppropriateGridOfCells() {
        Scanner scanner = new Scanner(inputStream);
        InputReader inputReader = new InputReader(scanner);

        char [][] grid = {{'X', '-'}, {'X', '-'}};

        assertEquals(inputReader.takeInputFromUser(), grid );
    }
}
