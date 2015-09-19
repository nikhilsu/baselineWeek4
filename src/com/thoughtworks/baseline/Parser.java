package com.thoughtworks.baseline;
//Parser takes in an array of string input from the user parses and returns a grid of cells
public class Parser {
    private String[] userInput;

    public Parser(String[] userInput) {
        this.userInput = userInput;
    }

    public Grid parse() {
        char [][] cells = new char [userInput.length][];
        for (int i = 0; i < userInput.length; i++) {
            cells[i] = userInput[i].toCharArray();
        }
        return new Grid(cells);
    }
}
