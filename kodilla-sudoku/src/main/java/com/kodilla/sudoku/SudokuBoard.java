package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {

    private List<SudokuRow> rows;

    public SudokuBoard(List<SudokuRow> rows) {
        this.rows = new ArrayList<>();
    }

    public List<SudokuRow> getRows() {
        return rows;
    }

    public void setRows(List<SudokuRow> rows) {
        this.rows = rows;
    }
}
