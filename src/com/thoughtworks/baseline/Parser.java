package com.thoughtworks.baseline;
//Parser takes in an array of string input from the user parses and returns a grid of cells
public class Parser {
    private String[] userInput;

    public Parser(String[] userInput) {
        this.userInput = userInput;
    }

    public Grid parse() {
        char [][] cells = new char [userInput.length][];
        int i = 0;
        for (String inputLine : userInput) {
            inputLine = inputLine.trim();
            inputLine = inputLine.replace("\\s", "");
            cells[i++] = inputLine.toCharArray();
        }
        return new Grid(cells);
    }
}
