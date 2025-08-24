package com.pumadev.cleancode;

public class Cell {
    private boolean flagged;
    private int value;

    public Cell(boolean flagged, int value) {
        this.flagged = flagged;
        this.value = value;
    }

    public boolean isFlagged() {
        return flagged;
    }

    @Override
    public String toString() {
        return "Cell(flagged=" + flagged + ", value=" + value + ")";
    }
}
