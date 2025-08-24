package com.pumadev.cleancode;

import java.util.ArrayList;
import java.util.List;

import static com.pumadev.cleancode.CleanCodeExampleBad.getThem;
import static com.pumadev.cleancode.CleanCodeExampleGood.getFlaggedCells;

public class Main {
    public static void main(String[] args) {
        List<int[]> theList1 = new ArrayList<>();
        theList1.add(new int[]{4, 10});  // 4 = está marcado (flagged), 10 = otro dato
        theList1.add(new int[]{2, 20});  // 2 = no está marcado
        theList1.add(new int[]{4, 30});  // 4 = está marcado

        List<int[]> result1 = getThem(theList1);
        System.out.println("Versión confusa (arreglos):");
        for (int[] arr : result1) {
            System.out.println("[" + arr[0] + ", " + arr[1] + "]");
        }

        // Ejemplo con versión limpia
        List<Cell> theList2 = new ArrayList<>();
        theList2.add(new Cell(true, 10));
        theList2.add(new Cell(false, 20));
        theList2.add(new Cell(true, 30));

        List<Cell> result2 = getFlaggedCells(theList2);
        System.out.println("\nVersión limpia (clase Cell):");
        for (Cell c : result2) {
            System.out.println(c);
        }
    }
}