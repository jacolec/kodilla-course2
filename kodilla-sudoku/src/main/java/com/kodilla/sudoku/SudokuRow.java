package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private List<SudokuElement> elements;

    public SudokuRow(List<SudokuElement> elements) {
        this.elements = new ArrayList<>();
    }

    public List<SudokuElement> getElements() {
        return elements;
    }

    public void setElements(List<SudokuElement> elements) {
        this.elements = elements;
    }
}
