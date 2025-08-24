package com.pumadev.cleancode;

import java.util.ArrayList;
import java.util.List;

public class CleanCodeExampleGood {

    // Version Limpia, facil de entender
    public static List<Cell> getFlaggedCells(List<Cell> gameBoard) {
        List<Cell> flaggedCells = new ArrayList<>();
        for (Cell cell : gameBoard) {
            if (cell.isFlagged()) {
                flaggedCells.add(cell);
            }
        }
        return flaggedCells;
    }
}
